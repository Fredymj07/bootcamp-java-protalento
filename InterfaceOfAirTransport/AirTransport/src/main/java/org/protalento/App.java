package org.protalento;

import Entities.Helicopter;
import Entities.HotAirBalloon;
import Entities.Plane;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Helicopter helicopter;
        Plane plane;
        HotAirBalloon hotAirBalloon;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the data of the means of transport that will use the runway: ");
        System.out.println("Please enter the name: ");
        String name = keyboard.next();
        name = name.toLowerCase();
        System.out.println("Please enter the maker: ");
        String maker = keyboard.next();
        System.out.println("Please enter the number of engines: ");
        byte numberOfEngines = keyboard.nextByte();
        System.out.println("Please enter the number of tires: ");
        byte numberOfTires = keyboard.nextByte();

        switch (name) {
            case "helicopter":

                System.out.println("Please enter the model: ");
                String model = keyboard.next();
                System.out.println("Please enter the use type: ");
                String useType = keyboard.next();

                helicopter = new Helicopter(
                        name,
                        maker,
                        numberOfEngines,
                        numberOfTires,
                        model,
                        useType
                );
                System.out.println(helicopter.showTransportName());
                System.out.println(helicopter.landVertically());
                System.out.println(helicopter.landHorizontally());
                break;

            case "plane":

                System.out.println("Please enter the number of seats: ");
                byte numberOfSeats = keyboard.nextByte();

                plane = new Plane(
                        name,
                        maker,
                        numberOfEngines,
                        numberOfTires,
                        numberOfSeats
                );
                System.out.println(plane.showTransportName());;
                System.out.println(plane.landHorizontally());;
                System.out.println(plane.landVertically());
                break;

            case "hot":

                System.out.println("Please enter the number of passengers: ");
                int numberOfPassengers = keyboard.nextInt();
                System.out.println("Please enter the type: ");
                String type = keyboard.next();

                hotAirBalloon = new HotAirBalloon(
                        name,
                        maker,
                        numberOfEngines,
                        numberOfTires,
                        numberOfPassengers,
                        type
                );
                System.out.println(hotAirBalloon.showTransportName());;
                System.out.println(hotAirBalloon.landVertically());;
                System.out.println(hotAirBalloon.landHorizontally());;
                break;

            default:
                System.out.println("The means of transport can´t land.");
                break;
        }
    }
}