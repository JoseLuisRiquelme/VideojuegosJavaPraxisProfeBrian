package cl.praxis.model;

public abstract class Videojuego {
  private String titulo;
  private String genero;
  private String plataforma;
  private double precio;

  public Videojuego() {
  }

  public Videojuego(String titulo, String genero, String plataforma, double precio) {
    this.titulo = titulo;
    this.genero = genero;
    this.plataforma = plataforma;
    this.precio = precio;
  }

  public abstract void iniciarJuego();
  public abstract void detenerJuego();


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getPlataforma() {
    return plataforma;
  }

  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
}
