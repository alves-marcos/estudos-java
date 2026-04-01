package entities;

public class Pessoas {
    private double altura;
    private String genero;

    public Pessoas(double altura, String genero){
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura(){
        return altura;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "altura=" + altura +
                ", genero=" + genero +
                '}';
    }
}
