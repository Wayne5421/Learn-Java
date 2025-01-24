package Generics;

public class Caixa<Generic> {

    private Generic coisa;

    public void guardar(Generic coisa){
        this.coisa = coisa;
    }

    public Generic abrir(){
        return coisa;
    }


}
