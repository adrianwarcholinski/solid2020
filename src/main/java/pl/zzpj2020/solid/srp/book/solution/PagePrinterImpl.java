package pl.zzpj2020.solid.srp.book.solution;

import java.io.PrintStream;
import java.util.Map;

public class PagePrinterImpl implements PagePrinter {
    @Override
    public void printCurrentPage(final Book book, final PrintStream target) {
        int pageNumber = book.getCurrentPageNumber();
        String pageContent = book.getPages().get(pageNumber);
        target.println(pageContent);
    }

    @Override
    public void printAllPages(final Book book, final PrintStream target) {
        for (Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            int pageNumber = page.getKey();
            String pageContent = page.getValue();
            target.println(getFormattedPage(pageNumber, pageContent));
        }
    }

    private String getFormattedPage(final int pageNumber, final String content) {
        return pageNumber + " " + content;
    }
}
