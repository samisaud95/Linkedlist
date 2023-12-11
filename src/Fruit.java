//
//Facciamo la classe Fruit

public class Fruit {
    public String nome;
    //Facciamo il metodo
    Fruit(String nome){
        this.nome=nome;
    }
//Facciamo atributti
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
