package cn.king.controller;

import cn.king.pojo.Student;
import cn.king.pojo.User;
import cn.king.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUSer() {
        return userService.getAllUser();
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent() {
        return userService.getStudentAll();
    }

    @PostMapping("login")
    public User login(@RequestBody User user, HttpSession session) {
        log.info("login: {}", user);
        System.out.println("有请求进入？】！！！！！！");
        User login = userService.login(user);
        if (login == null) {
            return null;
        } else {
            session.setAttribute("loginUser", login);
            return login;
        }
    }

}
