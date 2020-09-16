class Book {
    String title;
    String author; 
    int price;
}


public class MyBook {
    public static void main(String[] args) throws Exception {
        Book book = new Book();

        book.title = "클래스의 기초";
        book.author = "홍길동";
        book.price = 10000;

        System.out.println(book.title + ":" +
                            book.author + ":" +
                            book.price);
    }
}
