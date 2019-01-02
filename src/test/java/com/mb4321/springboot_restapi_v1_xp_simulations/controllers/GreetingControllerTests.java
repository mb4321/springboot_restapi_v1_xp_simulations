package com.mb4321.springboot_restapi_v1_xp_simulations.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(MockitoJUnitRunner.class)
public class GreetingControllerTests {

    @InjectMocks
    private GreetingController controller;

    private MockMvc mockMvc;

    @Before
    public void setUpMockMvc() {
        mockMvc = standaloneSetup(controller)
                .defaultRequest(get("/"))
                .build();
    }

    @Test
    public void GreetingController_Returns200Success_and_HelloWorld_as_json() throws  Exception {

        mockMvc.perform(get("/api/v1/getgreeting"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("World Name")))
                .andExpect(jsonPath("$.text", is("Hello World!!!")));
    }

}
