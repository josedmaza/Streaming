# Streaming

### Se creo una clase llamada Proyeccion con las siguientes características:

- Atributos: titulo, genero, creador, año, duracion y visto.

- Constructores:

  - Un constructor default.

  - Un constructor con el titulo y creador.  Visto con un valor false por defecto.

  - Un constructor con todos los atributos, excepto visto.

- Métodos:

  -Métodos get de todos los atributos, excepto visto.

  - Métodos set de todos los atributos, excepto visto.

         

### Se Crea una clase Pelicula con las siguientes características:

- Sus atributos son los de la clase Padre mas el año.

- Constructores:

  - Un constructor default.

         - Un constructor con el titulo y creador.
         
         - Visto tendrá false por defecto.

         - Un constructor con todos los atributos, excepto visto.

 - Métodos:

         - Métodos get de todos los atributos, excepto visto.

         - Métodos set de todos los atributos, excepto visto.

         - El método toString

### Se Crea una clase Serie con las siguientes características:

- Sus atributos son los de la clase Padre mas el año.

  - Por default, el número de temporadas es 1 y visto false.

  - El resto de atributos serán valores por defecto según el tipo de atributo. 

- Constructores:

  - Un constructor default.

         - Un constructor con el titulo y creador.
         
         - Visto tendrá false por defecto.

         - Un constructor con todos los atributos, excepto visto.

 - Métodos:

         - Métodos get de todos los atributos, excepto visto.

         - Métodos set de todos los atributos, excepto visto.

         - El método toString



### Se creo una interfaz llamada Visualizable con los siguientes métodos:

     - marcarVisto() cambia el atributo de visto a true.

     - esVisto() devuelve el estado del atributo visto.

     - tiempoVisto() devuelve el tiempo en minutos que se visualizó el video.

### Se creo una clase ejecutable y se realizo lo siguiente:

     - Crea dos arrays de 5 elementos cada uno. Unos de Peliculas y otro de Series.

     - Crea un objeto en cada posición del array.

     - Se Marca en visto algunas Películas y Series con el método marcarVisto()

     - Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos visualizados.

     - Por último, se indico la serie con más temporadas y la película del año más reciente.
