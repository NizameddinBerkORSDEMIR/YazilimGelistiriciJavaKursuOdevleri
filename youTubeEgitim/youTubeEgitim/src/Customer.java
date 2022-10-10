public class Customer {     //Bu Class'ın içinde özellikler tuttuk.

    public Customer(){  //CONSTRUCTOR
        System.out.println("Müşteri Nesnesi Başlatıldı"); //New'i gördüğünde çalışmaya başlar.
    }
    public int Id;
    public String City;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
