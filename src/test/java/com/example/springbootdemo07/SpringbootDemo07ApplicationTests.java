package com.example.springbootdemo07;

import com.example.springbootdemo07.mapper.TbBookMapper;
import com.example.springbootdemo07.pojo.TbBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDemo07ApplicationTests {
    @Autowired
    public TbBookMapper tbBookMapper;

    @Test
    void contextLoads() {
        List<TbBook> tbBooks = tbBookMapper.selectAll();
        for (TbBook tbBook : tbBooks) {
            System.out.println(tbBook);
        }
    }

}
