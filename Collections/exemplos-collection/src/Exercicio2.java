import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2 faça um programa q pergunte 5 coisas sobre um crime (ja trabalhou coma vitima, telefonou pra vitima, esteve no local do crime, mora perto da vitima, devia pra vitima), se responder sim a 2 questoes classifica como suspeita, de 3 a 4 como cumplice e 5 como assassina, caso contrario inocente.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comparacao = 0;
        List<Pergunta> perguntas = new ArrayList<>();
        System.out.println("Já trabalhou com a vítima?");
        perguntas.add(new Pergunta (sc.next()));
        System.out.println("Telefonou para a vitima?");
        perguntas.add(new Pergunta (sc.next()));
        System.out.println("Esteve no local do crime?");
        perguntas.add(new Pergunta (sc.next()));
        System.out.println("Mora perto da vitima?");
        perguntas.add(new Pergunta (sc.next()));
        System.out.println("Devia pra vitima?");
        perguntas.add(new Pergunta (sc.next()));

        for (Pergunta pergunta : perguntas) {
            if (pergunta.resposta.equals("s")) comparacao++;
        }
        switch (comparacao){ 
            case 2: System.out.println("Suspeito"); break;
            case 3:
            case 4: System.out.println("Cumplice"); break;
            case 5: System.out.println("Assassino"); break;
            default: System.out.println("Inocente"); break;
        }
        System.out.println(perguntas);
        sc.close(); 

    }
}

class Pergunta {
    String resposta;

    public Pergunta(String resposta) {
        this.resposta = resposta;
    }
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "Perguntas [resposta=" + resposta + "]";
    }



}


