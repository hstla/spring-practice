package org.edwith.webbe;

import org.edwith.webbe.calculatorcli.ApplicationConfig;
import org.edwith.webbe.calculatorcli.CalculatorService;
import org.edwith.webbe.calculatorcli.MyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;


//MockitoJUnitRunner 으로 mockito 테스트 클래스 실행
@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {
  @InjectMocks
  MyService myService;

  // calculatorService가 목 객체를 참조하도록 한다.
  @Mock
  CalculatorService calculatorService;

  @Test
  public void execute() throws Exception {
    int v1 = 5;
    int v2 = 10;
    //given() static 메소드이다.
    given(calculatorService.plus(5, 10)).willReturn(15);

    int result = myService.execute(v1, v2);

    // verify는 calclatorService.plus 가 호출되면 true, 아니면 오류를 발생시킨다.
    verify(calculatorService).plus(anyInt(), anyInt());
    Assert.assertEquals(30, result);
  }
}
