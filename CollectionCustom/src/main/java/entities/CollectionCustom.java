package entities;

import java.util.LinkedList;
import java.util.List;

public class CollectionCustom{

    LinkedList<String> clients = new LinkedList<>();

    /**
     * Este método retorna el tamaño del arreglo de objetos tipo client
     * @author Fredy Montaña
     */
    public int sizeCollection() {
        return clients.size();
    }

    /**
     * Este método permite imprimir todos los elementos existentes dentro de la lista
     * @author Fredy Montaña
     */
    public List<String> getClients() {
        return clients;
    }

    /**
     * Este método permite agregar un elemento al arreglo
     * @author Fredy Montaña
     */
    public void add(Client client) {
        clients.add(String.valueOf(client));
    }

    /**
     * Este método permite agregar un objeto client al inicio del arreglo
     * @author Fredy Montaña
     */
    public void addFirst(Client client) {
        clients.addFirst(String.valueOf(client));
    }

    /**
     * Este método permite agregar un objeto client al final del arreglo
     * @author Fredy Montaña
     */
    public void addLast(Client client) {
        clients.addLast(String.valueOf(client));
    }

    /**
     * Este método permite remover un objeto cliente del arreglo
     *
     * @author Fredy Montaña
     */
    public boolean remove(Client client) {
        return clients.remove(client);
    }

    /**
     * Este método permite validar si la colección se encuentra vacía
     * @author Fredy Montaña
     */
    public boolean isEmpty() {
        return clients.isEmpty();
    }
}
