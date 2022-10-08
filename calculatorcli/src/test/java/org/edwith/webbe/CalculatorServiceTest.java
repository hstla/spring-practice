package org.edwith.webbe;

import org.edwith.webbe.calculatorcli.ApplicationConfig;
import org.edwith.webbe.calculatorcli.CalculatorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*RunWith == JUnit이 제공하는 어노테이션으로 JUnit은 확장기능을 가지는데,
스프링에서는 JUnit을 확장하도록 SpringJUnit4ClassRunner.class를 제공합니다.
해당 코드는 JUnit이 테스트 코드를 실행할 때 스프링 빈 컨테이너가 내부적으로 생성되도록 합니다.*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class CalculatorServiceTest {

  /*Autowired = CalcultorServiceTest 클래스가 빈으로 관리되면서,
   스프링 빈 컨테이너는 CalculatorService를
  주입(Inject)할 수 있게 됩니다. 이렇게 주입된 클래스를 테스트하면 됩니다.*/
  @Autowired
  CalculatorService calculatorService;

  @Test
  public void plus() throws Exception {
    int value1 =  10;
    int value2 = 5;

    // when
    int result = calculatorService.plus(value1, value2);

    // then
    Assert.assertEquals(result, 15); // 결과와 15가 같을 경우에만 성공
  }

  @Test
  public void divide() throws Exception{
    // given
    int value1 = 10;
    int value2 = 5;

    // when
    int result = calculatorService.divide(value1, value2);

    // then
    Assert.assertEquals(result, 2); // 결과와 15가 같을 경우에만 성공
  }

  @Test
  public void divideExceptionTest() throws Exception{
    // given
    int value1 = 10;
    int value2 = 0;

    try {
      calculatorService.divide(value1, value2);
    }catch (ArithmeticException ae){
      Assert.assertTrue(true); // 이부분이 실행되었다면 성공
      return; // 메소드를 더이상 실행하지 않는다.
    }

    Assert.assertTrue(false); // 이부분이 실행되면 무조건 실패다.
  }
}