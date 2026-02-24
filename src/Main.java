abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public abstract double calculateSalary();
}
class Developer extends Employee {
    private int hours;
    private double rate;

    public Developer(String name, int id, int hours, double rate){
        super(name , id);
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    public double calculateSalary(){
        return hours * rate;
    }
}
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Company {
    public void printSalary(Employee e) {
        System.out.println(
                e.getName() + "Salary = " + e.calculateSalary()
        );
    }
}
public class Main {
    public static void main(String[] args) {

        Employee dev = new Developer("Hosam : ", 1, 160, 50);
        Employee man = new Manager("Mohamed : ", 2, 5000, 50);

        Company company = new Company();
        company.printSalary(dev);
        company.printSalary(man);
    }
}










