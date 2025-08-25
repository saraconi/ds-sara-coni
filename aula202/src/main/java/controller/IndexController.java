package controller;

import org.springframework.stereotype.Controller ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("name", "Mundo");
                return "index";
    }

}
