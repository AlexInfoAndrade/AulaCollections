package part.alexander.aula.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Ana Bele");
        nomes.add("Ricardo");
        nomes.add("Sandra");
        nomes.add("Aline");
        nomes.add("Flávio");
        nomes.add("Dantas");
        System.out.println(nomes);

        nomes.set(1, "Vitória");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(1, "Patricia");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Patricia");
        System.out.println(nomes);

        System.out.println("Elem. 4: " + nomes.get(4));
        System.out.println("Tamanho: " + nomes.size());

        int posicao = nomes.indexOf("Vitória");
        System.out.println("Pos. Vitória: " + posicao);

        posicao = nomes.indexOf("Dantas");
        System.out.println("Pos. Dantas: " + posicao);

        nomes.remove("Pedro");
        System.out.println(nomes);
        System.out.println("Tamanho: " + nomes.size());

        boolean temAline = nomes.contains("Aline");
        System.out.println("tem Aline: " + temAline);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println("tem Fernando: " + temFernando);

        System.out.println("Lista vazia? " + nomes.isEmpty());

        for(String nome: nomes) {
            System.out.println("F-->" + nome);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()) {
            System.out.println("I---->" + iterator.next());
        }

        nomes.clear();
        System.out.println("Lista vazia? " + nomes.isEmpty());
    }
}
