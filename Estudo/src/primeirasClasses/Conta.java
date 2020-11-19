package primeirasClasses;

public class Conta {
  private double Saldo = 0;
  private String Nome;

  // Declaracao dos metodos
  public void deposita(double Valor) {
    this.Saldo = this.Saldo + Valor + (Valor * 0.10);
  }

  public double getSaldo() {
    return this.Saldo;
  }

  public void setNome(String N) {
    this.Nome = N;
  }

  public String getNome() {
    return this.Nome;
  }

  public static void main(String[] args) {
    Conta c1 = new Conta();
    Conta c2 = new Conta();
    c1.setNome("Gabriel Porfirio");
    c2.setNome("Sara Rife");
    c1.deposita(200);
    c2.deposita(300);

    System.out.println("O saldo da conta c1 eh: " + c1.getSaldo());
    System.out.println("O saldo da conta c2 eh: " + c2.getSaldo());
  }
}