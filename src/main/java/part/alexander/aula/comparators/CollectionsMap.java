package part.alexander.aula.comparators;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsMap {

    public static void main(String[] args) {

        Map<Long, String> fornecedores = new HashMap<>();

        fornecedores.put(1L, "Carolina");
        fornecedores.put(2L, "Jeromel");
        fornecedores.put(3L, "Xiaver");
        fornecedores.put(4L, "Rodrigão");
        fornecedores.put(5L, "Alemão");
        fornecedores.put(6L, "Beatriz");

        System.out.println(fornecedores);

        /*
        entrySet obter o EntrySet
        stream iniciar a interação Stream
        sorted ordenar essa interação (Map.Entry.comparingByValue) pelo valor do map
        collect pegar os dados que estão sendo ordenado (Collector.toMap) e colocar em um novo map
         ((oldValue, newValue) -> oldValue) quando a key for repetida juntar o valor antigo com o novo
         na mesma key armazenar o resultado em uma instância de LinkedHashMap
        */
        Map<Long, String> fornecedoresSort = fornecedores
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                    )
                );

        System.out.println(fornecedoresSort);
    }
}
