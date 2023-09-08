package tech.gabrilOliveira.Main;

import tech.gabrilOliveira.Aplicacoes.model.Jogador;
import tech.gabrilOliveira.Aplicacoes.negocios.JogadorImpl;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        Principal p = new Principal();
        JogadorImpl jogImpl = new JogadorImpl();
        String enderecoDir = "C:\\Users\\Gabriel\\Desktop\\Java_AWS\\java-Stream-Api\\src\\main\\java\\tech\\gabrilOliveira";
        String nomeArquivo = "jogadores.txt";
        List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "\\" + nomeArquivo));
        if (!jogImpl.verificarArquivoExiste(Paths.get(enderecoDir))){
            System.out.println("Arquivo não encontrado");
        }
        else
        {
            jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);
            jogImpl.imprimirJogadorMaisVelho(listaDeJogadores);
            jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
            System.out.println("A media de idade : " + jogImpl.calcularMedia(listaDeJogadores));
            System.out.println("Somatorio de Gols : " + jogImpl.imprimirSomatoriosGols(listaDeJogadores));
            jogImpl.agruparJogadores(listaDeJogadores);



        }
    }
}

