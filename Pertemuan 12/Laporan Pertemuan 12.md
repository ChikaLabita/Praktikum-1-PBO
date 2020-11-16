<h1>Laporan Praktikum 12 - Polimorfisme</h1>

<h3>Percobaan 1 – Bentuk dasar polimorfisme</h3>
<br>

Class <b>Employee</b>
   
    package com.praktikum;

    public class Employee {
    protected String name;

    public String getEmployeeInfo(){
        return "Name = " + name;
    }
    }
   
Interface <b>Payable</b>
<br>

    package com.praktikum;

    public interface Payable {
    public int getPaymentAmount();
    }
    
<br>
class <b>InternshipEmployee</b>, subclass dari <b>Employee</b>

    package com.praktikum;

    public class InternshipEmployee extends Employee{
    private int length;

    public InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as intership employee for " + length + " month/s\n";
        return info;
    }
    }
    
Class <b>PermanentEmployee</b>, subclass dari <b>Employee</b> dan
implements ke <b>Payable</b>

    package com.praktikum;

    public class PermanentEmployee extends Employee implements Payable{
    private int salary;

    public PermanentEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
    }
    
Class <b>ElectricityBill</b> yang implements ke interface <b>Payable</b>

    package com.praktikum;

    public class ElectricityBill implements Payable {
    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmount() {
        return kwh + getBasePrice();
    }

    public int getBasePrice(){
        int bPrice = 0;
        switch (category){
            case "R-1" : bPrice = 100;
            break;
            case "R-2" : bPrice = 200;
            break;
        }
        return bPrice;
    }

    public String getBillInfo(){
        return "kWH = " + kwh + "\n" + "Category = " + category +"(" + getBasePrice() + " per kWH)\n";
    }
    }

Class <b>Tester1</b>

    package com.praktikum;

    public class Tester1 {

    public static void main(String[] args) {
	  // write your code here
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
    }
    
<b> 4.2. Pertanyaan</b>
1. Class apa sajakah yang merupakan turunan dari class Employee?<br>
   Jawab : Subclass dari class Employee antara lain InternshipEmployee dan PermanentEmployee.<br>
2. Class apa sajakah yang implements ke interface Payable?<br>
   Jawab : Class yang implements pada interface Payable adalah PermanentEmployee dan ElectricityBill.<br>
3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee)<br>
   dan objek iEmp (merupakan objek dari class InternshipEmploye) ?<br>
   Jawab : Karena keduanya merupakan subclass dari class Employee.
4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi denganobjekpEmp (merupakan objek dari class PermanentEmployee)<br> 
   dan objek eBill (merupakan objek dari class ElectricityBill) ?<br>
   Jawab : Karena pEmp pada class PermanentEmployee merupakan implements dari Payable, begitu juga dengan eBill pada class ElectricityBill.<br>
5. Coba tambahkan sintaks:
    <b>p = iEmp;
       e = eBill;</b>
   Pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?
   Jawab : Karena class InternshipEmployee tidak mengimplements pada Interface Payable, kemudian variable p merupakan objek dari Payable.
   sehingga tidak dapat diisi dengan iEmp. sedangkan dengan eBill merupakan objek yang terdapat pada class ElectricityBill, 
   dimana class ini tidak mengimplements class Employee, sehingga tidak dapat diisi dengan eBill.
6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!
   Inti dari konsep dasar polimorfisme adalah memiliki banyak method yang berbeda-beda, tetapi nama yang dimiliki sama.
   
<h3>Percobaan 2 – Virtual method invocation</h3>
    class baru dengan nama <b>Tester2</b>
    
    package com.praktikum;

    public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("-----------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
    }
    
<img src=".Tester2.jpg"/>
    
<b>5.2. Pertanyaan</b>
1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?<br>
   Jawab : Karena class PermanentEmployee merupakan subclass dari Employee. sehingga getEmployeeInfo() merupakan method yang sama dan dipanggil 2x pada variable e dan pEmp. 
   terdapat keterangan bahwa e akan sama dengan pEmp. Maka dari itu, output yang ditampilkan sama.
2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?<br>
   Jawab : Karena e.getEmployeeInfo() memanggil overriding method pada class PermanentEmployee.
3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?<br>
   Jawab : Karena antara method yang dikenali oleh compiler dan method yang dijalankan oleh JVM beda.
   
<h3>Percobaan 3 – Heterogenous Collection</h3>
Class baru <b>Tester3</b>

    package com.praktikum;

    public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedil",500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5,"A-1");
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
       // Employee e2[] = {pEmp, iEmp, eBill};
    }
    }
    
<b>6.2. Pertanyaan</b>
1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) 
   dan objek iEmp (objek dari InternshipEmployee) ?<br>
   Jawab : Karena Employee merupakan parent dari class PermanentEmployee dan IntershipEmployee. sehingga dapat di isi dengan objek yang berbeda tipe.
2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) 
   dan objek eBill (objek dari ElectricityBilling) ?<br>
   Jawab : Karena Payable mewarisi class ElectricityEmployee dan juga class PermanentEmployee. sehingga dapat di isi dengan objek yang berbeda tipe.
3. Perhatikan baris ke-10, mengapa terjadi error?<br>
   Jawab : Karena eBill dari class ElectricityBill tidak mewarisi class Employee.
   
<h3>Percobaan 4 – Argumen polimorfisme, instanceof dan casting objek</h3>
Class baru dengan nama <b>Owner</b>. 

    package com.praktikum;

    public class Owner {
    public void pay(Payable p){
        System.out.println("Total Payment = " + p.getPaymentAmount());
        if(p instanceof ElectricityBill){
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println(""+eb.getBillInfo());
        } else if (p instanceof PermanentEmployee){
            PermanentEmployee pe = (PermanentEmployee) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee e){
        System.out.println(""+e.getEmployeeInfo());
        if (e instanceof PermanentEmployee){
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :) ");
        }
    }
    }
    
Class <b>Tester4</b>

    package com.praktikum;

    public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill); //pay for electricityBill
        System.out.println("-------------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); //pay for permanent employee
        System.out.println("-------------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Dedik", 500);
        ow.showMyEmployee(pEmp); //show permanent employee info
        System.out.println("-------------------------------------");
        ow.showMyEmployee(iEmp); //show intership employee

        //ow.pay(iEmp);
    }
    }
    
<b>7.2. Pertanyaan</b>
1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan,
   padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable?
   Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?<br>
   Jawab : Karena eBill dan pEmp mengimplements interface Payable.
2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?<br>
   Jawab : Tujuan dari argument bertipe Payable pada method pay() adalah agar dapat mengakses class yang mengimplements class Owner.
3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp); Mengapa terjadi error?<br>
   Jawab : Karena pada pay memiliki parameter Payable, sehingga iEmp pada class IntershipEmployee tidak dapat digunakan pada ow.pay().
4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?<br>
   Jawab : Digunakan untuk mengecek apakah p merupakan hasil instansiasi dari class ElectricityBill.
5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p)
   diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?<br>
   Jawab : Digunakan mengubah tipe dari objek eb pada class ElectricityBill menjadi objek p pada Payabel.
   
<h3>Tugas</h3>
Class <b>Barrier</b>
    package com.tugas;

    public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        this.strength -= (0.1 * this.strength);
    }
    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength;
    }
    }
 
Interface <b>Destroyable</b>

    package com.tugas;

    public interface Destroyable {
    public void destroyed();
    }
    
Class <b>JumpingZombie</b>

    package com.tugas;

    public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level){
            case 1 :
                this.health += (30/100 * this.health);
                break;
            case 2 :
                this.health += (40/100 * this.health);
                break;
            case 3 :
                this.health += (50/100 * this.health);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (10 * this.health / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Jumping Zombie Data = \n" + info;
    }
    }
    
Class <b>Plant</b>

    package com.tugas;

    public class Plant {
    public void doDestroy(Destroyable d){
        d.destroyed();
    }
    }
    
Class <b>WalkingZombie</b>

    package com.tugas;

    public class WalkingZombie extends Zombie{
    WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level){
            case 1 :
                this.health += (10/100 * this.health);
                break;
            case 2 :
                this.health += (30/100 * this.health);
                break;
            case 3 :
                this.health += (40/100 * this.health);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (20 * this.health / 100);
    }

    @Override
    public String getZombieInfo() {
        String info =  super.getZombieInfo();
        return "Walking Zombie Data = \n" + info;
    }
    }

Abstract Class <b>Zombie</b>

    package com.tugas;

    abstract class Zombie implements Destroyable {
    protected int health, level;

    abstract public void heal();

    abstract public void destroyed();

    public String getZombieInfo(){
        return "Health : " + this.health + "\n" + "Level : " + this.level + "\n";
    }
    }
    
Class <b>Tester</b>

    package com.tugas;

    public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100,2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("------------------------------");

        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
    }
    }

Output : 
<img src=".Output.jpg"/>


    
