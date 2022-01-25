package back;

public class NetflixEjecutable {

    public static void main(String[] args) {

        Pelicula[] arrayPeliculas = new Pelicula[5];

        arrayPeliculas[0] = new Pelicula("Harry Potter y el prisionero de Azkaban", "Fantasia", "Alfonso Cuarón", 141, 2004);
        arrayPeliculas[1] = new Pelicula("El señor de los anillos", "Fantasia", "Peter Jackson", 178, 2001);
        arrayPeliculas[2] = new Pelicula("El señor de los anillos: la comunidad del anillo", "Fantasia", "Peter Jackson", 201, 2003);
        arrayPeliculas[3] = new Pelicula("Siempre el mismo dia", "Romance", "Lone Scherfig", 108, 2011);
        arrayPeliculas[4] = new Pelicula("Cuestion de tiempo", "Romance", "Richard Curtis", 123, 2013);


        Serie[] arraySeries = new Serie[5];
        arraySeries[0] = new Serie("Friends", "Comedia", "Gary Halvorson", 24, 10);
        arraySeries[1] = new Serie("The Big Bang Theory", "Comedia", "Mark Cendrowski", 24, 12);
        arraySeries[2] = new Serie("How I met your mother", "Comedia", "Pamela Fryman", 22, 9);
        arraySeries[3] = new Serie("The Office", "Comedia", "Steve Carrell", 22, 8);
        arraySeries[4] = new Serie("Ozark", "Drama", "Jason Bateman", 44, 4);

        System.out.println("--------LAS 5 PELICULAS ALMACENADAS---------");

        for (Pelicula peli : arrayPeliculas) {
            System.out.println(peli);
        }

        System.out.println("--------LAS 5 SERIES ALMACENADAS---------");

        for (Serie serie : arraySeries) {
            System.out.println(serie);
        }

        //Cambiamos el visto en algunas peliculas a traves del metodo setVisto
        System.out.println("-----Peliculas Visualizadas------");
        arrayPeliculas[0].marcarVisto();
        arrayPeliculas[3].marcarVisto();

        System.out.println(arrayPeliculas[0]);
        System.out.println(arrayPeliculas[3]);

        //Cambiamos el visto en algunas series a traves del metodo setVisto
        System.out.println("-----Series Visualizadas-------");
        arraySeries[0].marcarVisto();
        arraySeries[3].marcarVisto();

        System.out.println(arraySeries[0]);
        System.out.println(arraySeries[3]);

        //Total duracion peliculas vistas
        int tiempoTotalPeli;
        tiempoTotalPeli = arrayPeliculas[0].tiempoVisto() + arrayPeliculas[3].tiempoVisto();
        System.out.println("Tiempo total de peliculas vistas: " + tiempoTotalPeli + " minutos");

        //Total duracion series vistas
        int tiempoTotalSerie;
        tiempoTotalSerie = arraySeries[0].tiempoVisto() + arraySeries[3].tiempoVisto();
        System.out.println("Tiempo total de series vistas: " + tiempoTotalSerie +" minutos");
        System.out.println("\n");

        //Pelicula mas reciente

        int añoPeliculaMasReciente = 0;
        String nombrePeliculaMasReciente = "";
        for (Pelicula peli : arrayPeliculas) {
            if (peli.getAño() > añoPeliculaMasReciente) {
                añoPeliculaMasReciente = peli.getAño();
                nombrePeliculaMasReciente = peli.getTitulo();
            }


        }

        System.out.println("Pelicula mas reciente: " + nombrePeliculaMasReciente + " del año " + añoPeliculaMasReciente);

        //Serie con mas temporadas
        int mayorNoTemporadasSerie = 0;
        String SerieConMasTemporadas = "";
        for (Serie serie : arraySeries) {
            if(serie.getNoTemporadas() > mayorNoTemporadasSerie){
                mayorNoTemporadasSerie = serie.getNoTemporadas();
                SerieConMasTemporadas = serie.getTitulo();
            }
        }

        System.out.println("La serie con mas temporadas es: " + SerieConMasTemporadas + " ---> " + mayorNoTemporadasSerie + " temporadas");




    }
}
