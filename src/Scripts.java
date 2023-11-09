import java.util.Scanner;

class Scripts {
    static void printCatalogue(Library library) {
        if (LibraryManager.showBookCatalogue(library).length == 0) {
            System.out.println("Каталог пуст");
        } else {
            for (int i = 0; i < LibraryManager.showBookCatalogue(library).length; i++) {
                System.out.printf(LibraryManager.showBookCatalogue(library)[i][0] + " ");
                System.out.printf(LibraryManager.showBookCatalogue(library)[i][1] + " ");
                System.out.printf(LibraryManager.showBookCatalogue(library)[i][2] + "\n");
            }
        }
    }

    static void addBook(Library library) {
        String nameOfBook;
        String nameOfAuthor;
        int yearOfPublication;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название книги: ");
            nameOfBook = scanner.nextLine();
            System.out.print("Введите имя автора: ");
            nameOfAuthor = scanner.nextLine();
            System.out.print("Введите год публикации: ");
            yearOfPublication = scanner.nextInt();

            LibraryManager.addBook(library, nameOfBook, nameOfAuthor, yearOfPublication);
            System.out.println("Книга успешно добавлена!");
        }
        catch (Exception e) {
            nameOfBook = null;
            nameOfAuthor = null;
            yearOfPublication = 0;
            System.out.println("Неверный формат!");
        }
    }

    static Library searchBook(Library library) {
        String nameOfBook_Or_NameOfAuthor;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название книги или имя автора: ");
            nameOfBook_Or_NameOfAuthor = scanner.nextLine();

            return LibraryManager.searchBook(library, nameOfBook_Or_NameOfAuthor);
        }
        catch (Exception e) {
            nameOfBook_Or_NameOfAuthor = null;
            System.out.println("Неверный формат!");

            return null;
        }
    }

    static void switcher(Library library) {
        int variable = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1 - добавить книгу\n2 - поиск книг по названию или автору\n3 - список книг\n4 - завершить\n");
            variable = scanner.nextInt();

            switch (variable) {
                case 1 -> Scripts.addBook(library);
                case 2 -> Scripts.printCatalogue(Scripts.searchBook(library));
                case 3 -> Scripts.printCatalogue(library);
                case 4 -> {
                    System.exit(0);
                }
                default -> System.out.println("Команда не распознана");
            }
        }
        catch (Exception e) {
            variable = 0;
            System.out.println("Неверный формат!");
        }

        try { System.in.read(); } catch (Exception e) { }
    }
}
