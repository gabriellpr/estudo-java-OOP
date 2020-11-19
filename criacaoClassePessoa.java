public class Pessoa {
  int idade;
  String sexo;
  String nome;
    public static void main(String[] args){
      Pessoa qualquer = new Pessoa();
              qualquer.nome = "Maria";
              qualquer.idade = 22;
              qualquer.sexo = 'f';
      System.out.println("O nome eh : " + qualquer.nome);
      System.out.println("O idade eh : " + qualquer.idade);
      System.out.println("O sexo eh : " + qualquer.sexo);
    }
}