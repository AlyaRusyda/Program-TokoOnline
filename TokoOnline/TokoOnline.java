package javaapplication2.LatihanUKL_PBO.TokoOnline;

public class TokoOnline {
    public static void main(String[] args) {
    Member member = new Member();
    Karyawan karyawan = new Karyawan();
    Laporan laporan = new Laporan();
    Transaksi transaksi = new Transaksi();
    Barang barang= new Barang();
    
    laporan.laporan(barang);
    laporan.laporan(member);
    laporan.laporan(transaksi, barang);
    transaksi.prosesTransaksi(member, transaksi, barang);
    laporan.laporan(transaksi, barang);
    laporan.laporan(barang);
    laporan.laporan(member);   
    }
}