package pl.zzpj2020.solid.srp.book.solution;

public class BookLocation {
    private final String libraryRoomName;
    private final String rowLocator;
    private final int indexOnShelf;

    public BookLocation(final String libraryRoomName, final String rowLocator, final int indexOnShelf) {
        this.libraryRoomName = libraryRoomName;
        this.rowLocator = rowLocator;
        this.indexOnShelf = indexOnShelf;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }
}
