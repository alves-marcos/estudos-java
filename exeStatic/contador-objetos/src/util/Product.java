package util;

public class Product {
    String name;
    int idade;
    public static int totalProdutos;

    public Product(String name, int idade) {
        this.name = name;
        this.idade = idade;
        totalProdutos++;
    }

    @Override
    public String toString() {
        return "Product" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }
}