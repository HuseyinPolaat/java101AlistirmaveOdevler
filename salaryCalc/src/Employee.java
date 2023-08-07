public class Employee {
    String name;
    double salary;
    double workHours;
    double hireYear;

    Employee(String name, double salary, double workHours, double hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary){
        double tax = 0;
        if(salary > 1000){
            tax = this.salary * 0.03;
        }
        return tax;
    }

    double bonus(double workHours){
        double bonus = 0;
        if(workHours > 40){
           bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary(){
        double zam = 0;
        double sure = 2021 - this.hireYear;
        if(sure < 10){
            zam += this.salary * 0.05;
        } else if (sure > 10 && sure < 20) {
            zam += this.salary * 0.10;
        } else {
            zam += this.salary * 0.15;
        }
        return zam;
    }

    void run(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: "+ this.hireYear);
        System.out.println("vergi: " + tax(this.salary));
        System.out.println("Bonus: " + bonus(this.workHours));
        System.out.println("Maaş artışı: " + raiseSalary());
        salary = this.salary - tax(this.salary) + bonus(this.workHours);
        System.out.println("vergi ve Bonuslar ile birlikte maaş: " + salary);
        salary += raiseSalary();
        System.out.println("toplam maaş: " + salary);
    }

}
