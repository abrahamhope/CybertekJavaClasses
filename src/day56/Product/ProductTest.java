package day56.Product;

public class ProductTest {
    public static void main(String[] args) {

        Product p1 = new Product("Macbook Pro", 2999);
        Product p2 = new Product("Sony TV", 499);
        Product p3 = new Product("Sony TV", 499);

        System.out.println(p1==p2);
        System.out.println(p2==p3);

    }


}
