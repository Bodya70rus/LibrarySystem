import java.util.Arrays;

class Library {
    private Book[] bookCatalogue = new Book[0];

    public void setBookCatalogue(Book book) {
        bookCatalogue = Arrays.copyOf(bookCatalogue, bookCatalogue.length + 1);
        bookCatalogue[bookCatalogue.length - 1] = book;
    }
    public Book[] getBookCatalogue() {
        return bookCatalogue;
    }
}
