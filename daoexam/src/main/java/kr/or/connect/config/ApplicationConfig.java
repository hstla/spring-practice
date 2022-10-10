package kr.or.connect.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//설정 클래스를 따로 만들 수 있다.
@Import({DBConfig.class})
@ComponentScan(basePackages = { "kr.or.connect.daoexam.dao" })
public class ApplicationConfig {


}
