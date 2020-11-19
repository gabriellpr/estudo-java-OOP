package primeirasClasses;

public class MetodoSobrecarga {
  static int mult(int a, int b) {
    return a * b;
  }

  static double mult(double a, double b) {
    return a * b;
  }

  static double mult(double a, double b, double c) {
    return a * b * c;
  }

  public static void main(String[] args) {
    System.out.println("Multi: " + MetodoSobrecarga.mult(3, 3));
    System.out.println("Multipl: " + MetodoSobrecarga.mult(3.2, 3.1));
    System.out.println("Multil: " + MetodoSobrecarga.mult(1.4, 3));
    System.out.println("Multt: " + MetodoSobrecarga.mult(5.2, 3.2, 4));
  }
}
