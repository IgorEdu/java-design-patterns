package singleton;

public final class Capitao {

  private static Capitao captain;

  // we make the constructor private to prevent the use of "new"
  private Capitao() {}

  // synchronized - thread safe
  public static synchronized Capitao getCaptain() {
    // Lazy initialization
    if (captain == null) {
      captain = new Capitao();
      System.out.println("Novo capitão foi selecionado para seu time.");
    } else {
      System.out.println("Seu time já tem um capitão selecionado.");
    }
    return captain;
  }

}
