package net.greet;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Greet greet = new Greet();

        Scanner scanner = new Scanner(System.in);

        boolean execute= true;

        while (execute) {
            System.out.print("Enter a command: " + "\n Or Enter help for help menu \n");
            String name = scanner.nextLine();

            String[] splitStrings = name.split(" ");

            String command = "";
            String userName = "";
            String lang = "";

            if(splitStrings.length == 1){
                command = splitStrings[0];
            }else if(splitStrings.length == 2){
                command = splitStrings[0];
                userName = splitStrings[1];
            }else if(splitStrings.length == 3){
                command = splitStrings[0];
                userName = splitStrings[1];
                lang = splitStrings[2];
            }
            if(command.equals("greet")){
                greet.checkUser(userName, lang);
            }else if(command.equals("counter")){
                System.out.println(greet.counter());
            }else if(command.equals("exit")){
                execute = false;
                System.out.println("Good bye!!");
                break;
            }
        }





    }
}
