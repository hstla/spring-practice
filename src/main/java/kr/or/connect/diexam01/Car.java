package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {
  // autowired - engine타입 객체가 생성되면 알아서 get,set을 만들어 준다.
  @Autowired
  Engine v8;

  public Car() {
    System.out.println("차 생성자");
  }

  public void setV8(Engine v8) {this.v8 = v8;}

  public void run() {
    System.out.println("엔진을 이용하여 달립니다.");
    v8.exec();
  }

//  public static void main(String[] args) {
//    Engine en = new Engine();
//    Car car = new Car();
//    car.setEngine(en);
//    car.run();
//  }
}
