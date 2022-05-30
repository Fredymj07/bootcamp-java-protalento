package entities;

import java.util.Scanner;

public class CollectionCustom{

    Client[] clients;
    Scanner keyboard = new Scanner(System.in);

    /**
     * Este método retorna el tamaño del arreglo de objetos tipo client
     * @author Fredy Montaña
     */
    public int sizeArray() {
        return clients.length;
    }

    /**
     * Este método permite imprimir todos los elementos existentes dentro del arreglo
     * @author Fredy Montaña
     */
    public String getClients() {
        String client = "";
        for (int i = 0; i < clients.length; i++) {
            client = (i + 1) + " -> " + clients[i].toString();
        }
        return client;
    }

    public Client captureClientData() {
        System.out.println("Please input the data of client separated by &: ");
        String input = keyboard.nextLine();
        String[] data = input.split("&");
        String name = data[0];
        String lastName = data[1];
        String age = data[2];
        String typeDocument = data[3];
        String numberDocument = data[4];

        return new Client(name, lastName, age, typeDocument, numberDocument);
    }

    /**
     * Este método permite agregar un elemento al arreglo
     * @author Fredy Montaña
     */
    public void addObject() {
        clients = new Client[1];
        if (clients[0] == null) {
            clients[0] = captureClientData();
        } else {
            // Se crea un arreglo auxiliar para poder agregar una nueva posición al arreglo
            Client[] arrayAuxiliary = new Client[clients.length + 1];
            arrayAuxiliary[arrayAuxiliary.length - 1] = captureClientData();
            for (int i = 0; i < clients.length; i++) {
                // Se agregan los datos de tipo Client en el arreglo auxiliar
                arrayAuxiliary[i] = captureClientData();
            }
            // Se asigna el valor del arreglo auxiliar al arreglo original que ya cuenta con una nueva posición
            clients = arrayAuxiliary;
        }
    }

    /**
     * Este método permite agregar un objeto client al inicio del arreglo
     * @author Fredy Montaña
     */
    public void addFirst() {
        clients = new Client[1];
        Client[] arrayAuxiliary = new Client[clients.length + 1];
        arrayAuxiliary[0] = captureClientData();
        for (int i = 0; i < clients.length; i++) {
            arrayAuxiliary[i] = clients[i];
        }
    }

    /**
     * Este método permite agregar un objeto client al final del arreglo
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
     * @author Fredy Montaña
     */
    public boolean isEmpty() {
        return clients.length == 0;
    }

    /**
     * Este método permite cerrar la instancia de Scanner y salir del programa
     * @author Fredy Montaña
     */
    public void exit() {
        keyboard.close();
        System.exit(0);
    }
}
