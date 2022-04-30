package de.boettcher.blog.codecoverage;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;

public class AddingComponentTest {

  @Test
  public void addWhen1And1Then2() {
    Integer number1 = 1;
    Integer number2 = 1;

    AddingComponent addingComponent = new AddingComponent();
    int result = addingComponent.add(number1, number2);

    assertThat(result).isEqualTo(2);
  }

  @Test
  public void addWhen1AndNullThen1() {
    Integer number1 = 1;
    Integer number2 = null;

    AddingComponent addingComponent = new AddingComponent();
    int result = addingComponent.add(number1, number2);

    assertThat(result).isEqualTo(1);
  }
}