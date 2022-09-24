public class Main {
    public static void main(String[] args) {
        /*char harf = 'e';

        //KENDİ YÖNTEMİM
        char[] inceSesliHarfler = {'e','i','ö','ü'};
        inceSesliHarfler[0] = 'e';
        inceSesliHarfler[1] = 'i';
        inceSesliHarfler[2] = 'ö';
        inceSesliHarfler[3] = 'ü';
        char[] kalınSesliHarfler ={'a','o','u','ı'};
        kalınSesliHarfler[0] = 'a';
        kalınSesliHarfler[1] = 'o';
        kalınSesliHarfler[2] = 'u';
        kalınSesliHarfler[3] = 'ı';

        for (char i=harf;i<=3;i++){
            if (harf==inceSesliHarfler.length[i]){
                System.out.println("Harf İncedir");
            }
            if (harf==kalınSesliHarfler.length[i]){
                System.out.println("Harf Kalındır");
            }
        }*/


        /*//HOCANIN SWITCH BOLUĞUNU KULLANDIĞINI ANLADIKTAN SONRAKİ ÇÖZÜMÜM
        char harf = 'a';
        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Harf Kalın Seslidir!");
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Harf İnce Seslidir");
        }*/


        //HOCANIN ÇÖZÜMÜ
        char harf = 'A';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }

        //Bence burada benim yaptığım gibi iki grup oluşturulup default'ta bu iki gruba girmeyen harfleri içermeliydi.






    }
}
