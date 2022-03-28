package javaapplication2.LatihanUKL_PBO.TokoOnline;

import java.util.ArrayList;

public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Barang() {
        this.namaBarang.add("Cokelat Ueenak");
        this.stok.add(15);
        this.harga.add(8000);
        
        this.namaBarang.add("Sabun Wangi");
        this.stok.add(30);
        this.harga.add(6000);
        
        this.namaBarang.add("Pasta teeth");
        this.stok.add(20);
        this.harga.add(18000);
        
        this.namaBarang.add("Sikat teeth");
        this.stok.add(25);
        this.harga.add(12000);
        
        this.namaBarang.add("Shampo Harum");
        this.stok.add(18);
        this.harga.add(10000);
    }
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    } 

    public void setStok(int stok ){
        this.stok.add(stok);
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    } 
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);;
    } 
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    } 
}