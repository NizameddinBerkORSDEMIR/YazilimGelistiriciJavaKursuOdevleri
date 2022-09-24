public class Main {
    public static void main(String[] args) {

        String mesaj = "     Bugün hava çok güzel.     ";
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı:" + mesaj.length()); //yani 20 tane karekter (char) varmış.
        System.out.println("5. Eleman:" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));   //concatination yani birleştirme demek
        System.out.println(mesaj.startsWith("B")); //İlk harbini alıyor eğer B yerine A yazsaydım false diyecekti
        System.out.println(mesaj.endsWith("."));   //bu da aynısı ama sonu için
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));//B'le 0'dan başlıyor.

        for(String kelime :mesaj.split(" ") ){
            System.out.println("--------------");
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());

        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());
    }
}
