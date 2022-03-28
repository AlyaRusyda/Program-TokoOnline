package javaapplication2.LatihanUKL_PBO.TokoOnline;

import java.util.ArrayList;

public class Karyawan implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        this.namaKaryawan.add("UdinJ");
        this.alamat.add("Sawojajar");
        this.telepon.add("089876543");
        this.jabatan.add(0);
        
        this.namaKaryawan.add("ShalomJ");
        this.alamat.add("Sawojajar");
        this.telepon.add("081234569");
        this.jabatan.add(1);
        
        this.namaKaryawan.add("KakaJ");
        this.alamat.add("Sawojajar");
        this.telepon.add("0893274892");
        this.jabatan.add(2);
        
        this.namaKaryawan.add("AdekJ");
        this.alamat.add("Sawojajar");
        this.telepon.add("087653635");
        this.jabatan.add(3);
    }
    public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    } 
    public int getJmlKaryawan(){
        return this.namaKaryawan.size();
    }

    
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
}
