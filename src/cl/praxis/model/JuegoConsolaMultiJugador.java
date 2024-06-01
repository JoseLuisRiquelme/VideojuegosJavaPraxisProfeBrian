package cl.praxis.model;

import cl.praxis.interfaces.MultiJugador;

public class JuegoConsolaMultiJugador extends JuegoConsola implements MultiJugador {

  public JuegoConsolaMultiJugador() {
  }

  public JuegoConsolaMultiJugador(String titulo, String genero, String plataforma, double precio, int numeroJugadores) {
    super(titulo, genero, plataforma, precio, numeroJugadores);
  }

  @Override
  public void conectar() {
    System.out.printf("Conectando juego multijugador consola %s", getTitulo());
  }

  @Override
  public void desconectar() {
    System.out.printf("Desconectando juego multijugador consola %s", getTitulo());

  }
}
