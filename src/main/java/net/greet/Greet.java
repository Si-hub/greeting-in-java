package net.greet;

import java.util.HashMap;
import java.util.Map;

public class Greet {
    HashMap<String, Integer> userList =new HashMap<>();

    public  void checkUser (String name, String language){

        name = name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase();

        if(!userList.containsKey(name)){
            userList.put(name, 1);
        }else if(userList.containsKey(name)){
            userList.put(name, userList.get(name) + 1);
        }
        System.out.println(Languages.valueOf(language).getLanguage() + name);

    }

    public String counter(){
        //counter for every one
        int count = userList.size();
        return "Number of users greeted is: " + count;
    }

  public int removeUserCounter(String name){

      name = name.substring(0,1).toUpperCase()
              + name.substring(1).toLowerCase();


      int counter = 0;

       if(userList.get(name) > 0){
           //userList.remove(name);
           counter = userList.get(name);
           counter--;
           userList.put(name, counter);
           System.out.println("Removed: " + name);

           if (counter == 0) {
               userList.remove(name);
           }
        }
       return counter;
    }

    public void clear(){
        int count = 0;
        if(!userList.isEmpty()){
            userList.clear();
            System.out.println("Data is successfully cleared!");
        }else {
            System.out.println("Opps! you cant clear because no user has been greeted");
        }
    }

    public void greeted() {

        if (!userList.isEmpty()) {

            // using for-each loop for iteration over Map.entrySet()
            for (Map.Entry<String,Integer> entry : userList.entrySet())
                System.out.println("Username : " + entry.getKey() +
                        ", Counter : " + entry.getValue());
        }
        else if (userList.isEmpty()){
            System.out.println("Opps!! no user has been greeted yet.");
        }

    }

    public String greetedUser(String userName){

        userName = userName.substring(0,1).toUpperCase()
                + userName.substring(1).toLowerCase();

        int counter = 0;
        if(userList.containsKey(userName)){
            counter = userList.get(userName);
        }
        return userName + " : " + counter;
    }
    public String help(){

        String helpText = "\nHelp Menu: \n" +
                "\nThe following are commands that will assist you on this App!!\n" +
                "\n 1.greet + your name + language(this will display a greeting with the selected language.\n" +
                "\n 2.greeted will display a list of all users that has been greeted and how many times each user has been greeted.\n" +
                "\n 3.greeted + your name will display  how many times you have been greeted( meaning only you).\n" +
                "\n 4.counter will display all people that were greeted  and then reset the counter to 0.\n" +
                "\n 5.RemoveUser + your name will delete/remove the greet counter for that specified user and decrement the greet by 1.\n" +
                "\n 6.Exit will exit or stops the program.\n" +
                "\n 7.Help will show you a menu of all possible commands that yuo can use from this App.\n";
        return helpText;
    }
}
