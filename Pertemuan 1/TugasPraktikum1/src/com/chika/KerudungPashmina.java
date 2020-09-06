package com.chika;

public class KerudungPashmina extends Kerudung{
    private String setUkuran, model;

    public void model(String newValue) { model = newValue;}
    public void setUkuran(String newValue) {setUkuran = newValue; }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Ukuran : " + setUkuran);
        System.out.println("Model : " + model);
    }

}
