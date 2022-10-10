public class ProductValidator {

    static {
        System.out.println("Static Yapıcı Blok Çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){  //isEmpty eğer ismi yoksa yada boşsa demek!
            return true;                                 //"!" işareti değilse (operatörü) demek yani ismi boş değilse!
        }else{
            return false;
        }
    }

    public void bisey(){

    }

    /*public static class BaskaBirClass{         //Bu classlara Inner Class denir.
        public static void  Sil(){

        }
    }*/
}

//***JAVADA ana class static olamıyor!!!***
//***YAPICI BLOKLAR NEWLENİNCE ÇALIŞIR***
//Bir metodu static yaptığımızda metot class ismiyle çağrılabilir.
