package by.tr.mod12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public class LibraryTesting {
    public static void main(String[] args) {
        Library lib = new Library();

        try{
        File file = new File("C:\\Users\\Aliaksandra_Bychkous\\IdeaProjects\\Task12\\src\\by\\tr\\mod12\\books.txt");
        Scanner f = new Scanner(file);
        while (f.hasNextLine()) {
            String line = f.nextLine();
            String[] bookParams = line.split(",");
            Book filebook = new Book (bookParams[0],bookParams[1],Integer.parseInt(bookParams[2]));
            lib.addBook(filebook);
        }
            System.out.println(lib);
            System.out.println(lib.findByTitle("1984"));
            System.out.println(lib.findByTitle("1983"));
            System.out.println(lib);
            lib.deleteBookByTitle("To Kill a Mockingbird");
            System.out.println(lib);
        }
      catch (FileNotFoundException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

    }
}

