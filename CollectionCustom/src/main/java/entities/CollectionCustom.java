package entities;

import java.util.LinkedList;

public class CollectionCustom{

    private String[] client;

    /**
     * Este método retorna el tamaño del arreglo de objetos tipo client
     * @return
     * @author Fredy Montaña
     */
    public int sizeCollection() {
        return client.length;
    }

    /**
     * Este método permite agregar un objeto client al inicio del arreglo
     * @param client
     * @author Fredy Montaña
     */
    public void addFirst(String client) {
        LinkedList clients = new LinkedList();
        clients.addFirst(client);
    }

    /**
     * Este método permite agregar un objeto client al final del arreglo
     * @param client
     * @author Fredy Montaña
     */
    public void addLast(String client) {
        LinkedList clients = new LinkedList();
        clients.addLast(client);
    }

    /**
     * Este método permite agregar un elemento al arreglo
     * @param client
     * @author Fredy Montaña
     */
    public void addObject(String client) {
        LinkedList clients = new LinkedList();
        clients.add(client);
    }
}
