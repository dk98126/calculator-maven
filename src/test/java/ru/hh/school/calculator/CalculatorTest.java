package ru.hh.school.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private final Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
    int result = calculator.calculate(1, Operation.PLUS, 1);
    assertEquals(2, result);
  }

  @Test
  public void testMinus() {
    int result = calculator.calculate(1, Operation.MINUS, 1);
    assertEquals(0, result);
  }

  @Test
  public void testMultiply() {
    int result = calculator.calculate(2, Operation.MULTIPLY, 2);
    assertEquals(4, result);
  }

  @Test
  public void testDivide() {
    int result = calculator.calculate(2, Operation.DIVIDE, 2);
    assertEquals(1, result);
  }
}
