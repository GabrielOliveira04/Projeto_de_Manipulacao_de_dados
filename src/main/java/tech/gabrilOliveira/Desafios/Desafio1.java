package tech.gabrilOliveira.Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Desafio1 {

    //Desafio 1 - Mostrar a lista na ordem numérica:
    //Crie um programa que utiliza uma API Stream para ordenar a lista de números em ordem crescente e exiba no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,4,6,7,5,9,8,10,5,4,3,2,0);

        System.out.println("---Natural Sorting Por numero-----");
        Stream<Integer> numeros1 = numeros.stream().sorted(Comparator.naturalOrder());
        numeros1.forEach(n -> System.out.println("numero :" + n));




    }

}
