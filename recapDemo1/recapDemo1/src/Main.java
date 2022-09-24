public class Main {

    public static void main(String[] args) {
        int sayı1 = 7; //ya da int sayı1;'in aşağısına sayı1 =20
        int sayı2 = 5;
        int sayı3 = 8;
        int enBuyukSayı = sayı1;

        //BENIM YONTEMIM
        //if (sayı1>sayı2&&sayı2>sayı3){
            enBuyukSayı = sayı1;
        //}
        //if (sayı1>sayı3&&sayı3>sayı2){
            enBuyukSayı =sayı1;
        //}
        //if (sayı2>sayı1&&sayı1>sayı3){
            enBuyukSayı = sayı2;
        //}
        //if (sayı2>sayı3&&sayı3>sayı2){
            enBuyukSayı = sayı2;
        //}
        //if (sayı3>sayı2&&sayı2>sayı1){
            enBuyukSayı = sayı3;
        //}
        //if (sayı3>sayı1&&sayı1>sayı2){
            //enBuyukSayı = sayı3;

            //System.out.println("En Büyük Sayı"+enBuyukSayı);

        //} else if (sayı3==sayı2&&sayı2==sayı1) {
            //System.out.println("Tüm Sayılar Eşittir");
        //}

        //HOCANIN ÇÖZÜMÜ

        if (enBuyukSayı<sayı2){
            enBuyukSayı = sayı2;

        }
        if (enBuyukSayı<sayı3){
            enBuyukSayı = sayı3;
        }
        System.out.println("En Büyük Sayı ="+enBuyukSayı);


    }
}
