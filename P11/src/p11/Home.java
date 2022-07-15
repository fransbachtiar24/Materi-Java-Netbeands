/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11;

import java.util.ArrayList;

/**
 *
 * @author mhdha
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Direktur direktur = new Direktur();
        direktur.setNik("20202021");
        System.out.println(direktur.getNik());
        
        //siapkan beberapa buku 
        Book book1 = new Book();
        book1.setTitle("Belajar PBO");
        
        Book book2 = new Book();
        book2.setTitle("Belajar Java");

        ArrayList<Book> b = new ArrayList();
        b.add(book1);
        b.add(book2);
        
        //masukan buku ke dalam Library
        Library library = new Library(b);
        System.out.println(library.getBooks().get(1).getTitle());
    }
    
}
//