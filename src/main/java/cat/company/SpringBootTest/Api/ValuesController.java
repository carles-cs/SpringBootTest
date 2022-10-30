package cat.company.SpringBootTest.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values")
public class ValuesController {
    @GetMapping("/people")
    public Person[] getPeople(){
        return new Person[]{
            new Person("Carles","Company Soler"),
            new Person("Test1", "Test2")
        };
    }
}
