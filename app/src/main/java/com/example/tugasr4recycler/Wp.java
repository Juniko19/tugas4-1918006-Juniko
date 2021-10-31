package com.example.tugasr4recycler;

public class Wp {
    private String nama,st1,st2;
    private int foto;
    public Wp(String nama, String st1, String st2, int foto){
        this.nama = nama;
        this.st1 = st1;
        this.st2 = st2;
        this.foto = foto;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getSt1(){ return st1; }
    public void setSt1(String st1){
        this.st1 = st1;
    }
    public String getSt2(){
        return st2;
    }
    public void setSt2(String st2){
        this.st2 = st2;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}
