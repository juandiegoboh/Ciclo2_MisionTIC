package s_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class S1_Main {
    public static void main(String[] args) {

        S2_ClienteBanco cliente1 = new S2_ClienteBanco("Jas1", 250);
        S2_ClienteBanco cliente2 = new S2_ClienteBanco("Jas2", 650);
        S2_ClienteBanco cliente3 = new S2_ClienteBanco("Jas3", 750);

 /*       // Arreglo de objetos
        S2_ClienteBanco objArregloDatos[] = new S2_ClienteBanco[4];
        objArregloDatos[0] = cliente1;
        objArregloDatos[1] = cliente2;
        objArregloDatos[2] = cliente3;
        objArregloDatos[3] = new S2_ClienteBanco("Jas4", 1534, 850);

        for (int i = 0; i < objArregloDatos.length; i++) {
            System.out.println("Nombre: " + objArregloDatos[i].getNombre());
            System.out.println("Número de Cuenta: " + objArregloDatos[i].getNumCuenta());
            System.out.println("Saldo en la Cuenta: $" + objArregloDatos[i].getSaldoCuenta());
            System.out.println("-------------------------------------------------");
        }*/

        System.out.println("----------------------------------------------");
        System.out.println("ArrayList");
        ArrayList <S2_ClienteBanco> listaClientes = new ArrayList<>();
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(new S2_ClienteBanco("Jas4", 850));

        System.out.println("--------------------------------------");
        System.out.println("Recorre la lista con foreach");
        System.out.println("--------------------------------------");

        for (S2_ClienteBanco i: listaClientes) {
            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Número de Cuenta: " + i.getNumCuenta());
            System.out.println("Saldo de Cuenta: " + i.getSaldoCuenta());
            System.out.println("-----------------------------------------");
        }

        System.out.println("--------------------------------------");
        System.out.println("Recorre la lista con fori");
        System.out.println("--------------------------------------");

        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println("Valor de i: " + i);
            System.out.println("Nombre: " + listaClientes.get(i).getNombre());
            System.out.println("Número de Cuenta: " + listaClientes.get(i).getNumCuenta());
            System.out.println("Saldo de Cuenta: " + listaClientes.get(i).getSaldoCuenta());
            System.out.println("-----------------------------------------");
        }

        System.out.println("--------------------------------------");
        System.out.println("Recorre la lista con iterator");
        System.out.println("--------------------------------------");

        Iterator <S2_ClienteBanco> objetoIter = listaClientes.iterator();
        while (objetoIter.hasNext()){
            S2_ClienteBanco elemento = objetoIter.next();
            System.out.println("Nombre: " + elemento.getNombre());
            System.out.println("Número de Cuenta: " + elemento.getNumCuenta());
            System.out.println("Saldo de Cuenta Antes: " + elemento.getSaldoCuenta());
            elemento.setSaldoCuenta(elemento.getSaldoCuenta() - 100);
            System.out.println("Saldo de Cuenta Después: " + elemento.getSaldoCuenta());
            System.out.println("-----------------------------------------");
        }

        System.out.println("-----------------------------------------");
        System.out.println("Convertir lista en arreglo de datos y recorrer");
        System.out.println("-----------------------------------------");

        S2_ClienteBanco arregloDatos[] = new S2_ClienteBanco[listaClientes.size()];
        listaClientes.toArray(arregloDatos);
        System.out.println("-----------------------------------------");
        for (int i = 0; i < arregloDatos.length; i++) {
            System.out.println("Valor de i: " + i);
            System.out.println("Nombre: " + arregloDatos[i].getNombre());
            System.out.println("Número de Cuenta: " + arregloDatos[i].getNumCuenta());
            System.out.println("Saldo de Cuenta: " + arregloDatos[i].getSaldoCuenta());
            System.out.println("-----------------------------------------");
        }

    }
}
