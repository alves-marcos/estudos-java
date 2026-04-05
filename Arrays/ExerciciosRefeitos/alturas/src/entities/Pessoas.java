package entities;

public class Pessoas {
    private String name;
    private int idade;
    private double altura;

    public Pessoas(String name, int idade){
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura(){
        return altura;
    }
}
