package Generics;

import java.util.List;

public class ListaGenerics {

    public static <TipoGenerico> TipoGenerico getUltimo(List<TipoGenerico> lista){
        return lista.get(lista.size() - 1);
    }



}
