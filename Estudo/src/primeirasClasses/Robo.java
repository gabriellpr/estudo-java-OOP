package primeirasClasses;

public class Robo {
  float posicaoX;
  float posicaoY;
  final String nome;
  final float peso;
  final float velocidadeMax = 5;
  final float pesoCargaMax = 20;
  final String tipoTracao = "esteira";

  public Robo(String nome, float peso) {
    this.nome = nome;
    this.peso = peso;
    this.posicaoX = 50;
    this.posicaoY = 50;
  }

  public Robo(String nome, float peso, float posX, float posY) {
    this.nome = nome;
    this.peso = peso;
    this.posicaoX = posX;
    this.posicaoY = posY;
  }

  public void move(float posX, float posY) {
    this.posicaoX = posX;
    this.posicaoY = posY;
  }

}