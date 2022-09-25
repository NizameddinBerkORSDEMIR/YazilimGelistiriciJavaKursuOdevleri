public class Product {

    public Product(int id,String name,String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı Blok Çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product(){  //Buna overloading denili.Yukaridaki constuctorda bu constructorla aynı şeyi ifade ediyor

    }

    //attribute veya field denir.
    private int id;             //Private sadece bloğunda geçerli demektir.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //Getter
    public int getId() {  //Eğer sadece get ise o zaman bu readonly demektir.Tam tersi sadece set olursa bu da writeonly
        return id;       //anlamını taşır.
    }

    //Setter
    public void setId(int id) {
        this.id = id;     //This,benim içerisinde bulunduğum class'ı gösterir.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

}
