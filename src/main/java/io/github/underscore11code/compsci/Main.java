package io.github.underscore11code.compsci;

import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    new PackageCheck().run();
    new Printing().run();
  }

  public static int promptInt(final String prompt) {
    while (true) {
      System.out.print("Please enter " + prompt + ": ");
      final String line = scanner.nextLine();
      try {
        return Integer.parseInt(line);
      } catch (NumberFormatException e) {
        System.out.println("Invalid input.");
      }
    }
  }
}
