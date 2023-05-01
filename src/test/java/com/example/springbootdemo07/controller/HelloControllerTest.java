package com.example.springbootdemo07.controller;

import com.example.springbootdemo07.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: HelloControllerTest
 * Package: com.example.springbootdemo07.controller
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
@SpringBootTest
//@RunWith(SpringRunner.class)
//@WebMvcTest(HelloController.class)
class HelloControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
    @Autowired
    private UserService userService;
    @Test
    public void findTwo(){
        System.out.println(userService.findOne());
        System.out.println();
    }
//    @Test
//    public void findOne() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/hello").contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk()).andDo(print());
//    }
}