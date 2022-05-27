package org.educacionit;

import entities.Client;
import entities.CollectionCustom;

public class Test {
    public static void main( String[] args ) {

        Client client1 = new Client("Fredy", "Montaña", (byte) 32, "CC", "1013609207");
        Client client2 = new Client("Lorena", "Gallón", (byte) 27, "CC", "1032472066");
        Client client3 = new Client("Thomás", "Montaña", (byte) 2, "RC", "1019848727");
        Client client4 = new Client("Alice", "Ocampo", (byte) 32, "CC", "1245874874");
        Client client5 = new Client("Marie", "Fernández", (byte) 34, "CC", "1254192654");
        Client client6 = new Client("Tamara", "Gallo", (byte) 32, "CC", "1025063547");
        Client client7 = new Client("Nelson", "Pataquiba", (byte) 32, "CC", "1542874201");
        Client client8 = new Client("Rolando", "Mota", (byte) 32, "CC", "1542923650");
        Client client9 = new Client("Karen", "Rojas", (byte) 32, "CC", "1203548741");
        Client client10 = new Client("Fernanda", "Millán", (byte) 32, "CC", "1250497854");

        CollectionCustom clients = new CollectionCustom();
        System.out.println("La colección está vacía? " + clients.isEmpty());

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);
        clients.add(client6);
        clients.add(client7);
        clients.add(client8);
        clients.add(client9);
        clients.add(client10);

        System.out.println("La colección está vacía? " + clients.isEmpty());

        System.out.println("La cantidad de elementos dentro de la lista es: " + clients.sizeCollection());

        System.out.println("El listado de elementos agregados a la lista es:");
        System.out.println(clients.getClients());

        Client client11 = new Client("Elver", "Gaitán", (byte) 25, "CC", "1215487454");
        Client client12 = new Client("Jorge", "Nieto", (byte) 27, "CC", "2515487451");
        clients.addFirst(client11);
        clients.addLast(client12);
        System.out.println(clients.getClients());

        System.out.println(clients.remove(client1));
    }
}
