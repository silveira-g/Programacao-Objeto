import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Listas {
    public static void main(String[] args) throws Exception {
        //cria lista
        List <Double> notas = new ArrayList<>();
        //adciona na lista
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        //exiba posicao da nota 5.

        System.out.println("Posicao da nota 5: " + notas.indexOf(5d));
        //adicione na lista a nota 8.0 na posicao 4;
        notas.add(4, 8.0);
        //substitua a nota 5 pela nota 6;
        notas.set(notas.indexOf(5d), 6.0);
        //confira se a nota 5 esta na lista;
        System.out.println( notas.contains(5d));

        //exiba a terceira nota adicionada;
        System.out.println(notas.get(2));
        //exiba a menor nota
        System.out.println(Collections.min(notas));
        //exiba a maior nota
        System.out.println(Collections.max(notas));
        //exiba a soma dos valores;
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);
        //exiba a media das notas;
        System.out.println(soma/notas.size());
        //remova a nota 0
        notas.remove(0d);
        //remova o elemento da posicao 0
        notas.remove(0);
        //remova  as notas menores q 7 e exiba a lista
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()){
            Double next1 = iterator2.next();
            if (next1<7) iterator2.remove();
        }
        System.out.println(notas);
        //apague toda a lista
        notas.clear();
        //confira se a lista esta vazia;
        System.out.println(notas.isEmpty());
    }
}
