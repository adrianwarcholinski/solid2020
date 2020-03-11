package pl.zzpj2020.solid.srp.book.solution;

import java.io.PrintStream;

public interface PagePrinter {
    void printCurrentPage(Book book, PrintStream target);
    void printAllPages(Book book, PrintStream target);
}
