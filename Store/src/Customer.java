import java.util.ArrayList;

public class Customer extends Person {

    private ArrayList<Product> products = new ArrayList<Product>();

    public void setProduct(Product product) {

        products.add(product);

    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
