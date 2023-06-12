package zysy.iflytek;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zysy.iflytek.**.mapper")
public class CourseJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseJspApplication.class, args);
    }

}
