package net.greet;

import java.util.HashMap;

public class Greet {
    HashMap<String, Integer> map =new HashMap<>();

    public  void checkUser (String name, String language){

        if(!map.containsKey(name)){
            map.put(name, 1);
        }else if(map.containsKey(name)){
            map.put(name, map.get(name + 1));
        }
        System.out.println(Languages.valueOf(language).getLanguage() + name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase()); //first letter must be Capital and others small letters
    }

    public String counter(){

        int count = map.size();
        return "Number of users greeted is: " + count;
    }

/*    public void greetedUsersCount(){
        if(){

        }
       map.remove();
    }

    public void clearValues(){
        String clearAll =  "";
        if(){

        }
        map.clear();
    }*/
}
