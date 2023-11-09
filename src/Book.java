class Book {
    private String nameOfBook;
    private String nameOfAuthor;
    private int yearOfPublication = 2024;

    public Book(String nameOfBook, String nameOfAuthor, int yearOfPublication){
        setNameOfBook(nameOfBook);
        setNameOfAuthor(nameOfAuthor);
        setYearOfPublication(yearOfPublication);
    }

    public String getNameOfBook() { return this.nameOfBook; }
    public void setNameOfBook(String nameOfBook) { this.nameOfBook = nameOfBook; }
    public String getNameOfAuthor() { return this.nameOfAuthor; }
    public void setNameOfAuthor(String nameOfAuthor) { this.nameOfAuthor = nameOfAuthor; }
    public int getYearOfPublication() { return this.yearOfPublication; }
    public void setYearOfPublication(int yearOfPublication) {
        if(yearOfPublication > 0 && yearOfPublication < 2024){
            this.yearOfPublication = yearOfPublication;
        }
    }
}
