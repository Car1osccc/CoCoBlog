package cn.coco;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.coco.mapper")
public class CocoBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(CocoBlogApplication.class,args);

    }
}