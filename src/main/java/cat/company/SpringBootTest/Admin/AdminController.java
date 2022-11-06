package cat.company.SpringBootTest.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
    @GetMapping()
    public String Index(Model model){
        return "admin-index";
    }
}
