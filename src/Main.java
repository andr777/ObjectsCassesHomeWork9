public class Main {
    public static void main(String[] args) {

        /*
1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
3. Написать конструкторы для обоих классов, заполняющие все поля.
4. Создать геттеры для всех полей автора и всех полей книги.
5. Создать сеттер для поля «Год публикации» у книги.
6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
    Метод main не должен находиться в классах Book и Author.
    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
7. В том же методе main изменить год публикации одной из книг с помощью сеттера.       */

        Author author01 = new Author("Лука","Мудищев");
        Book book01 = new Book("-=Лука=-", author01, 19);
        book01.setYear(1900);

        Author author02 = new Author("Лев","Толстой");
        Book book02= new Book("Война и мир", author02, 1867);


        System.out.println(" NameBook = " + book01.getNameBook());
        System.out.println(" Author = " + book01.getAuthor());
        System.out.println(" Year = " + book01.getYear());

        System.out.println(" ========= ");

        System.out.println(" NameBook = " + book02.getNameBook());
        System.out.println(" Author = " + book02.getAuthor());
        System.out.println(" Year = " + book02.getYear());

    }


}