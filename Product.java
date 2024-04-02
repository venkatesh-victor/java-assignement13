
import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    protected String description;
    protected double price;

    public Product (String description, double price) {
        this.description = description;
        this.price = price;
    }

    public abstract double getPrice();
    public abstract String getDescription();

    @Override
    public String toString() {
        return "Description: " + description + "\n" + "Price: " + price; 
    }
}

class ElectronicProducts extends Product {
    public ElectronicProducts(String description, double price) {
        super(description, price);
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

class BookProduct extends Product {

    public BookProduct (String description, double price) {
        super(description, price);
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}

class ClothingProduct extends Product {
    public ClothingProduct(String description, double price) {
        super(description, price);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double calcTotalPrice() {
        double totalPrice = 0;

        for(Product product : productList) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    public void displayProducts() {
        System.out.println("-----------------------");
        for(Product product : productList) {
            System.out.println(product.toString());
        }
        System.out.println("------------------------");
    }
}

class ProductMain {
    public static void main (String[] args) {

        Product p1 = new ElectronicProducts("IPhone", 80_000);
        Product p2 = new ClothingProduct("Premium 3-Piece Suit", 30_000);
        Product p3 = new BookProduct("Dune by Frank Herbert", 750.50);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        System.out.println("Products in the cart:-");
        cart.displayProducts();
        System.out.println("Total price: " + cart.calcTotalPrice());

    }
}
