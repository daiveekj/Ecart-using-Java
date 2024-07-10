public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 899.99);
        Product product2 = new Product(2, "Smartphone", 499.99);
        Product product3 = new Product(3, "Headphones", 149.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);
        cart.addProduct(product3, 1);

        cart.displayCart();

        cart.removeProduct(2);

        cart.displayCart();
    }
}
