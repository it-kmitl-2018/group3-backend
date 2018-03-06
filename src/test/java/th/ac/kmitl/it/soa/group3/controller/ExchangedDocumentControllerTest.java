package th.ac.kmitl.it.soa.group3.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ExchangedDocumentControllerTest {

    static private MockMvc mockMvc;

    @InjectMocks
    private static ExchangedDocumentController exchangedDocumentController = new ExchangedDocumentController();

    @BeforeAll
    static void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(exchangedDocumentController).build();
    }

    @Test
    void shouldRequestAndGetXmlResponse() throws Exception {
        mockMvc.perform(get("/exchangeddoc")
                .contentType(MediaType.APPLICATION_XML))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_XML));
    }
}
