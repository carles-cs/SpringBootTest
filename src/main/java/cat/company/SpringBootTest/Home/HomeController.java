package cat.company.SpringBootTest.Home;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String Home(Model model, @RequestParam(name = "name", required = false) String name,
            @AuthenticationPrincipal OAuth2User oAuth2User) {
        if (name == null&&oAuth2User!=null) {
            model.addAttribute("name", oAuth2User.getAttribute("name")+ " ("+oAuth2User.getAttribute("email")+")");
        } else {
            model.addAttribute("name", name);
        }
        model.addAttribute("loggedin", oAuth2User!=null);
        return "home";
    }
}
