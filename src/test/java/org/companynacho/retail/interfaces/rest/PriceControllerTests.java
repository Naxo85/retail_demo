package org.companynacho.retail.interfaces.rest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
    @Test
    public void testRequestAt10AMOnDay14() throws Exception {
    	this.mockMvc.perform(MockMvcRequestBuilders
                .get("/prices?date=2020-06-14T10:00:00&productId=35455&brandId=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(35.50));
    }
    
    @Test
    public void testRequestAt16PMOnDay14() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/prices?date=2020-06-14T16:00:00&productId=35455&brandId=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(25.45));
    }
    
    @Test
    public void testRequestAt21PMOnDay14() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/prices?date=2020-06-14T21:00:00&productId=35455&brandId=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(35.50));
    }

    @Test
    public void testRequestAt10AMOnDay15() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/prices?date=2020-06-15T10:00:00&productId=35455&brandId=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(30.50));
    }

    @Test
    public void testRequestAt21PMOnDay16() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .get("/prices?date=2020-06-16T21:00:00&productId=35455&brandId=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(38.95));
    }

}
