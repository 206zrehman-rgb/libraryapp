
package com.ZainRehman.libraryapp.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.io.Serializable;
import com.ZainRehman.libraryapp.Models.book;

public class BookManager implements Serializable {

    ArrayList<book> library ;

    public BookManager(){
        this.library = new ArrayList<>();
    }

    public BookManager(ArrayList<book> library){
        this.library = library;
    }




    public void addBook(book book){

        library.add(book);
    }

    public void showContent(){
        for(book book : library){
            System.out.println(" " + book.getName() + "\n description: " + book.getDescription() + "\n" + " score: " + book.getScore() + "\n");
        }
    }

    public void removeBook(String book){

        try{
            for (int i = 0; i < library.size() ; i++){
                if(library.get(i).getName().equals(book)){
                    library.remove(i);
                    return;
                }
            }
        }catch (Exception e){
            System.out.println("book does not exist");
        }

    }


    public ArrayList<book> getLibrary() {
        return library;
    }

    @Override
    public String toString(){
        return "book name: " ;
    }
}
