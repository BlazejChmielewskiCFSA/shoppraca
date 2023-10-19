package pl.testing.naukaw.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.testing.naukaw.repo.UserRepo;


@Primary
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepo userRepo;

    @Autowired
    public UserDetailsServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findAllByUsername(username);
    }
}
