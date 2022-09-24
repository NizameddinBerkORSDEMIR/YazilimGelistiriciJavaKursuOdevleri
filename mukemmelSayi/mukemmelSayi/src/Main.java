public class Main {
    public static void main(String[] args) {
        //6--->1,2,3 toplamları 6'ya eşit olur
        //28---1

        /*//KENDİ ÇÖZÜMÜM#1

        int denemeSayısı = 6;
        int mükemmelSayı1 = 6;
        int mükemmelSayı2 =28;

        for (int i=0;i<=30;i++){
            System.out.println("---------------");
            if (denemeSayısı==mükemmelSayı1&&mükemmelSayı1==i){
                System.out.println(i+"Mükemmel Sayıdır");
            }
            if (denemeSayısı==mükemmelSayı2&&mükemmelSayı2==i){
                System.out.println(i+"Mükemmel Sayıdır");
            }else if (denemeSayısı!=mükemmelSayı1&&denemeSayısı!=mükemmelSayı2&&denemeSayısı==i){
                System.out.println(i+"Mükemmel Değildir");
            }
        }*/

        /*//KENDİ ÇÖZÜMÜM#2
        int denemeSayısı = 25;
        int mükemmelSayı1 = 6;
        int mükemmelSayı2 =28;


        for (int i=1;i<=30;i++){
            if (i==mükemmelSayı1){
                System.out.println(i+" Mükemmel Sayıdır");
                }
            if (i==mükemmelSayı2){
                System.out.println(i+" Mükemmel Sayıdır");
            }
        }*/

        //HOCANIN ÇÖZÜMÜ

        int number = 6;
        int total = 0;

        for (int i=1;i<number;i++){
            if(number % i==0){
                total= total +i;
            }
        }
        if (total == number){
            System.out.println("Sayı Mükemmel Sayıdır");
        }else {
            System.out.println("Mükemmel Sayı Değildir");
        }


    }
}
