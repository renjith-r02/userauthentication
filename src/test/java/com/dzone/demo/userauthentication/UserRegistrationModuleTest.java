package com.dzone.demo.userauthentication;

import com.dzone.demo.userauthentication.userregistration.domain.UserRegistrationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ApplicationModuleTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, mode = ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
@AutoConfigureMockMvc
public class UserRegistrationModuleTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    UserRegistrationService userRegistrationService;

    @Test
    void shouldRegisterUserSuccessfully() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                    "username": "testuser",
                                    "password": "password123",
                                    "email": "testuser@example.com",
                                    "firstName": "Test",
                                    "lastName": "User"
                                }
                                """))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }


}