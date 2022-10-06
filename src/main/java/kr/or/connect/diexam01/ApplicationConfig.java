package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//spring 설정 클래스라는 의미를 가지는 어노테이션
@Configuration
public class ApplicationConfig {
  @Bean
  public Car c(Engine e) {
    Car c = new Car();
    c.setEngine(e);
    return c;
  }

  @Bean
  public Engine engine() {
    return new Engine();
  }
}
