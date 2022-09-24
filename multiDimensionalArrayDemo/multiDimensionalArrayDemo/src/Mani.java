public class Mani {
    public static void main(String[] args) {
        String[][] şehirler = new String[3][3];

        şehirler[0][0] = "İstanbul";
        şehirler[0][1] = "Bursa";
        şehirler[0][2] = "Bilecik";
        şehirler[1][0] = "Ankara";
        şehirler[1][1] = "Konya";
        şehirler[1][2] = "Kayseri";
        şehirler[2][0] = "Diyarbakır";
        şehirler[2][1] = "Şanlıurfa";
        şehirler[2][2] = "Gaziantep";

        for (int i = 0;i<=2;i++){
            System.out.println("--------------");
            for (int j=0;j<=2;j++){
                System.out.println(şehirler[i][j]);

            }
        }
    }
}
