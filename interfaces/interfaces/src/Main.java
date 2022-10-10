public class Main {
    public static void main(String[] args) {    //Bir class birden fazla interface'i implement edebilir!
            CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
            customerManager.add();
    }
}
