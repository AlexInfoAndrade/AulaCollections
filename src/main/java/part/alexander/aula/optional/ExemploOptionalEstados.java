package part.alexander.aula.optional;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        System.out.println("Valor optional que está presente");
        Optional<String> optionalString = Optional.of("\tValor presente");
        //optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está pressente"));
        //optionalString.ifPresent(System.out::println);
        System.out.println(optionalString.orElse("\tValor não presente"));

        System.out.println("Valor optional que não está presente");
        Optional<String> optionalNull = Optional.ofNullable(null);
        //optionalNull.ifPresent(System.out::println);
        System.out.println(optionalNull.orElse("\tNull - Valor não presente"));

        System.out.println("Valor optional que não está presente");
        Optional<String> optionalEmpty = Optional.empty();
        //optionalEmpty.ifPresent(System.out::println);
        System.out.println(optionalEmpty.orElse("\tEmpty - Valor não presente"));

        System.out.println("Valor optional que lança erro NullPointerException");
        Optional<String> optionalNullErro = Optional.of(null);
        //optionalNullErro.ifPresent(System.out::println);
        System.out.println(optionalNullErro.orElse("\tException - Valor não presente"));
    }
}
