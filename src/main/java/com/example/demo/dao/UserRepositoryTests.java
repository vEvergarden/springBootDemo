package com.example.demo.dao;

import com.example.demo.Application;
import com.example.demo.DemoApplication;
import com.example.demo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= DemoApplication.class)
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception{
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User("dainty4","dd1234","dainty4@hxy.com","d78",formattedDate));
        userRepository.save(new User("aa567","aa1233","aa567@hxy.com","aa09",formattedDate));

        Assert.assertEquals(4,userRepository.findAll().size());
        Assert.assertEquals("dainty",userRepository.findByUserName("dainty").getNickName());
        userRepository.delete(userRepository.findByUserName("aa"));

    }

}