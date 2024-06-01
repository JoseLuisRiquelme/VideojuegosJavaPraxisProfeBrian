package cl.praxis.model;

public class JuegoConsola extends Videojuego {
  private int numeroJugadores;

  public JuegoConsola() {
  }

  public JuegoConsola(String titulo, String genero, String plataforma, double precio, int numeroJugadores) {
    super(titulo, genero, plataforma, precio);
    this.numeroJugadores = numeroJugadores;
  }

  @Override
  public void iniciarJuego() {
    System.out.printf("Iniciando juego de Consola %s\n", getTitulo());
  }

  @Override
  public void detenerJuego() {
    System.out.printf("Deteniendo juego de Consola %s\n", getTitulo());

  }

  public int getNumeroJugadores() {
    return numeroJugadores;
  }

  public void setNumeroJugadores(int numeroJugadores) {
    this.numeroJugadores = numeroJugadores;
  }
}
