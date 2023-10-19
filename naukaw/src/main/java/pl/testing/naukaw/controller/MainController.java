package pl.testing.naukaw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.testing.naukaw.entity.User;
import pl.testing.naukaw.service.UserService;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    private UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }

    @RequestMapping("/signup")
    public ModelAndView signup() {
        return new ModelAndView("registration", "user", new User());
    }

    @RequestMapping("/register")
    public ModelAndView getRegister(User user, HttpServletRequest request) throws MessagingException {
        userService.addNewUser(user, request);
        return new ModelAndView("redirect:/login");
    }

    @RequestMapping("/verify-token")
    public String getRegister(@RequestParam String token) {
        userService.verifyToken(token);
        return "redirect:/login";
    }
}
