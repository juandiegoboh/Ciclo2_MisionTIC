package u_agregacion_vs_composicion;

import java.util.*;

public class U2_Main_Map {
    public static void main(String[] args) {
        Map ejemploObjetoMapaHash = new HashMap();

        ejemploObjetoMapaHash.put("Clave 1", "Valor 1");
        ejemploObjetoMapaHash.put("Clave 2", "Valor 2");
        ejemploObjetoMapaHash.put("Clave 3", "Valor 3");
        ejemploObjetoMapaHash.put("Clave 4", "Valor 4");
        ejemploObjetoMapaHash.put("Clave 5", "Valor 5");

        System.out.println("Mapa tipo Hash");
        mostrar_elementos(ejemploObjetoMapaHash.keySet());
        mostrar_elementos(ejemploObjetoMapaHash.values());
        System.out.println("---------------------------------");

        SortedMap ejemploObjetoMapaTree = new TreeMap();
        ejemploObjetoMapaTree.put("Clave 1", "Valor 1");
        ejemploObjetoMapaTree.put("Clave 2", "Valor 2");
        ejemploObjetoMapaTree.put("Clave 3", "Valor 3");
        ejemploObjetoMapaTree.put("Clave 4", "Valor 4");
        ejemploObjetoMapaTree.put("Clave 5", "Valor 5");

        System.out.println("Mapa tipo Tree");
        mostrar_elementos(ejemploObjetoMapaTree.keySet());
        mostrar_elementos(ejemploObjetoMapaTree.values());
        System.out.println("---------------------------------");

        int a;
        a = 16;
        Integer b = 6;
        System.out.println("byte de " + b + ": " + b.byteValue());
        String c = "Jas";
        System.out.println("longitud de " + c + ": " + c.length());

    }

    private static void mostrar_elementos(Collection col) {
        Iterator iter = col.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");

    }

}
