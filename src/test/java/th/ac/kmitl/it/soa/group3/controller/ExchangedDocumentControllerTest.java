package th.ac.kmitl.it.soa.group3.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ExchangedDocumentControllerTest {

    private String requestBody = "{}";

    static private MockMvc mockMvc;

    @InjectMocks
    private static ExchangedDocumentController exchangedDocumentController = new ExchangedDocumentController();

    @BeforeAll
    static void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(exchangedDocumentController).build();
    }

    @Test
    void shouldRequestAndGetXmlResponse() throws Exception {
        mockMvc.perform(post("/exchangeddoc")
                .accept(MediaType.APPLICATION_XML)
                .content(requestBody)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_XML));
    }
}
