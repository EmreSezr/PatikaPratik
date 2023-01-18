
class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 0 && salary <= 1000) {
            return 0;
        } else if (salary > 0 && salary > 1000) {
            return salary = salary - (salary * 0.03);
        } else {
            System.out.println("Maaş Eksi Değer Alamaz");
        }
        return 0;
    }

    public double bonus() {
        if (workHours > 40) {
            return salary += (workHours - 40) * 30;
        } else {
            return salary += 0;
        }
    }

    public double raiseSalary() {
        int yearsOfService = 2023 - hireYear;

        if (yearsOfService >= 0 && yearsOfService < 10) {
            salary += salary * 0.05;
        } else if (yearsOfService >= 10 && yearsOfService < 20) {
            salary += salary * 0.10;
        } else if (yearsOfService >= 20) {
            salary += salary * 0.15;
        }
        return salary;
    }

    public String toString() {
        System.out.println("\nÇalışan:\n"+"NAME= " + name
                + ", \nSALARY= " + salary
                + ", \nWORK-HOURS= " + workHours
                + ", \nHIRE-YEAR= " + hireYear + "\n===========================================\n ");
        tax();
        bonus();
        raiseSalary();
        return "Çalışana Ekstra Ücretler Eklendiğinde:\n"+"NAME= " + name
                + ", \nSALARY= " + salary
                + ", \nWORK-HOURS= " + workHours
                + ", \nHIRE-YEAR= " + hireYear + "\n===========================================\n ";

    }
}
