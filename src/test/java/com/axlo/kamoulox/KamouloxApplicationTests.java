package com.axlo.kamoulox;

import com.axlo.kamoulox.restservice.KamouloxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(KamouloxController.class)
class KamouloxApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getRandomSentence() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/kamoulox"))
            .andExpect(status().isOk())
            .andDo(MockMvcResultHandlers.print());


    }



}
