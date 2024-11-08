package ru.hh.school.calculator;

public class Calculator {
  public int calculate(int a, Operation operation, int b) {
    return switch (operation) {
      case PLUS -> a + b;
      case MINUS -> a - b;
      case MULTIPLY -> a * b;
      case DIVIDE -> a / b;
    };
  }
}
