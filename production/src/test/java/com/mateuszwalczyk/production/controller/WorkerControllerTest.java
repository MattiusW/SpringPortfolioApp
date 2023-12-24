package com.mateuszwalczyk.production.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mateuszwalczyk.production.model.Worker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@AutoConfigureMockMvc
public class WorkerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testCreateWorker() throws Exception{

        // Create test object
        Worker worker = new Worker.WorkerBuilder()
                .setId(1L)
                .setName("TestWorker")
                .setAbility("tester")
                .setPayment(new BigDecimal(1000.00).setScale(2, RoundingMode.HALF_UP))
                .setLevel(1)
                .buildWorker();

        // Convert object to JSON
        ObjectMapper objectMapper = new ObjectMapper();

        String workerJson = objectMapper.writeValueAsString(worker);


        // Test controller POST
        ResultActions result = mockMvc.perform(post("/post/worker")
                .contentType(MediaType.APPLICATION_JSON)
                .content(workerJson));

        // Check if status is 200
        result.andExpect(status().isOk());

    }

    @Test
    public void testGetAllWorkers() throws Exception{

        //Get method
        ResultActions result = mockMvc.perform(get("/worker/all")
                .contentType(MediaType.APPLICATION_JSON));

        //Check is status 200 and anserw JSON is list worker
        result.andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());

    }

}
