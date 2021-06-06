package part.alexander.aula.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Ana Bele");
        estudantes.add("Ricardo");
        estudantes.add("Sandra");
        estudantes.add("Aline");
        estudantes.add("Flávio");
        estudantes.add("Dantas");

        System.out.println("Qnatidade na lista: " + estudantes.stream().count());
        System.out.println("Elemento com maior número de letras: " +
                estudantes.stream().max(Comparator.comparingInt(String::length))
        );
        System.out.println("Elemento com menor número de letras: " +
                estudantes.stream().min(Comparator.comparingInt(String::length))
        );
        System.out.println("Elementos com a letra R no nome: " +
                estudantes.stream().filter((estudante) ->
                        estudante.toLowerCase(Locale.ROOT).contains("r")
                )
                .collect(Collectors.toList())
        );
        System.out.println("Retorna nova coleção com quantidade de letras: " +
                estudantes.stream().map(estudante ->
                    estudante.concat(" - ").concat(String.valueOf(estudante.length()))
                )
                .collect(Collectors.toList())
        );
        System.out.println("Três primeiros elementos: " + estudantes.stream().limit(3)
                .collect(Collectors.toList())
        );
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println)
                .collect(Collectors.toList())
        );
        System.out.print("Exibe cada elemento: ");
        estudantes.stream().forEach(System.out::println);
        System.out.println("Todos os elementos tem W no nome? " + estudantes.stream().allMatch(
                (elemento) -> elemento.contains("W")
        ));
        System.out.println("Tem algum elemento com a minusculo no nome? " + estudantes.stream().anyMatch(
                (elemento) -> elemento.contains("a")
        ));
        System.out.println("Não tem nenhum elemento com a minusculo no nome? " + estudantes.stream().noneMatch(
                (elemento) -> elemento.contains("a")
        ));
        System.out.print("Retorna o primeiro elemento: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        System.out.print("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase(Locale.ROOT).contains("r")
                )
                .collect(Collectors.toList())
                //.collect(Collectors.joining(", "))
                //.collect(Collectors.toSet())
                //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1)))
        );
    }
}
