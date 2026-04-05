package Arrays.exerciciosVetores.pensionato.entities;

public class Pessoa {
    String name;
    String email;

    public Pessoa(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
