package th.ac.kmitl.it.soa.group3.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class ExampleXmlControllerTest {

    static private MockMvc mockMvc;

    @InjectMocks
    private static ExampleXmlController exampleXmlController = new ExampleXmlController();

    @BeforeAll
    static void init() {

        mockMvc = MockMvcBuilders.standaloneSetup(exampleXmlController).build();
    }

    @Test
    void shouldRequestAndGetXmlResponse() throws Exception {

        mockMvc.perform(get("/examplexml")
                .contentType(MediaType.APPLICATION_XML))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_XML));
    }
}