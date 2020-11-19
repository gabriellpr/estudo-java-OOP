package primeirasClasses;

public class Robo1 {
  String nome;
  String cor;
  float velocidadeMax;
  float pesoCargMax;
  int nivelBateriaAtual;
  boolean temAntena;
  float positionX = 50;
  float positionY = 50;

  public void move(int x, int y) {
    positionX = x;
    positionY = y;
  }

  public void printStatus() {
    System.out.println("Meu nome: " + nome);
    System.out.println("Cor robo: " + cor);
    System.out.println("Velocidade Maxima: " + velocidadeMax);
    System.out.println("Bateria esta em: " + pesoCargMax);
    System.out.println("Carga maxima que ele carrega: " + nivelBateriaAtual);
    System.out.println("Tem antena: " + temAntena);
    System.out.println("Tem antena: " + positionX);
  }

  public static void main(String[] args) {
    Robo1 obj1 = new Robo1();
    obj1.move(60, 50);
    obj1.printStatus();

  }
}
