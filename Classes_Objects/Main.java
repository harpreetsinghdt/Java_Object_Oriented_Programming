public class Main {
  
  public static void main(String[] args) {
    Employee employeeOne = new Employee("Harpreet Singh", "Toronto", 85000, 35);
    Employee employeeTwo = new Employee("Taranjeet Singh", "Bolton", 90000, 22);

    employeeOne.raiseSalary();

    System.out.println(employeeOne.salary);
    System.out.println(employeeTwo.salary);
  }
}
