public class LaporanTahunan implements CetakLaporan, TampilLaporan{
    public void cetakA4(){
        System.out.println("Cetak Laporan di A4");
        System.out.println("=====================");
    }
    public void cetakA3(){
        System.out.println("Tampil di Layar");
        System.out.println("=====================");
    }
    public void tampilWeb(){
        System.out.println("Cetak Laporan di A3");
        System.out.println("=====================");
    }
    public void tampilMobile(){
        System.out.println("Tampil di Hp");
        System.out.println("=====================");
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        LaporanTahunan lt = new LaporanTahunan();
        lt.cetakA3();
        lt.cetakA4();
        lt.tampilMobile();
        lt.tampilWeb();
    }
}