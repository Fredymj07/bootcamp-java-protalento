package entities;

import java.util.Arrays;
import java.util.Scanner;

public class CollectionCustom {

    Client client = new Client();
    Client[] clients = new Client[1];
    Scanner keyboard = new Scanner(System.in);

    /**
     * Este método retorna el tamaño del arreglo de objetos tipo client
     *
     * @author Fredy Montaña
     */
    public int sizeArray() {
        return clients.length;
    }

    /**
     * Este método permite imprimir todos los elementos existentes dentro del arreglo
     *
     * @author Fredy Montaña
     */
    public void getClients() {
        try {
            for (int i = 0; i < clients.length; i++) {
                System.out.println((i + 1) + " -> " + clients[i].toString());
            }
        } catch (Exception e) {
            System.out.println("The list of clients is empty.");
        }
    }

    public void captureClientData() {
        System.out.println("Please input the data of client separated by &: ");
        String input = keyboard.nextLine();
        String[] data = input.split("&");
        client.setName(data[0]);
        client.setLastName(data[1]);
        client.setAge(data[2]);
        client.setTypeDocument(data[3]);
        client.setNumberDocument(data[4]);
    }

    /**
     * Este método permite agregar un elemento al arreglo
     *
     * @author Fredy Montaña
     */
    public void addObject() {
        captureClientData();
        client = new Client(client.getName(), client.getLastName(), client.getAge(), client.getTypeDocument(), client.getNumberDocument());
        if (clients[0] == null) {
            clients[0] = client;
        } else {
            Client[] clientsAuxiliar = new Client[clients.length + 1];
            clientsAuxiliar[clientsAuxiliar.length - 1] = client;
            for (int i = 0; i < clients.length; i++) {
                clientsAuxiliar[i] = clients[i];
            }
            clients = clientsAuxiliar;
        }
    }

    /**
     * Este método permite agregar un objeto client al inicio del arreglo
     *
     * @author Fredy Montaña
     */
    public void addFirst() {
        if (clients[0] == null) {
            clients[0] = client;
        } else {
            Client[] arrayAuxiliary = new Client[clients.length + 1];
            arrayAuxiliary[0] = client;
            for (int i = 0; i < clients.length; i++) {
                arrayAuxiliary[i] = clients[i];
            }
        }
    }

    /**
     * Este método permite agregar un objeto client al final del arreglo
     *
     * @author Fredy Montaña
     */
    public void addLast() {
        clients = new Client[1];
        System.out.println("");
    }

    /**
     * Este método permite remover un objeto cliente del arreglo
     *
     * @author Fredy Montaña
     */
    public boolean remove() {
        return false;
    }

    /**
     * Este método permite validar si la colección se encuentra vacía
     *
     * @author Fredy Montaña
     */
    public boolean isEmpty() {
        return clients.length == 0;
    }

    /**
     * Este método permite cerrar la instancia de Scanner y salir del programa
     *
     * @author Fredy Montaña
     */
    public void exit() {
        keyboard.close();
        System.exit(0);
    }
}
