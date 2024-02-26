package org.teamOne.tempository.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages  = "org.teamOne.tempository", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
