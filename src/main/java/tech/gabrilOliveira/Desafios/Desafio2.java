package tech.gabrilOliveira.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Desafio2 {
    //Desafio 2 - Imprima a soma dos números pares da lista:
    //Utilizando uma API Stream, perceba a soma dos números pares da lista e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,8,10);

        BinaryOperator<Integer> somar = (n1,n2) -> n1+n2;

    int resultado=numeros.stream()
                .filter(n->n % 2 ==0)
                .reduce(0,somar);
        System.out.println(resultado);



    }
}
