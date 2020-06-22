package com.twschool.practice.domain.api;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.http.MediaType;import org.springframework.test.context.junit4.SpringRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.result.MockMvcResultMatchers;@SpringBootTest@RunWith(SpringRunner.class)@AutoConfigureMockMvcpublic class GameControllerTest {    @Autowired    private MockMvc mockMvc;    @Test    public void should_return_guess_result_when_guess_number() throws Exception {        mockMvc.perform(MockMvcRequestBuilders.post("/game/guess-numbers")                .contentType(MediaType.APPLICATION_JSON).content("{\"number\":\"1 2 3 4\"}"))                .andExpect(MockMvcResultMatchers.status().isOk())                .andExpect(MockMvcResultMatchers.jsonPath("$.input").value("1 2 3 4"))                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value("4A0B"));    }    @Test    public void should_return_hostory() {        try {            mockMvc.perform(MockMvcRequestBuilders.get("/history")                    .contentType(MediaType.APPLICATION_JSON))                    .andExpect(MockMvcResultMatchers.status().isOk())                    .andExpect(MockMvcResultMatchers.jsonPath("$.result").value("Input:1 2 3 4    Output:4A0B"));        } catch (Exception e) {            e.printStackTrace();        }    }}