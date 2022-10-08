package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam04 {
  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig02.class);

    // (Car) -- Car.class로 받으니까 변환해줄 필요는 없다.
    Car car = ac.getBean(Car.class);
    car.run();
  }

}
