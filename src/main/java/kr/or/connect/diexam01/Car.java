package kr.or.connect.diexam01;

public class Car {
  Engine v8;

  public Car() {
    System.out.println("차 생성자");
  }

  public void setEngine(Engine e) {
    this.v8 = e;
  }

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
