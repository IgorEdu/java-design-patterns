package singleton;/*
we cannot extend Captain class. The constructor is private
in this case.
 */

public class SingletonPattern {

  public static void main(String[] args) {
    System.out.println("***Singleton Pattern***\n");
    System.out.println("Definindo um capitão para seu time: ");

    // O construtor é privado (private). Não podemos usar "new" aqui
    // Capitao capitao = new Capitao(); // error

    Capitao capitao1 = Capitao.getCaptain();
    System.out.println("Definindo um outro capitão para seu time:");
    Capitao capitao2 = Capitao.getCaptain();
    if (capitao1 == capitao2)
      System.out.println("capitao1 e capitao2 são a mesma instância.");
  }
}
