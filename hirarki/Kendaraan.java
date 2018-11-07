public class Kendaraan {
    
    String Merek;
    int Kecepatan;
    String Jenis;
    
    void Melaju(int Kecepatan){
        this.Kecepatan = Kecepatan;
        System.out.println("======== Berangkat ========");
        System.out.println("===========================");
        System.out.println("Kecepatan "+Kecepatan+" Km/Jam");
    }
    
    void setAtribut(String Merek, String Jenis){
        this.Merek = Merek;
        this.Jenis = Jenis;
    }
    
    String getMerek(){
        return Merek;
    }
    
    String getJanis(){
        return Jenis;
    }
}
