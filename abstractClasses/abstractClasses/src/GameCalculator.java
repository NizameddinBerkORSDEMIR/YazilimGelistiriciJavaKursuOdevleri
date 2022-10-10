public abstract class GameCalculator {          //Abstract sınıflar newlenemez!!!!!
    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun Bitti!");
    }
}
