public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setAge(50);
        c1.setAge(20);
        Customer c2 = new Customer();
        c2.setAge(23);

        Product p1 = new Product("chips" , 10000);
        Product p2 = new Product("pofak" , 12000);
        Product p3 = new Product("soda" , 20000);

        Cashier ca1 = new Cashier(1,"Reza");
        Cashier ca2 = new Cashier(2,"Ali");

        c1.setProduct(p1);
        c1.setProduct(p2);

        System.out.println("Before Discount : " + (int)ca1.calcInvoice(c1));
        ca1.setDiscount(c1,20);
        System.out.println("After Discount : " + (int)ca1.getWallet(c1));

    }
}