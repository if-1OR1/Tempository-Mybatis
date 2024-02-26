package org.teamOne.tempository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan()
public class TempositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TempositoryApplication.class, args);

    }

}
