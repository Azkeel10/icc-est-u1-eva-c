package Controllers;

import Models.Book;

public class LibroController {
//------------------------------------------------------------------------------------------------
    // Método para ordenar libros por nombre en orden descendente INCERSION
    public void sortByName(Book[] libros) {
        int tam = libros.length;

        for(int i = 0; i < tam; i++){
            Book index = libros[i];
            int j = i-1;

            while(j >= 0 && libros[j].getName().compareTo(index.getName()) > 0){
                libros[j+1] = libros[j];
                j--;
            }
            libros[j+1] = index;
        }
    }
//------------------------------------------------------------------------------------------------
    // Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
    public Book searchByName(Book[] libros, String name) {
        int bajo = 0;
        int alto = libros.length;

        while (bajo<=alto){
            int centro = (bajo + alto) / 2;

            int compara = libros[centro].getName().compareTo(name);

            if (compara == 0){
                return libros[centro];
            }
            if(compara < 0){
                bajo = centro + 1;
            }else{
                alto = centro -1;
            }
        }

        return null;
    }
//------------------------------------------------------------------------------------------------
}
