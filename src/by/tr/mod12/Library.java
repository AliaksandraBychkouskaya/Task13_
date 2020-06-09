package by.tr.mod12;

import by.tr.mod12.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> library = new ArrayList<Book>();
    public Library(){}
    public void addBook(Book book){
        library.add(book);
    }
    public boolean deleteBook(Book book){
        return library.remove(book);
    }
    public boolean deleteBookByTitle(String title){
        for (Book book :library){
            if (book.getTitle().toLowerCase().equals(title.toLowerCase()))
                library.remove(book);
                return true;
        }
        return false;
    }
    public Book findByTitle (String title){
        for (Book book :library){
            if (book.getTitle().toLowerCase().equals(title.toLowerCase()))
                return book;
        }
        return null;
    }

    @Override
    public String toString() {
        return "by.tr.mod12.Library{" +
                "library=" + library +
                '}';
    }
}
