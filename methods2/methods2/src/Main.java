public class Main {
    public static void main(String[] args) {
        //Bu operasyonlara  "void operasyonlar" deniliyor.
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi= topla(5,7);
        System.out.println(sayi);

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
    public static String sehirVer(){
        return "Ankara";
    }
}
