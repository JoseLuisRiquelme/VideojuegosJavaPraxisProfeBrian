package cl.praxis.model;

public class JuegoPC extends Videojuego {

  private String requisitosSistema;

  public JuegoPC() {
  }

  public JuegoPC(String titulo, String genero, String plataforma, double precio, String requisitosSistema) {
    super(titulo, genero, plataforma, precio);
    this.requisitosSistema = requisitosSistema;
  }

  @Override
  public void iniciarJuego() {
    System.out.printf("Iniciando juego PC %s\n", getTitulo());
  }

  @Override
  public void detenerJuego() {
    System.out.printf("Deteniendo juego PC %s\n", getTitulo());

  }

  public String getRequisitosSistema() {
    return requisitosSistema;
  }

  public void setRequisitosSistema(String requisitosSistema) {
    this.requisitosSistema = requisitosSistema;
  }
}
