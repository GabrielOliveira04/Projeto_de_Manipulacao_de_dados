package tech.gabrilOliveira.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExample {
    public static void main(String[] args) {


    List<Integer> numeros =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);

   Function<Integer,Integer> dobrar = numero -> numero * 2;

    Function<Integer,Integer> triplicar = numero -> numero * 3;

    Function<Integer,Integer> quadriplicar =  numero -> numero * 4;

    List<Integer> calculadora = numeros.stream()
            .map(dobrar)
            .map(triplicar)
            .map(quadriplicar)
            .toList();



    calculadora.forEach(System.out::println);
}
}