package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateDate {
    SimpleDateFormat dateFormat = new SimpleDateFormat();

    public Date inputDate(){
        Scanner keyboard = new Scanner(System.in);
        Date outDate = new Date();
        try{
            //Definición del formato para la fecha
            dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            //Se controla que SimpleDateFormat admita fechas inválidas
            dateFormat.setLenient(false);

            //Se captura la fecha por parte del usuario
            System.out.println("Please input the value for date in this format (day/month/year): ");
            String inputDate = keyboard.next();
            outDate = dateFormat.parse(inputDate);
        } catch (ParseException e){
            System.out.println("The entered date is invalid. The date don´t exist. " + e);;
        }
        return outDate;
    }

    public void validateDate() throws ParseException{
        Date dateValid = inputDate();
        try {
            //Encontrar el día de la fecha ingresada por el usuario
            dateFormat = new SimpleDateFormat("dd");
            String dayFormat = dateFormat.format(dateValid);
            int day = Integer.parseInt(dayFormat);
            System.out.println("day = " + day);

            //Encontrar el mes de la fecha ingresada por el usuario
            dateFormat = new SimpleDateFormat("MM");
            String monthFormat = dateFormat.format(dateValid);
            int month = Integer.parseInt(monthFormat);
            System.out.println("month = " + month);

            //Encontrar el año de la fecha ingresada por el usuario
            dateFormat = new SimpleDateFormat("yyyy");
            String yearFormat = dateFormat.format(dateValid);
            int year = Integer.parseInt(yearFormat);
            System.out.println("year = " + year);

            if(month == 2){
                //Verificación de año bisiesto
                if(((year % 4 == 0 && year % 100 != 0)) && (day >= 1 && day <= 29) && (year >= 1900 && year <= 2099)){
                    System.out.println("The date entered is valid for February " + day + "/" + month + "/" + year);
                }
            } else if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day >=1 && day <= 30) && (year >= 1900 && year <= 2099)){
                if(month == 4){
                    System.out.println("The date entered is valid for April " + day + "/" + month + "/" + year);
                } else if(month == 6){
                    System.out.println("The date entered is valid for June " + day + "/" + month + "/" + year);
                } else if(month == 9){
                    System.out.println("The date entered is valid for September " + day + "/" + month + "/" + year);
                } else {
                    System.out.println("The date entered is valid for November " + day + "/" + month + "/" + year);
                }
            } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day >= 1 && day <= 31) && (year >= 1900 && year <= 2099)){
                if (month == 1) {
                    System.out.println("The date entered is valid for January " + day + "/" + month + "/" + year);
                } else if (month == 3) {
                    System.out.println("The date entered is valid for March " + day + "/" + month + "/" + year);
                } else if (month == 5) {
                    System.out.println("The date entered is valid for May " + day + "/" + month + "/" + year);
                } else if (month == 7) {
                    System.out.println("The date entered is valid for July " + day + "/" + month + "/" + year);
                } else if (month == 8) {
                    System.out.println("The date entered is valid for August " + day + "/" + month + "/" + year);
                } else if (month == 10) {
                    System.out.println("The date entered is valid for October " + day + "/" + month + "/" + year);
                } else {
                    System.out.println("The date entered is valid for December " + day + "/" + month + "/" + year);
                }
            }
        } catch (Exception e) {
            System.out.println("The date entered is invalid. " + e.getMessage());
        }
    }

    public static void main(String[] args) throws ParseException {
        ValidateDate newDate = new ValidateDate();
        newDate.validateDate();
    }
}