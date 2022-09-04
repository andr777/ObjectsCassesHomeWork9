public class Run {
    public static void main(String[] args) {
        Main main = new Main();
        main.main(args);

        Author author03 = new Author("Джордж","Оруэлл");
        Book book03 = new Book("-=1984=-", author03, 1940);

        //В том же методе main изменить год публикации одной из книг с помощью сеттера.
        book03.setYear(1949);

        System.out.println(" ========= ");

        System.out.println(" NameBook = " + book03.getNameBook());
        System.out.println(" Author = " + book03.getAuthor());
        System.out.println(" Year = " + book03.getYear());

    }

}
