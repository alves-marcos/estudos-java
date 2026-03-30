package entities;

public class Operation {
    private int id;
    private String name;
    private double deposit;

    public Operation() {
    }

    public Operation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Operation(int id, String name, double initialDeposit) {
        this.id = id;
        this.name = name;
        addAccount(initialDeposit);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void addAccount(double deposit) {
        this.deposit += deposit;
    }

    public void accountWithdrawal(double deposit) {
        this.deposit -= deposit + 5.00;
    }


    @Override
    public String toString() {
        return "Account " + id + "," +
                " Holder: " + name + "," +
                " Balance: $ " + String.format("%.2f%n", deposit)
                + "\n";

    }
}
