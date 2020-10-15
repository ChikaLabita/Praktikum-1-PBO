package TugasPertemuan7;

public class Main {
    public static void main(String[] args) {
        Komputer komputer = new Komputer("hp", 4, 4, "AMD");
        komputer.tampilData();

        Leptop leptop = new Leptop("hp", 4, 6, "Core i3","Ni-MH");
        leptop.tampilLeptop();

        Pc pc = new Pc("hp", 4, 8,"Core i5",15);
        pc.tampilPc();

        Mac mac = new Mac("hp", 4, 8, "Dual Core","Ni-Cd", "NAC");
        mac.tampilMac();

        Windows windows = new Windows("hp", 4, 4, "Core i5", "Ni-MH", "-");
        windows.tampilWindows();
    }
}