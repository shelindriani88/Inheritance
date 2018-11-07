public class Motor extends Kendaraan{
    public static void main(String[] args){
        //Membuat Objek Dari Class Motor
        Motor data = new Motor();

        //Memasang Atribut untuk Merek dan Jenis
        data.setAtribut("HONDAII", "Motors");

        //Menampilkan hasil
        System.out.println("Jenis Kndrn: "+data.getJanis());
        System.out.println("Merek Kndrn: "+data.getMerek());
        data.Melaju(290);
    }
}