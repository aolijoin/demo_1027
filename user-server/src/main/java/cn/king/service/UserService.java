package cn.king.service;

import cn.king.pojo.Student;
import cn.king.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    List<Student> getStudentAll();

    User login(User user);
}
