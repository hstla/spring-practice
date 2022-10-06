package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AplicationContextExam01 {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext(
        "classpath:applicationContext.xml"
    );
    System.out.println("초기화 완료.");

    UserBean userBean = (UserBean) ac.getBean("userBean");
    userBean.setName("HWAGN");
    System.out.println(userBean.getName());

    //싱글톤 패턴이기 때문에 인스턴스를 여러번 생성해도 같은 인스턴스가 생성된다.
    UserBean userBean2 = (UserBean) ac.getBean("userBean");
    if (userBean == userBean2) {
      System.out.println("같은 인스턴스이다.");
    }
  }
}
