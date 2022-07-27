public class Main {
   // Encapsulation --> Bir sınıfın detaylarını özelliklerini başka bi sınıftan bunları gizlemektir.
    // Bir sınıfın public yapmaktansa private yapıyoruz ve detaylarını gizliyoruz.

    public static void main(String[] args) {

        /*Abone abone = new Abone();

        abone.isim = "Samil Nugay";

        abone.bakiye = 200;

        abone.sehir = "ANKARA";

        abone.dogalgaz_kullan(200);*/

        GelismisAbone abone = new GelismisAbone("Samil Nugay" , 200 , "Ankara");
        abone.bakiye_ogren();


    }



}
