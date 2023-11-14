import java.util.ArrayList;

public class Cashier {
    int id ;
    String name;
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
        customer.wallet = total;
        return total;
    }


    public void setDiscount(Customer customer,int discount){
        float firsWallet = (float) customer.wallet;
        customer.wallet =  (((float) (100 - discount) / 100) * firsWallet);
    }

    public float getWallet(Customer customer)
    {
        return customer.wallet;
    }

}
