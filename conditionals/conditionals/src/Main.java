public class Main {

    public static void main(String[] args) {
       //tek eşittir sayıya değer atamada kullanıldığı için eşitlikleri cift "==" ile gösteririz.
       //Bir problemde sartlı koşulda if ve else'in olması bir sonuç vermesine yeter (doğru olmasada)
        int sayı = 25;
        if (sayı<20){
            System.out.println("Sayı 20'den küçüktür");
        }else if(sayı==20) {
            System.out.println("Sayı 20'ye eşittir");
        }else {
            System.out.println("Sayı 20'den büyüktür");
        }

    }
}
