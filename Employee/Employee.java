package Classes.Employee;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double vergi = 0;
        if (this.salary > 1000){
            vergi = this.salary * 0.03;
        }
        return vergi;
    }

    double bonus(){
        double bonus = 0;
        if (this.workHours > 40){
            int hours = this.workHours - 40;
            bonus = hours * 30;
        }
        return bonus;
    }

    double raiseSalary(){
        int year = 2021 - this.hireYear;
        double zam = 0;
        if (year < 10){
            zam =  this.salary * 0.05;
        } else if (year > 9 && year < 20) {
            zam = this.salary * 0.10;
        } else if (year > 19) {
            zam = this.salary * 0.15;
        }
        return zam;
    }

    void employeeInfo(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
