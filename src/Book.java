public class Book {
   private String nameBook;
   private Author author;
   private int year;

    public Book(String nameBook, Author author, int year){
        this.nameBook=nameBook;
        this.author=author;
        this.year=year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor(){
        return author.getAuthor();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int yearNew){
        this.year = yearNew;
    }
}
