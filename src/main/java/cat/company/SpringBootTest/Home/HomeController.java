package cat.company.SpringBootTest.Home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    public String Home(Model model,@RequestParam(name = "name",defaultValue = "world")String name){
        model.addAttribute("name", name);
        return "home";
    }
}
