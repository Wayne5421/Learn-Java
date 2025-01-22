package Streams.Streams;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class FiltrarNome {


    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Caio");
        nomes.add("Gabriel");
        nomes.add("Lucas");
        nomes.add("Luiza");


        List<String> nomesComL = nomes.stream()
                .filter(nome -> nome.startsWith("L"))
                .collect(Collectors.toList());


        nomesComL.forEach(System.out::println);



    }




}
