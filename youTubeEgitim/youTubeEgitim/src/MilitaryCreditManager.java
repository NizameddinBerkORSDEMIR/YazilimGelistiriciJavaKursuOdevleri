public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        System.out.println("Asker Kredisi Hesaplandı");
    }
    public void Save(){
        System.out.println("Kaydedildi");
    }
}
