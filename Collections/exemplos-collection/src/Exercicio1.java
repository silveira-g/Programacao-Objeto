import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//1 Faça um programa q recebe a tempetura dos 6 primeiros meses do ano e armazeneos em uma lista
// calcule a media semestral de temperatura e exiba os meses que foram acima da media e em que mes elas ocorreram (1- janeiro etc)




public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            System.out.println("Insira a temperatura do mês: ");
            temperaturas.add(sc.nextDouble());
        }
        Iterator<Double> iterator = temperaturas.iterator();
        double soma =0;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        double media = soma/temperaturas.size();
        System.out.println("Media semestral: " + media);
        for (int j = 0; j < temperaturas.size(); j++){
            if (temperaturas.get(j)>media){
                switch (j){
                    case 0: System.out.println("Temperatura acima da media: " + temperaturas.get(j) + " ocorreu no mês: " + (j+1) + " - Janeiro"); break;
                    case 1: System.out.println("Temperatura acima da media: " + temperaturas.get(j) + " ocorreu no mês: " + (j+1) + " - Fevereiro"); break;
                    case 2: System.out.println("Temperatura acima da media: " + temperaturas.get(j) + " ocorreu no mês: " + (j+1) + " - Março"); break;
                    case 3: System.out.println("Temperatura acima da media: " + temperaturas.get(j) + " ocorreu no mês: " + (j+1) + " - Abril"); break;
                    case 4: System.out.println("Temperatura acima da media: " + temperaturas.get(j) + " ocorreu no mês: " + (j+1) + " - Maio"); break;
                    case 5: System.out.println("Temperatura acima da media: " + temperaturas.get(j) + " ocorreu no mês: " + (j+1) + " - Junho"); break;
                    default: System.out.println("Errou otario"); break;
                }
                
            }
        }
        System.out.println("Temperaturas: " + temperaturas);
        sc.close();
    }
}
