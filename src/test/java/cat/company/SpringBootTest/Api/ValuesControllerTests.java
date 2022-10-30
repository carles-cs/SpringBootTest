package cat.company.SpringBootTest.Api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValuesControllerTests {

    @Autowired
    private ValuesController valuesController;

    @Test
    void ValuesControllerIsNotNull(){
        assertNotNull(valuesController);
    }

    @Test
    void PeopleReturnsPeople(){
        var people=valuesController.getPeople();
        assertEquals(2, people.length);
    }
}
