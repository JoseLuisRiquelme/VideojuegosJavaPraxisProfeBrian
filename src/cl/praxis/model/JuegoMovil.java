package cl.praxis.model;

public class JuegoMovil extends Videojuego {
  private double tamanoArchivo;

  public JuegoMovil() {
  }

  public JuegoMovil(String titulo, String genero, String plataforma, double precio, double tamanoArchivo) {
    super(titulo, genero, plataforma, precio);
    this.tamanoArchivo = tamanoArchivo;
  }

  @Override
  public void iniciarJuego() {
    System.out.printf("Iniciando juego Movil %s\n", getTitulo());
  }

  @Override
  public void detenerJuego() {
    System.out.printf("Deteniendo juego Movil %s\n", getTitulo());

  }

  public double getTamanoArchivo() {
    return tamanoArchivo;
  }

  public void setTamanoArchivo(double tamanoArchivo) {
    this.tamanoArchivo = tamanoArchivo;
  }
}
