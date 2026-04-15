package org.example.class12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E8Maps {
    static void main() {

        Map<Integer,String> personalInfos=new TreeMap<>();

        personalInfos.put(1,"Muhammad");
        personalInfos.put(4,"Adam");
        personalInfos.put(2,"Ali");
        personalInfos.put(5,"Black");
        personalInfos.put(3,"John");

        System.out.println(personalInfos);



    }
}
