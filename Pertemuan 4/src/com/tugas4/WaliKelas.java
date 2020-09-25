package com.tugas4;

public class WaliKelas {
    private int nip;
    private String no_tlp;
    private String nama;

    WaliKelas(int nip, String no_tlp, String nama){
        this.nip = nip;
        this.no_tlp = no_tlp;
        this.nama = nama;
    }
    public void setNip(int nip){
        this.nip = nip;
    }
    public void setNo(String no_tlp){
        this.no_tlp = no_tlp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getNip(){
        return  nip;
    }
    public String getNo(){
        return no_tlp;
    }
    public String getNama(){
        return nama;
    }
    public String info(){
        String info = " ";
        info += nama + "\n";
        info += "NIP : " + nip + "\n";
        info += "No telepon : " + no_tlp + "\n";
        return info;
    }

}
