public class Main {
    public static void main(String[] args) {
        /*int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        System.out.println("------------------");*/

        /*//KENDİ ÇÖZÜMÜM PEK IYI GITMEDI
        int denemeSayısı = 7;
        int değerSayı = denemeSayısı;
        int sabitSayı = 1;
        int[] rakamlar = new int[9];
        rakamlar[0] =1;
        rakamlar[1] =2;
        rakamlar[2] =3;
        rakamlar[3] =4;
        rakamlar[4] =5;
        rakamlar[5] =6;
        rakamlar[6] =7;
        rakamlar[7] =8;
        rakamlar[8] =9;

            for (int i=0;i<=9;i++){
                if (denemeSayısı%sabitSayı==denemeSayısı);{
                    System.out.println("Sayı 1'e Bölünür");
                }
                if (denemeSayısı%rakamlar[i]==1){
                    System.out.println("Bu Kendine Bölünür");
                }
                System.out.println("O Zaman"+denemeSayısı+"Bir Asal Sayıdır");
            }*/


            //HOCANIN ÇÖZÜMÜ
        int number = 5;
        //int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        if (number==1){
            System.out.println("Sayı Asal Değildir");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz Sayı");
        }

        for (int i=2; i<number;i++){
            if(number % i ==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Sayı Asaldır");
        }else {
            System.out.println("Sayı Asal Değildir");
        }


    }

}
