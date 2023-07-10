public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Михайлов Михаил Михайлович", 1, 65871);
        employees[1] = new Employee("Сергеев Сергей Сергеевич", 2, 74583);
        employees[2] = new Employee("Антонов Антон Антонович", 3, 59659);
        employees[3] = new Employee("Алексеев Алексей Алексеевич", 4, 65535);
        employees[4] = new Employee("Андреев Андрей Андреевич", 5, 89426);
        employees[5] = new Employee("Семёнов Семён Семёнович", 1, 15646);
        employees[6] = new Employee("Игорев Игорь Игоревич", 2, 54561);
        employees[7] = new Employee("Александров Александр Александрович", 3, 54531);
        employees[8] = new Employee("Петров Петр Петрович", 4, 69894);
        employees[9] = new Employee("Иванов Иван Иванович", 5, 168496);
        PrintAll();
        System.out.printf("Сумма затрат на зарплаты в месяц %.2f\n",findTotalSalary());
        System.out.println("Минимальная зарплата: "+ getSalaryEmployeeSMin());
        System.out.println("Максимальная зарплата: "+ getSalaryEmployeeSMax());
        System.out.printf("Средняя зарплата: %.2f\n",findAverageSalary());
        PrintFIO();
    }



    private static void PrintAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static double findTotalSalary() {
        double totalSum = 0;
        for (Employee employee : employees) {
            totalSum += employee.getSalaryEmployee();
        }
        return totalSum;
    }

    private static Employee getSalaryEmployeeSMin(){
        double minSalary = employees[0].getSalaryEmployee();
        Employee salaryMin = null;
        for (Employee employee : employees) {
            if (minSalary > employee.getSalaryEmployee()) {
                minSalary = employee.getSalaryEmployee();
                salaryMin = employee;
            }
        }
           return salaryMin;
    }
    private static Employee getSalaryEmployeeSMax(){
        double minSalary = employees[0].getSalaryEmployee();
        Employee salaryMax = null;
        for (Employee employee : employees) {
            if (minSalary < employee.getSalaryEmployee()) {
                minSalary = employee.getSalaryEmployee();
                salaryMax = employee;
            }
        }
        return salaryMax;
    }
    private static double findAverageSalary() {
        return findTotalSalary()/ employees.length;
    }
    private static void PrintFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getfIO());
        }
    }

}
