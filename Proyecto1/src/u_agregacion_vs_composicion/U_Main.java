package u_agregacion_vs_composicion;

import java.util.ArrayList;
import java.util.Iterator;

public class U_Main {
    public static void main(String[] args) {
/*
        System.out.println("------------------------------------");
        U_Celular celular = new U_Celular();
        celular.mostrarInformacion();
        System.out.println("------------------------------------");
*/

        System.out.println("------------------------------------");
        U_Celular celular2 = new U_Celular("12547A","iPhone 11", "Samsung", 1200, 3);
        celular2.mostrarInformacion();
        System.out.println("------------------------------------");

        U_SimCard sim1 = new U_SimCard(3002569243L, "Tigo");
        celular2.agregarSimCard(sim1);
        celular2.mostrarInformacion();
        System.out.println("------------------------------------");

        U_SimCard sim2 = new U_SimCard(3153772530L, "Movistar");
        celular2.agregarSimCard(sim2);
        celular2.mostrarInformacion();
        System.out.println("------------------------------------");

        U_SimCard sim3 = new U_SimCard(3183023838L, "Claro");
        U_SimCard sim4 = new U_SimCard(3153023838L, "Claro");

        celular2.agregarSimCard(sim3);
        celular2.agregarSimCard(sim4);
        celular2.mostrarInformacion();
        System.out.println("------------------------------------");

        System.out.println("------------------------------------");
        System.out.println("Batería 1");
        U_Bateria bat1 = new U_Bateria();
        bat1.informacionBateria();

        System.out.println("------------------------------------");
        System.out.println("Batería 2");
        U_Bateria bat2 = new U_Bateria("AR7632J", 2000);
        bat2.informacionBateria();
        System.out.println("------------------------------------");

        ArrayList<U_SimCard> listaSim = new ArrayList<>();
        listaSim.add(sim1);
        listaSim.add(sim2);
        listaSim.add(sim3);
        listaSim.add(sim4);
        listaSim.add(new U_SimCard(3002569224L, "WOM"));

/*        for (U_SimCard i: listaSim) {
            System.out.println("Sim: " + i);
            i.informacionSimCard();
            if (i.getEmpresa().equals("Movistar")){
                System.out.println("Eliminar objeto empresa " + i.getEmpresa());
                listaSim.remove(i);
            }
            System.out.println("---");
        }*/

        System.out.println("------------------------------------");
        System.out.println("Recorrer lista Iterator y eliminar");

        Iterator<U_SimCard> i = listaSim.iterator();
        while (i.hasNext()){
            // i.next().informacionSimCard();
/*            System.out.println("Número: " + i.next().getNumero());
            System.out.println("Empresa: " + i.next().getEmpresa());*/
            U_SimCard elemento = i.next();      // Se crea una copia del objeto para no ejecutar el next() mas de una
            // vez
            System.out.println("Número: " + elemento.getNumero());
            System.out.println("Empresa: " + elemento.getEmpresa());
            if (elemento.getEmpresa().equals("Movistar")){
                System.out.println("Eliminar objeto empresa " + elemento.getEmpresa());
                i.remove();     // Se remueve directamente el iterador i
            }
            System.out.println("---");
        }

        System.out.println("Recorrer lista con fori");
        for (int j = 0; j < listaSim.size(); j++) {
            listaSim.get(j).informacionSimCard();
            if (j == listaSim.size() - 1){  // Para eliminar el último objeto de la lisa
                System.out.println("Eliminar objeto empresa " + listaSim.get(j).getEmpresa());
                listaSim.remove(j);     // Se remueve el objeto pero con el indice en la lista
                // listaSim.get(j).informacionSimCard();    // Ya no encuentra el objeto y arroja error

            }
            System.out.println("---");

        }

    }
}
