package primeirasClasses;

public class Triangulo {
  double ladoA;
  double ladoB;
  double ladoC;

  public Triangulo(double lado) {
    this.ladoA = lado;
    this.ladoB = lado;
    this.ladoC = lado;
  }

  public Triangulo(double a, double b, double c) {
    this.ladoA = a;
    this.ladoB = b;
    this.ladoC = c;

  }

  @Override
  public String toString() {
    return String.format("a: %.2f\n b: %.2f\n c: %.2f", this.ladoA, this.ladoB, this.ladoC);
  }

  public static void main(String[] args) {
    Triangulo trianIsoceles = new Triangulo(5);
    Triangulo trianEscaleno = new Triangulo(3, 25, 26);
    System.out.println(trianIsoceles);
    System.out.println(trianEscaleno);
  }

}
