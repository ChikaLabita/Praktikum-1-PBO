package com.Tugas;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }

}
