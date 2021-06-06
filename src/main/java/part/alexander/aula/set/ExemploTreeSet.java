package part.alexander.aula.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.first());
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore de capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima na árvore de capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        System.out.println(treeCapitais);

        //Retorna a primeira capital e remove
        System.out.println(treeCapitais.pollFirst());

        //Retorna a ultima capital e remove
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nlista FOR\n");
        for (String notasAluno : treeCapitais) {
            System.out.println(notasAluno);
        }

        treeCapitais.clear();
        System.out.println("Está vazia? " + treeCapitais.isEmpty());
    }
}
