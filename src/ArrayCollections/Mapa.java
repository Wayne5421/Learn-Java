package ArrayCollections;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {


        Map<String, Integer> idades = new HashMap<>();

        idades.put("Caio", 21);
        idades.put("Luiza", 18);
        idades.put("Gabriel", 23);

        System.out.println("Idade de Caio: " + idades.get("Caio"));


        //Saber se um valor existe

        if (idades.containsKey("Lucas")){
            System.out.println("Lucas existe no map e tem a idade de: " + idades.get("Lucas"));
        } else {
            System.out.println("Lucas não está no map");
        }

        //Todos os valores
        System.out.println();
        System.out.println("Pessoas na lista:");

        for (Map.Entry<String, Integer> entrada: idades.entrySet()){
            System.out.println("Nome: " + entrada.getKey() + "Idade: " + entrada.getValue());
        }



    }
}
