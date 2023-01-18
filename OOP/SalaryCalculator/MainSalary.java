public class MainSalary {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 990, 40, 2023);
        System.out.println("\nÇalışan:\n=========================================== ");
        System.out.println(employee.toString());
        System.out.println("Vergi           : " + employee.tax());
        System.out.println("Mesai+Ücret     : " + employee.bonus());
        employee.raiseSalary();
        System.out.println("\n     \nEkstra Ücretler İle Çalışan Maaşı:  \n===========================================" +
                "\n"+employee.toString());
    }
}
