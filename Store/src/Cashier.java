import java.util.ArrayList;

public class Cashier {
    int id ;
    String name;
    float discount = 0f ;
    public Cashier(int id , String name) {
        this.id = id;
        this.name = name;
    }

    public void addProduct(Customer customer , Product product)
    {
        customer.setProduct(product);
    }

    public float calcInvoice(Customer customer) {
        float total = 0;
        for (Product product :
                customer.getProducts()) {
            total += product.price ;
        }
        return (((float) (100 - discount) / 100) * total);

    }


    public void setDiscount(int discount){

        this.discount = discount;

    }



}
