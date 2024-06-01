import cl.praxis.interfaces.MultiJugador;
import cl.praxis.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Videojuego> lista = new ArrayList<Videojuego>();
    List<MultiJugador> listaMultiJugador = new ArrayList<MultiJugador>();

    lista.add(new JuegoConsola("Darksouls", "peluos", "PS", 50000, 4));
    lista.add(new JuegoConsola("Halo", "shooter", "XBOX", 30000, 4));
    lista.add(new JuegoMovil("Candy Crash", "casual", "android", 0, 400));
    lista.add(new JuegoMovil("Angry Birds", "casual", "ios", 0, 500));
    lista.add(new JuegoPC("Red Dead Redemption", "wéstern", "windows", 55000, "muchos"));
    lista.add(new JuegoPC("Age of Empires", "estrategia", "windows", 52000, "mas o menos"));

    JuegoConsolaMultiJugador callOfDuty = new JuegoConsolaMultiJugador("Call of Duty", "shooter", "Nintendo", 25000, 6);

    lista.add(callOfDuty);
    listaMultiJugador.add(callOfDuty);

    JuegoPCMultiJugador starcraft = new JuegoPCMultiJugador("Starcraft", "estrategia", "MacOS", 0, "Apple Silicone") ;

    lista.add(starcraft);
    listaMultiJugador.add(starcraft);


    for (Videojuego videojuego : lista) {
      mostrarDetalles(videojuego);
    }

    for (MultiJugador multiJugador : listaMultiJugador) {
      conectarOnLine(multiJugador);
    }


  }

  public static void mostrarDetalles(Videojuego v){
    System.out.printf("Detalle de videojuego: %s:\n" +
            "%s - $%.2f\n", v.getTitulo(), v.getPlataforma(), v.getPrecio());
  }

  public static void conectarOnLine(MultiJugador m){
    m.conectar();
  }

  public static void desconectarOnLine(MultiJugador m){
    m.desconectar();
  }

}