public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        //Hesaplamalar var...
        System.out.println("Öğretmen Kredisi Hesaplandı");
    }
    public void Save(){
        System.out.println("Kaydedildi");
    }
}
