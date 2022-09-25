public class Main {
    public static void main(String[] args) {
        //Bir class'ın çağırımı böyledir.
        CustomerManager customerManager = new CustomerManager(); //İki değer eşit old için bu cm'in new değeri gereksiz
                                                                 //kaldı çünkü cm ve cm2'nin değerleri aynı oldu.
        CustomerManager customerManager2 = new CustomerManager();//Classlar referans tipleridir.
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //1.Soruya Cevabım: 30'u yazar çünkü tanımlanan en son değerdir 30.

        //YANLIŞ, DOĞRU CEVAP: 10!!!!!

        //value
        int sayı1 = 10;
        int sayı2 = 20;
        sayı2 = sayı1;  //Bunun okunuşu sayı2'nin değeri sayı1'in değeridir!!!f
        sayı1 = 30;
        System.out.println(sayı2);

        //2.Soruya Cevabım:Sayılar 2,sayılar 1'in değerlerine eşit olacağından sonuç 1 olmalıdır.

        //YANLIŞ, DOĞRU CEVAP: 10 çünkü diziler referans tipidir ve sayılar1'in ilk elemanını değiş-
        //tirince aynı değişiklik sayılar2'de de olmuş oluyor ve böylece ilk elemanı 10 oluyor.

        int[] sayılar = new int[]{1,2,3};
        int[] sayılar2 = new int[]{4,5,6};
        sayılar2 = sayılar;
        sayılar[0] = 10;
        System.out.println(sayılar2[0]);



    }


}
