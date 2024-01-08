package com.springbook.tobyspringexample;

import com.springbook.user.dao.UserDao;
import com.springbook.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class TobySpringExampleApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpringApplication.run(TobySpringExampleApplication.class, args);
    }

}
