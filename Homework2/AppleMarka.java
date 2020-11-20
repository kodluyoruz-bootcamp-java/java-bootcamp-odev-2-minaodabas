package Homework2;

public class AppleMarka extends Telefon implements Arama,Sms{
    public AppleMarka(){

    }

    public AppleMarka(String modeladi,String imeinumarasi,String versiyonnumarasi,int bellekkapasitesi,int ekranboyutu){
        super(modeladi,imeinumarasi,versiyonnumarasi,bellekkapasitesi,ekranboyutu);
    }





    @Override
    public void arama() {
        System.out.println("Arama yapiliyor..");

    }

    @Override
    public void sms() {
        System.out.println("Sms gonderiliyor..");
    }

    public void GoruntuluArama(){
        System.out.println("Goruntulu arama yapiliyor..");


    }

    public void EkranPaylasimi(){
        System.out.println("Ekran paylasimi yapiliyor..");

    }
}
