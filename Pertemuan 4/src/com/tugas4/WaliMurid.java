package com.tugas4;

public class WaliMurid {
    private int id_wali;
    private String no_tlp;
    private String nama_wali, status;

    WaliMurid(int id_wali, String  no_tlp, String nama, String status){
        this.id_wali = id_wali;
        this.no_tlp = no_tlp;
        this.nama_wali = nama;
        this.status = status;
    }
    public void setId(int id_wali){
        this.id_wali = id_wali;
    }
    public void setNo(String no_tlp){
        this.no_tlp = no_tlp;
    }

    public void setNama(String nama_wali) {
        this.nama_wali = nama_wali;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id_wali;
    }

    public String getNo() {
        return no_tlp;
    }

    public String getNama() {
        return nama_wali;
    }

    public String getStatus() {
        return status;
    }
    public String info(){
        String info = " ";
        info += nama_wali + "\n";
        info += "Id Wali : " + id_wali + "\n";
        info += "No telepon : " + no_tlp + "\n";
        info += "Status\t: " + status + "\n";
        return info;
    }
}
