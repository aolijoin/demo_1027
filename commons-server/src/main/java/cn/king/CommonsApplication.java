package cn.king;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CommonsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonsApplication.class, args);
        log.info("commons-server 启动成功");
    }
}
