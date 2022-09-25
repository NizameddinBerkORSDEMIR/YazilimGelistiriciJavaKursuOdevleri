public class Main {
    public static void main(String[] args) {
        sayıBulmaca();
    }
    public static void sayıBulmaca(){
        int[] sayılar = new int[]{1,2,5,7,8,9,0};
        int aranacak = 11;
        boolean varMı = false;

        for (int sayı: sayılar){
            if (sayı==aranacak){
                varMı= true;
                break;
            }
        }
        if (varMı){
            mesajVer("Sayı Mevcuttur: "+aranacak); //("Sayı Mevcut:"+aranacak)Stringi tek Stringdir çift değil.
        }else {
            mesajVer("Sayı Mevcuttur Değildir: "+aranacak);
        }
    }
    public static void mesajVer(String mesaj){ //metodun çalışması için değer ister sistem burada "int" mesela ve buna
                                               // parametreli metod denir.NOT:"int aranacak" yukarıdaki metoddan geldi.
        System.out.println(mesaj);
    }
}
