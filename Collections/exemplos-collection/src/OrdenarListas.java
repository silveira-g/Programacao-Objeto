import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Dadas as seguintes informações sobre gatos, crie uma lista
// e ordene esta lista exibindo 
// nome - idade - cor

// Gato 1 = nome: Jon, idade 18, cor preto
// Gato 2 = nome Simba, idade 6, cor tigrado
// Gato 3 = nome Jon, idade 12, cor amarelo
public class OrdenarListas {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        
        //mostrando na ordem de inserção
        System.out.println(meusGatos);
        //mostrando em ordem aleatoria
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        //mostrando em ordem natural do nome
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;
    
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public Gato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
}