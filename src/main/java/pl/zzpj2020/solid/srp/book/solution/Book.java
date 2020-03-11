package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private int currentPageNumber = 0;
    private Map<Integer, String> pages = new HashMap<>();

    private BookLocation location;

    private final String title;
    private final String author;

    public Book(final BookLocation location, final String title, final String author) {
        this.location = location;
        this.title = title;
        this.author = author;
    }

    public BookLocation getLocation() {
        return location;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void turnPage() {
        currentPageNumber++;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }
}
