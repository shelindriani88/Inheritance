public class Kendaraan implements Mobil, Motor{
    public void merkMotor(){
        System.out.println("SUZUKI");
    }
    public void cetakType(){
        System.out.println("TOYOTA");
    }
    public void merkMobil(){
        System.out.println("HONDAS");
    }
    public void tampilType(){
        System.out.println("BROOOZE");
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Kendaraan k = new Kendaraan();
        k.merkMotor();
        k.cetakType();
        k.merkMobil();
        k.tampilType();
    }
}