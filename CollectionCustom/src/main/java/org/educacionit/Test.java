package org.educacionit;

import entities.CollectionCustom;

import java.util.Scanner;

public class Test {

    CollectionCustom customArray = new CollectionCustom();
    static Scanner keyboard = new Scanner(System.in);

    /**
     * Este método permite seleccionar la opción para poder interactuar con el programa
     * @param option
     * @author Fredy Montaña
     */
    public void runOption(int option) {
        switch (option) {
            case 1:
                customArray.addObject();
                System.out.println("Client add successfully\n");
                break;
            case 2:
                customArray.addFirst();
                System.out.println("Client add successfully\n");
                break;
            case 3:
                customArray.addLast();
                System.out.println("Client add successfully\n");
                break;
            case 4:
                if (customArray.isEmpty()) {
                    System.out.println("The array is empty\n");
                } else {
                    System.out.println("The array is not empty\n");
                }
                break;
            case 5:
                System.out.println("The array has a size of " + customArray.sizeArray() + " positions");
                break;
            case 6:
                System.out.println(customArray.getClients());
                break;
            default:
                if(option > 6) {
                    System.out.println("The value input is not valid. The program will be closed");
                    customArray.exit();
                }
                break;
        }
    }

    /**
     * Este método permite mostrar el menú de opciones al usuario
     * @author Fredy Montaña
     */
    public void showMenu() {
        String menu = "1. Add client";
        menu += "\n2. Add client in first position";
        menu += "\n3. Add client in last position";
        menu += "\n4. Validate if the array is empty";
        menu += "\n5. Validate the size of array";
        menu += "\n6. Print all the clients";
        System.out.println(menu);
        System.out.println("Please choose an option: ");
        int option = Integer.parseInt(keyboard.next());
        runOption(option);
        showMenu();
    }

    /**
     * Este método se encarga de hacer el llamado de todos los métodos de la clase Test
     * @param args
     */
    public static void main(String[] args) {
        Test test = new Test();
        test.showMenu();
        keyboard.close();
    }
}
