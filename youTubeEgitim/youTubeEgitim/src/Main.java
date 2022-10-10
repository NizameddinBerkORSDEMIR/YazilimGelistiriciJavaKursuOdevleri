public class Main {
    public static void main(String[] args) {

        /*int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        //CEVABIM = 20
        System.out.println(sayi1);

        System.out.println("-----------------");

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[]{10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        //CEVABIM: 1000
        System.out.println(sayilar1[0]);

        System.out.println("-----------------");

        CreditManager creditManager = new CreditManager();  //***Örneğini oluşturmak yada instance oluşturmak.(Instance Creation)***
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.Id = 1;
        customer.City = "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.TaxNumber = "100000";
        company.CompanyName = "Arçelik";
        company.Id = 100;

        CustomerManager customerManager2 = new CustomerManager(new Customer());

        Person person = new Person();
        person.Nationality = "123456789";


        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();*/

        //IoC Container'ı araştır!
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.GiveCredit();



    }
    //SOLID'i araştır!!!(Yazılım Geliştirme Prensibi)
    //DRY: Do Not Repeat Yourself
}
