package io.github.underscore11code.compsci;

public class PackageCheck implements Runnable {
  @Override
  public void run() {
    final int packageWeight = Main.promptInt("package weight (Kg)");
    final int packageLength = Main.promptInt("package length (cm)");
    final int packageWidth = Main.promptInt("package width (cm)");
    final int packageHeight = Main.promptInt("package height (cm)");
    final int volume = packageLength * packageWidth * packageHeight;

    String out = "";

    if (packageWeight > 27) out += "Too heavy";
    if (volume >= 100000) out += (out.length() == 0 ? "T" : " and t") + "oo large";
    System.out.println(out);
  }
}
