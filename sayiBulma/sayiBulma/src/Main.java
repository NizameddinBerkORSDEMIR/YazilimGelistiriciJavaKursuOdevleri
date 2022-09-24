public class Main {
    public static void main(String[] args) {

        /*//BAZI KOMUTLARI VİDEODAN ALIP DÜZENİNİ DENİYEREK KURDUĞUM ÇALIŞMAM
        int[] sayılar = new int[]{1,2,5,7,9,0};
        int aranacak = 1;
        boolean sayıVarMı = true;

        for (int sayı: sayılar){
            if (sayı==aranacak){
                System.out.println("Bu Sayı Dizide Vardır");
                break;
            }
            if (sayı!=aranacak){
                System.out.println("Bu Sayı Bu Dizide Yoktur");
                break;
            }

        }*/

        //HOCANIN ÇÖZÜMÜ

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
            System.out.println("Sayı Mevcuttur");
        }else {
            System.out.println("Sayı Mevcut Değildir");
        }


    }
}
