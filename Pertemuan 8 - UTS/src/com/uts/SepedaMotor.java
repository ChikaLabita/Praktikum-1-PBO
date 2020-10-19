package com.uts;

public class SepedaMotor extends Mesin{
    private Mesin mesin ;
    private String merekMotor;

    SepedaMotor(String merekMotor, String merek){
        super.merek = merekMotor;
        this.merekMotor = merek;
    }

    public void setMerekMotor(String merekMesin) {
        this.merekMotor = merekMotor;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public String getMerekMesin(){
        return super.getMerek();
    }

    public void tambahKecepatanMotor() {
        super.tambahKecepatan();
    }
    public void kurangiKecepatanMotor(){
        super.kurangiKecepatan();
    }
}
