package org.example.springbootmybatisquickstart;

import org.example.springbootmybatisquickstart.mapper.UserMapper;
import org.example.springbootmybatisquickstart.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper usermapper;

    @Test
    public void testListUser() {
        List<User> userList = usermapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });

    }

}
