//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Employee{
    int salary;
    String name;
    public int getSalary()
    {
       return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
      name=n;
    }
}
public class Q1 {
    public static void main(String[] args) {

        Employee Vishwas = new Employee();
         Vishwas.setName("Vishwas");
        System.out.println("Name of the employee is "+Vishwas.getName());
    }
}