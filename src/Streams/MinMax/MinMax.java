package Streams.MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMax {

    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Celular", 3000),
                new Produto("Computador", 5500),
                new Produto("Mouse", 100)
        );


        Optional<Produto> maisBarato = produtos.stream()
                .min(Comparator.comparingDouble(produto -> produto.preco));

        maisBarato.ifPresent(produto -> System.out.println("Produto mais barato: " + produto));

        System.out.println();
        System.out.println();
        System.out.println();

        Optional<Produto> maisCaro = produtos.stream()
                .max(Comparator.comparingDouble(produto -> produto.preco));

        maisCaro.ifPresent(produto -> System.out.println("Produto mais caro: " + produto));
    }



}


class Produto{
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return nome + " - R$" + preco;
    }
}
