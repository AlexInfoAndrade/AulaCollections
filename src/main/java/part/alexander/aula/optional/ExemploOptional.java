package part.alexander.aula.optional;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opicional");

        System.out.println(optionalString.isPresent());

        optionalString.ifPresent(System.out::println);
        System.out.println(optionalString.orElse("Não tem valor presente"));

        if(optionalString.isPresent()){
            System.out.println(optionalString.get());
        }

        optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
        optionalString.orElseThrow(IllegalStateException::new);
    }
}
