package com.example.kotlintest;
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@WebMvcTest
class HelloControllerTest(@Autowired val mockMvc: MockMvc) {


 @Test
    fun `hello with or with name success`() {

        mockMvc.perform(get("/?name=zac"))
        .andExpect(status().isOk)
    }

@Test
    fun `Bad URL should fail not found condition`() {

            mockMvc.perform(get("/badurl?name=zac"))
            .andExpect(status().isNotFound)
        }

    }
