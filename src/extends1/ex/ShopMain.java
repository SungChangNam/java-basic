package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book =new Book("Java",10000,"han", "12345");
        Album album= new Album("Album",15000,"seo");
        Movie movie =new Movie("Movie",18000,"MR.Bong","Zoro");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() +movie.getPrice();
        System.out.println("상품 가격의 합: "+sum);

    }
}
