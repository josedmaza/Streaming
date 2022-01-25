package back;

public class Serie extends Proyeccion implements Visualizable {

    //atributos
    private int noTemporadas = 1; //valor por defecto

    //Metodo construtor
    public Serie(){
    }

    public Serie(String titulo, String director) {
        super(titulo, director);
    }

    public Serie(String titulo, String director, String genero, int duracion , int noTemporadas) {
        super(titulo, director, genero, duracion);
        this.noTemporadas = noTemporadas;
    }

    //getter
    public int getNoTemporadas() {
        return noTemporadas;
    }

    //setter
    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    public String toString() {
        return super.toString() + "\n" + "noTemporadas: " + noTemporadas + '\n';
    }

    //Se hace uso de los metodos de la interface Visualizable
    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public String esVisto() {
        if (this.visto == true) {
            return "Visto";
        }else {
            return "No";
        }
    }

    @Override
    public int tiempoVisto() {
        if(this.visto) {
            return this.getDuracion();
        } else {
            return 0;
        }
    }
}
