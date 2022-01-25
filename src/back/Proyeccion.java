package back;

public class Proyeccion {

    //Atributos

    private String titulo;
    private String genero = "-";
    private String director;
    private int duracion;
    public boolean visto;

    //Metodo constructor

    public Proyeccion() {

    }

    public Proyeccion(String titulo, String director){
        this.titulo = titulo;
        this.director = director;
    }

    public Proyeccion(String titulo, String genero, String director, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;

    }

    public Proyeccion(String titulo, String genero, String director, int duracion, boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
        this.visto = false;
    }
//Getters y setters
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion() {
        this.duracion = duracion;
    }

    public boolean getVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public String toString() {

        return "Titulo: " + titulo + "\n" + "Genero:" + genero + "\n" + "Director: " + director +
                "\n" + "Duracion: " + duracion + " minutos" + "\n" + "Visto: " + visto;
    }

}
