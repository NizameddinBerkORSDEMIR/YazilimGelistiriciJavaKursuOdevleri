public class Main {
    public static void main(String[] args) {
        //Bu operasyonlara  "void operasyonlar" deniliyor.
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi= topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }
    public static void ekle (){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(int sayı1,int sayı2){
        return sayı1+sayı2;
    }
    public static int topla2(int... sayılar){ //Birden fazla integer göndermek istediğimizde int'ten sonra 3 tane '.'
                                               // işareti konulur
            int toplam = 0;
            for (int sayı: sayılar){
                toplam = toplam+ sayı;
            }
            return toplam;
    }

    public static String sehirVer(){
        return "Ankara";

    }
}
