package InheritanceAbstractClassInterface.Task3;

class Employee extends Sortable { 
    // Instance Variables
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
    
    public Employee(String n, double s, int day, int month, int year){ 
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }
    
    public void print(){ 
        System.out.println(name + " " + getSalary() + " " + hireYear());
    }
    
    public void raiseSalary(double byPercent){ 
        salary *= 1 + byPercent / 100;
    }
    
    public int hireYear(){ 
        return hireyear;
    }
    
    @Override
    public int compare(Sortable b){
        Employee eb = (Employee) b;
        if (getSalary()<eb.getSalary()) return -1;
        if (getSalary()>eb.getSalary()) return +1;
        return 0;
    }

    public double getSalary() {
        return salary;
    }
}
