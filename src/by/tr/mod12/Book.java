package by.tr.mod12;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int publishedYear;
    Book(){}
    Book(String _author, String _title, int _year){
        author = _author;
        title = _title;
        publishedYear = _year;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, publishedYear);
    }

    @Override
    public String toString() {
        return "by.tr.mod12.Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
