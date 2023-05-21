public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int para=0;
    double vPara=0;
    int bPara = 0;
    double mPara = 0;

    Employee(String name , double salary , int workHours , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if(this.salary <= 1000){

        } else if(this.salary >= 1000){
            vPara = this.salary*0.03;
            System.out.println("Vergi miktari : " + this.salary*0.03);
        }
    }
    void bonus(){
        if(40 <= this.workHours){
            for(int i = this.workHours; i > 40; i--) {
                para++;
            }
            bPara = para*30;
        }
        System.out.println("Fazla mesai ucreti : " + 30 * para);

    }
    void raiseSalary(){
        if(2021-this.hireYear < 10){
            mPara=this.salary*0.15;
            System.out.println("Maas artisi : " +this.salary*0.05);
        }
        if(2021-this.hireYear>9 && 2021-hireYear<20){
            mPara=this.salary*0.15;
            System.out.println("Maas artisi : "+this.salary*0.10);
        }
        if(2021-this.hireYear>19){
            mPara=this.salary*0.15;
            System.out.println("Maas artisi : "+this.salary*0.15);
        }
    }
    void toPrint(){
        System.out.println("Calisanin Adi : " + this.name);
        System.out.println("Maas : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("ise giris yili : " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("Vergi ve mesai ile birlikte maas : " + (this.salary-vPara+bPara));
        System.out.println("Toplam maas : " + (this.salary+mPara));
    }

}


