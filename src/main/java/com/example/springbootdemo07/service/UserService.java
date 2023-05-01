package com.example.springbootdemo07.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserService
 * Package: com.example.springbootdemo07.service
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
@Service
public class UserService {
    @Value("${jwt.password}")
    private Integer jwt;
    public String findOne(){
        return "yes"+jwt;
    }
}
