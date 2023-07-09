import java.util.Objects;
public class Employee {
   private String fIO;
    private int departmentNumber;
    private double salaryEmployee;
    private static int Counter;
    private int id;

 public Employee(String fIO, int departmentNumber, double salaryEmployee) {

  this.fIO = fIO;
  this.departmentNumber = departmentNumber;
  this.salaryEmployee = salaryEmployee;
  id=++Counter;
 }

 public String getfIO() {
  return fIO;
 }
 public int getDepartmentNumber() {
  return departmentNumber;
 }

 public void setDepartmentNumber(int departmentNumber) {
  this.departmentNumber = departmentNumber;
 }

 public double getSalaryEmployee() {
  return salaryEmployee;
 }

 public void setSalaryEmployee(double salaryEmployee) {
  this.salaryEmployee = salaryEmployee;
 }

 @Override
 public String toString() {
  return String.format("id: %s Ф.И.О: %s Департамент: %s Зарплата:%s", id,fIO,departmentNumber,salaryEmployee);
 }
}

