package part.alexander.aula.comparators;

import java.util.*;

public class ComparatorExemploList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("---Ordem da inserção----");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("---Ordem natural pela idade----");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("---Ordem reversa pela idade----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("---Ordem natural pela idade (Referência de metodo) ----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("---Ordem reversa pela idade (Referência de metodo) ----");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("---Ordem natural pela idade (interface comparable) ----");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("---Ordem reversa pela idade (interface comparator) ----");
        System.out.println(estudantes);

    }
}
