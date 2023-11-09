import java.util.Objects;

class LibraryManager {
    public static void addBook(Library library, String nameOfBook, String nameOfAuthor, int yearOfPublication) {
        Book book = new Book(nameOfBook, nameOfAuthor, yearOfPublication);
        library.setBookCatalogue(book);
    }

    public static Library searchBook(Library library, String nameOfBook_Or_NameOfAuthor) {
        Library relevantBooks = new Library();
        for (int i = 0; i < library.getBookCatalogue().length; i++) {
            if (Objects.equals(library.getBookCatalogue()[i].getNameOfBook(), nameOfBook_Or_NameOfAuthor)
                    || Objects.equals(library.getBookCatalogue()[i].getNameOfAuthor(), nameOfBook_Or_NameOfAuthor)) {
                relevantBooks.setBookCatalogue(library.getBookCatalogue()[i]);
            }
        }
        return relevantBooks;
    }

    public static String[][] showBookCatalogue(Library library) {
        String[][] bookCatalogue = new String[library.getBookCatalogue().length][3];
        for (int i = 0; i < bookCatalogue.length; i++) {
            bookCatalogue[i][0] = library.getBookCatalogue()[i].getNameOfBook();
            bookCatalogue[i][1] = library.getBookCatalogue()[i].getNameOfAuthor();
            bookCatalogue[i][2] = Integer.toString(library.getBookCatalogue()[i].getYearOfPublication());
        }
        return bookCatalogue;
    }
}
