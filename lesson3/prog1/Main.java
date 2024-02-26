package lesson3.prog1;

public class Main {
    public static void main(String[] args) {
        Address billingAddress1 = new Address("bStreet1", "Chicago", "bstate1", 1234);
        Address shippingAddress1 = new Address("shStreet1", "shcity1", "shstate1", 4321);
        Customer customer1 = new Customer("dann1", "astillero", "ASD123", billingAddress1, shippingAddress1);

        Address billingAddress2 = new Address("bStreet2", "bcity2", "bstate2", 1234);
        Address shippingAddress2 = new Address("bStreet2", "bcity2", "bstate2", 1234);
        Customer customer2 = new Customer("dann2", "astillero", "ASD123", billingAddress2, shippingAddress2);

        Address billingAddress3 = new Address("bStreet3", "Chicago", "bstate3", 1234);
        Address shippingAddress3 = new Address("bStreet3", "bcity3", "bstate3", 1234);
        Customer customer3 = new Customer("dann3", "astillero", "ASD123", billingAddress3, shippingAddress3);

        Customer[] list = new Customer[]{customer1, customer2, customer3};

        for (Customer customer: list) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer.toString());
            }
        }


    }
}
