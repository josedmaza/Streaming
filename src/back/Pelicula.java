package back;

public class Pelicula extends Proyeccion implements Visualizable {

    //atributos
    private int año;


    //Metodo constructor
    public Pelicula() {

    }

    public Pelicula(String titulo, String genero, String director, int duracion, int año) {
        super(titulo, genero, director, duracion);
        this.año = año;
    }

    public Pelicula(String titulo, String director) {

        super(titulo, director);
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String toString() {
        return super.toString() + "\n" + "año: " + año + "\n";
    }

    // Se hace uso de los metodos de la interface
    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public String esVisto() {
        if (visto == true) {
            return "SI";
        }else {
            return "NO";
        }
    }

    @Override
    public int tiempoVisto() {
        if (visto == true) {
            return this.getDuracion();
        } else {
            return 0;
        }
    }
}
