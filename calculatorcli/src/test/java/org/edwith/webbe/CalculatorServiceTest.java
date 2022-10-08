package org.edwith.webbe;

import org.edwith.webbe.calculatorcli.CalculatorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorServiceTest {
  CalculatorService calculatorService;
  int v1 = 10;
  int v2 = 5;

  @Before
  public void init(){
    this.calculatorService = new CalculatorService();

  }

  @Test
  public void plus() throws Exception {

    int result = calculatorService.plus(v1, v2);

    Assert.assertEquals(15, result);
//    Assert.assertEquals(16, result);
  }

  @Test
  public void divide() throws Exception {

    int result = calculatorService.divide(v1, v2);

    Assert.assertEquals(2, result);
  }

  @Test
  public void divideExcepptionTest() throws Exception {
    v2 = 0;
    try {
      calculatorService.divide(v1,v2);
    } catch (ArithmeticException ae) {
      Assert.assertTrue(true);
      return;
    }
//    Assert.assertFail();
  }


}
