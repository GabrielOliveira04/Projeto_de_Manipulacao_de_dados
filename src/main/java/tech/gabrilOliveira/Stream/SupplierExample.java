package tech.gabrilOliveira.Stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá seja bem vindo(a)!";


        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList()); // ou poderia apenas botar o toList;


        listaSaudacao.forEach(System.out::println);






    }
}
