package pl.testing.naukaw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.testing.naukaw.entity.User;
import pl.testing.naukaw.entity.VerificationToken;
import pl.testing.naukaw.repo.UserRepo;
import pl.testing.naukaw.repo.VerificationTokenRepo;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Service
public class UserService {

    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;
    private VerificationTokenRepo verificationTokenRepo;
    private MailSenderService mailSenderService;

    @Autowired
    public UserService(UserRepo userRepo, PasswordEncoder passwordEncoder, VerificationTokenRepo verificationTokenRepo, MailSenderService mailSenderService) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.verificationTokenRepo = verificationTokenRepo;
        this.mailSenderService = mailSenderService;
    }

    public void addNewUser(User user, HttpServletRequest request) throws MessagingException {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);

        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken(token,user);
        verificationTokenRepo.save(verificationToken);

        String URL = "http://" +
                request.getServerName() + ":" +
                request.getServerPort() +
                request.getContextPath() +
                "/verify-token?token=" + token;

        mailSenderService.sendMail(
                user.getUsername(),
                "Verification Token",
                URL,
                false);
    }

    public void verifyToken(String token){
        User user = verificationTokenRepo.findByToken(token).getUser();
        user.setEnable(true);
        userRepo.save(user);
    }
}
