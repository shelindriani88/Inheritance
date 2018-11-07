public class Mobil extends Kendaraan{
    public static void main(String[] args){
        //Membuat Objek Dari Class Mobil
        Mobil data = new Mobil();

        //Memasang Atribut untuk Merek dan Jenis
        
        data.setAtribut("TOYOTAAI", "Mobil");
        //Menampilkan hasil
        System.out.println("Jenis Kndrn: "+data.getJanis());
        System.out.println("Merek Kndrn: "+data.getMerek());
        data.Melaju(180);
    }
}