package pertemuan7;

public class StaffHarian extends Staff{
    public int jmljamKerja;

    public StaffHarian(){

    }
    public StaffHarian(String nama, String alamat, String jk, int umur,
                       int gaji, int lembur, int potongan, int jmljamKerja){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmljamKerja = jmljamKerja;
    }
    public void tampilStaffHarian(){
        System.out.println("=================Data Staff Harian=================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja       = " + jmljamKerja);
        System.out.println("Gaji Bersih            = " +(gaji*jmljamKerja+lembur-potongan));
    }
}
