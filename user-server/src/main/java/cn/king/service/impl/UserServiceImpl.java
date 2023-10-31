package cn.king.service.impl;

import cn.king.mapper.UserMapper;
import cn.king.pojo.Student;
import cn.king.pojo.User;
import cn.king.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RestTemplate restTemplate;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }

    @Override
    public List<Student> getStudentAll() {
        List<Student> entity = restTemplate.getForObject("http://student/student/getAll", List.class);
        return entity;
    }

    @Override
    public User login(User user) {
        LambdaQueryWrapper<User> wq = new LambdaQueryWrapper<>();
        wq.eq(User::getUsername, user.getUsername());
        wq.eq(User::getPassword, user.getPassword());
        User user1 = userMapper.selectOne(wq);
        return user1;
    }
}
