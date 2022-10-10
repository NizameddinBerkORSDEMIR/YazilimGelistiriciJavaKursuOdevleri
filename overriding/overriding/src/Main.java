public class Main {
    public static void main(String[] args) {
            BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

            for(BaseKrediManager krediManager: krediManagers){
                krediManager.hesapla(1000);
                System.out.println(krediManager.hesapla(1000));
            }
    }
}
