package kr.or.connect.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//설정 클래스를 따로 만들 수 있다.
@Import({DBConfig.class})
public class ApplicationConfig {

}
