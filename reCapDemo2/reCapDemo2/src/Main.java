public class Main {
    public static void main(String[] args) {

        //ReCap
        double[] myList = {1.2, 6.3, 4.3, 5.6}; //Bir diğer yoluda new double[4];
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam =" + total);
        System.out.println("En Büyük =" + max);

    }
}
