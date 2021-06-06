package part.alexander.aula.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");
        System.out.println(esportes);

        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

        esportes.remove(2);
        System.out.println(esportes);

        esportes.remove("Handebol");
        System.out.println(esportes);

        System.out.println(esportes.get(0));

        for(String esporte: esportes) {
            System.out.println(esporte);
        }
    }
}
