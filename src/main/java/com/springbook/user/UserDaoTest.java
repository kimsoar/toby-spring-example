package com.springbook.user;

import com.springbook.user.dao.UserDao;
import com.springbook.user.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        // xml 파일을 클래스패스에서 가져올 때 사용 할 수 있다. 일반적으로는 GenericXmlApplicationContext가 무난.
        ApplicationContext context = new ClassPathXmlApplicationContext("daoContext.xml", UserDao.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}
