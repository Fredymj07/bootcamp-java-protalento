package com.company;

import java.util.Scanner;

/*
     La escuela primaria xyz solicita el desarrollo de una aplicación para poder llevar el control
     de notas para cada alumno. El programa solicitará el ingreso de la cantidad de alumnos a procesar.
     Para cada alumno se deberá ingresar los siguientes datos:
     - nombre (string)
     - apellido (string)
     - número de examen
     - nota que obtubo el alumno (númerico >=0 <=10)
     Al finalizar la carga de datos, se procederá a listar la siguiente información:
     1- alumno/s con la calificación mas alta
     2- alumno/s con la calificación mas baja
     3- alumnos que promocionan, aquellos que obtubieron un promerdio >= 7
     4- alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7
*/

public class StudentGradeControl {

    private int numberOfStudents;
    private int numberOfNotes;
    private String [] name;
    private String [] lastName;
    private int [] note;
    private int addition = 0;
    private int average = 0;
    private int [] averageList;
    Scanner keyboard = new Scanner(System.in);

    public void inputStudent(){
        //Se captura la cantidad de estudiantes que se desean procesar
        System.out.println("Please input the amount of students than you like process: ");
        numberOfStudents = keyboard.nextInt();
        while (numberOfStudents <= 1){
            System.out.println("You should input more than one student for continue. Please input the amount of students than you like process: ");
            numberOfStudents = keyboard.nextInt();
        }

        //Se captura la cantidad de notas que se desean procesar por cada estudiante
        System.out.println("Please input the amount of notes than you like process: ");
        numberOfNotes = keyboard.nextInt();
        while (numberOfNotes <= 1){
            System.out.println("The amount of the notes is invalid. Please input the amount again: ");
            numberOfNotes = keyboard.nextInt();
        }

        //Se realiza la captura de los nombres, apellidos y notas de los estudiantes
        name = new String[numberOfStudents];
        lastName = new String[numberOfStudents];
        note = new int[numberOfNotes];
        averageList = new int[numberOfStudents];
        for (int i = 0; i < name.length; i++){
            System.out.println("Please input the name of the student: ");
            name[i] = keyboard.next();
            System.out.println("Please input the lastname of the student: ");
            lastName[i] = keyboard.next();

            //Se realiza la captura de las notas por cada estudiante
            for (int j = 0; j < note.length; j++){
                System.out.println("Please input the nota of the student: ");
                note[j] = keyboard.nextInt();
                addition += note[j];
                average = addition /numberOfNotes;
                if ((j + 1) == numberOfNotes){
                    addition = 0;
                }
            }
            averageList[i] += average;
        }
    }

//    public void higherNote(){
//        int higherAverage = 0;
//        int appliedStudent = 0;
//        higherAverage = note[0];
//        for (int i = 0; i < name.length; i++){
//            if (note[i] > higherAverage){
//                higherAverage = note[i];
//                appliedStudent = i;
//            }
//        }
//    }

    public static void main(String[] args) {
        StudentGradeControl control = new StudentGradeControl();
        control.inputStudent();
    }
}