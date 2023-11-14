import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;

    private ArrayList<Product> products = new ArrayList<Product>();

    public void setProduct(Product product) {

        products.add(product);

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
