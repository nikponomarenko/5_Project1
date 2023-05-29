package com.example.sitewithspring.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainPage {

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("id", "mainPage");
        return "mainPage";
    }

    @GetMapping("/review")
    public String review(Model model) {
        model.addAttribute("id", "review");
        return "review";
    }

    @GetMapping("/new_review")
    public String newReview(Model model) {
        model.addAttribute("id", "new_review");
        return "new_review";
    }

    @GetMapping("/new_service")
    public String newService(Model model) {
        model.addAttribute("id", "new_service");
        return "new_service";
    }

    @GetMapping("/not_verified")
    public String notVerified(Model model) {
        model.addAttribute("id", "not_verified");
        return "not_verified";
    }

    @GetMapping("/reg")
    public String regPage(Model model) {
        model.addAttribute("id", "registration");
        return "registration";
    }

    @GetMapping("/enter")
    public String enterPage(Model model) {
        model.addAttribute("id", "signIn");
        return "signIn";
    }

    @GetMapping("/service")
    public String servicePage(Model model) {
        model.addAttribute("id", "service");
        return "service";
    }

    @GetMapping("/services")
    public String servicesPage(Model model) {
        model.addAttribute("id", "services");
        return "services";
    }

    @GetMapping("/aboutMe")
    public String aboutMePage(Model model) {
        model.addAttribute("id", "aboutMe");
        return "aboutMe";
    }

    @PostMapping("/reg")
    public String getLogin(@RequestParam("name") String name,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password) {
        System.out.println(name + " " + email + " " + password);
        return "services";
    }

    @PostMapping("/enter")
    public String enter(@RequestParam("email") String email, @RequestParam("password") String password) {
        System.out.println(email + " " + password);
        return "services";
    }

}
