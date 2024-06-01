package cl.praxis.model;

import cl.praxis.interfaces.MultiJugador;

public class JuegoPCMultiJugador extends JuegoPC implements MultiJugador {
  public JuegoPCMultiJugador() {
  }

  public JuegoPCMultiJugador(String titulo, String genero, String plataforma, double precio, String requisitosSistema) {
    super(titulo, genero, plataforma, precio, requisitosSistema);
  }

  @Override
  public void conectar() {
    System.out.printf("Conectando juego multijugador PC %s", getTitulo());
  }

  @Override
  public void desconectar() {
    System.out.printf("Desconectando juego multijugador PC %s", getTitulo());

  }
}
