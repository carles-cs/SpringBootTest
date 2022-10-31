package cat.company.SpringBootTest.Api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ValuesControllerTests {

    @Autowired
	private MockMvc mockMvc;

    @Test
    void PeopleReturnsPeople() throws Exception{
        this.mockMvc.perform(get("/api/values/people")).andExpect(status().isOk());
    }
}
