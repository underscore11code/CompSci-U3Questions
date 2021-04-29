package io.github.underscore11code.compsci;

import java.text.NumberFormat;

public class Printing implements Runnable {
  @Override
  public void run() {
    final int copies = Main.promptInt("the number of copies to be printed");

    float price;

    if (copies >= 1000) price = 0.25f;
    else if (copies >= 750) price = 0.26f;
    else if (copies >= 500) price = 0.27f;
    else if (copies >= 100) price = 0.28f;
    else price = 0.30f;

    final NumberFormat format = NumberFormat.getCurrencyInstance();
    System.out.printf("Price per copy: %s\nTotal Cost: %s", format.format(price), format.format(price * copies));
  }
}
