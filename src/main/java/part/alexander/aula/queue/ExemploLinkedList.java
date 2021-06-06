package part.alexander.aula.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //Obtem o primeiro e remove
        System.out.println(filaBanco.poll());
        System.out.println(filaBanco);

        //filaBanco.clear();

        //Obtem o primeiro e não remove
        System.out.println(filaBanco.peek());
        System.out.println(filaBanco);

        //Obtem o primeiro e não remove, se não tiver da throw
        System.out.println(filaBanco.element());
        System.out.println(filaBanco);

        for (String cliente: filaBanco) {
            System.out.println("-->" + cliente);
        }

        Iterator<String> iterator = filaBanco.iterator();

        while(iterator.hasNext()) {
            System.out.println("---->" + iterator.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());

        System.out.println("Tem carlos? " + filaBanco.contains("Carlos"));
    }
}
