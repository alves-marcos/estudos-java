package entities;

public class Funcionarios {
    private int id;
    private String name;
    private double salary;

    public Funcionarios(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    double acrescentarSalary(){
        return salary + salary*0.1;
    }


    @Override
    public String toString() {
        return id + ", " + name  + ", " + salary + "\n";
    }
}
