package org.example.class12;

import java.util.Map;
import java.util.TreeMap;

public class E9Maps {
    static void main() {

        Map<Integer,String> personalInfos=new TreeMap<>();

        personalInfos.put(1,"Muhammad");
        personalInfos.put(4,"Adam");
        personalInfos.put(2,"Ali");
        personalInfos.put(5,"Black");
        personalInfos.put(3,"John");

        System.out.println(personalInfos.get(1));

        for(Integer n:personalInfos.keySet()){
            System.out.println(n);
        }

        for(String s:personalInfos.values()){
            System.out.println(s);
        }

        for(Integer n:personalInfos.keySet()){
            System.out.println(n+" "+personalInfos.get(n));
        }



    }
}
