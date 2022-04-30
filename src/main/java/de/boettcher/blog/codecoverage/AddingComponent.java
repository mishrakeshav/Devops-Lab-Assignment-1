package de.boettcher.blog.codecoverage;

public class AddingComponent {

  public int add(Integer number1, Integer number2) {
    if (number1 == null) {
      if (number2 == null) {
        return 0;
      }

      return number2;
    } else {
      if (number2 == null) {
        return number1;
      }
    }

    return number1 + number2;
  }


}
