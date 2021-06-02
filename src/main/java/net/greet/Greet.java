package net.greet;

import java.util.HashMap;

public class Greet {
    HashMap<String, Integer> userList =new HashMap<>();

    public  void checkUser (String name, String language){

        if(!userList.containsKey(name)){
            userList.put(name, 1);
        }else if(userList.containsKey(name)){
            userList.put(name, userList.get(name + 1));
        }
        System.out.println(Languages.valueOf(language).getLanguage() + name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase()); //first letter must be Capital and others small letters
    }

    public String counter(){

        int count = userList.size();
        return "Number of users greeted is: " + count;
    }

  public void removeUser(String name){
       if(userList.containsKey(name)){
           userList.remove(name);
           System.out.println("Removed: " + name);
        }
    }

    public void clear(){
        if(!userList.isEmpty()){
            userList.clear();
            System.out.println("Cleared!");
        }
    }
}
