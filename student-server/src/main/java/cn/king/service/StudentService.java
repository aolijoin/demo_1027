package cn.king.service;

import cn.king.pojo.Student;
import cn.king.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface StudentService {
    PageInfo getAllUser(Student student);

    boolean addStudent(Student student);

    boolean deleteStudent(Integer id);

    boolean updateStudent(Student student);
}
