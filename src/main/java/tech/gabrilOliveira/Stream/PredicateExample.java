package tech.gabrilOliveira.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "Kotlin", "Python","JavaScript","c","go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;


        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
