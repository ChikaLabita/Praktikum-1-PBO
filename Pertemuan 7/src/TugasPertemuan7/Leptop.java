package TugasPertemuan7;

public class Leptop extends Komputer{
    public String jnsBatrei;

    public Leptop(){

    }
    public Leptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor,
                  String jnsBatrei){
        super(merk,kecProsesor,sizeMemory,jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLeptop(){
        System.out.println("====================LAPTOP====================");
        super.tampilData();
        System.out.println("Jenis Baterai                   : " + jnsBatrei);
    }
}
