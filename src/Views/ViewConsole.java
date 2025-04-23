package Views;

import Models.Book;

public class ViewConsole {
//------------------------------------------------------------------------------------------------
    public void imprimirArreglo(Book[] libros) {
        int tam = libros.length;
        
        for(int i = 0; i < tam; i++){
            System.out.println(libros[i]);
        }
        System.out.println();
    }
//------------------------------------------------------------------------------------------------
    public void showMessage(String message){
        System.out.println(message);
    }
//------------------------------------------------------------------------------------------------
}
