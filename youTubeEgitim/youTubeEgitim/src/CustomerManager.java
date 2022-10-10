public class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){  //***INTERFACE'ler refereans tiptir!!!***
        _customer = customer;
        _creditManager = creditManager;
    }
    public void Save(){

        System.out.println("Müşteri Kaydedildi: "+_customer.Id);
    }
    public void Delete(){

        System.out.println("Müşteri Silinidi: "+_customer.Id);
    }
    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi Verildi");
    }


}
