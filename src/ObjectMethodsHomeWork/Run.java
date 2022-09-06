package ObjectMethodsHomeWork;

public class Run {
    public static void main(String[] args) {


        Author author01 = new Author("ИмяАвтораКниги1","ФамимияАвтораКниги1");
        Book book01 = new Book("Название Книги 1 автора", author01, 19);
        book01.setYear(1901); // изменяем год книги

        Book book02= new Book("Название Книги 2 автора", new Author("ИмяАвтораКниги2","ФамимияАвтораКниги2"), 1002);

        Author author03 = new Author("ИмяАвтораКниги3","ФамимияАвтораКниги3");
        Book book03 = new Book("Название Книги 3 автора", author03, 1949);
        book03.setYear(2022); ; // изменяем год книги

        System.out.println(" NameBook = " + book01.getNameBook());
        System.out.println(" Author = " + book01.getAuthor());
        System.out.println(" Year = " + book01.getYear());

        System.out.println(" ========= ");

        System.out.println(" NameBook = " + book02.getNameBook());
        System.out.println(" Author = " + book02.toString());
        System.out.println(" Year = " + book02.getYear());

        System.out.println(" ========= ");

        System.out.println(" NameBook = " + book03.getNameBook());
        System.out.println(" Author = " + book03.getAuthor());
        System.out.println(" Year = " + book03.getYear());

    }
}
