package org.example.class8;

public class Iphone10 {
    void takePics(){
        System.out.println("Can take pics from two back cameras");
    }

    void playVideos(){
        System.out.println("Can play videos for 6 hours");
    }

    void storageData(){
        System.out.println("Can Store upto 128GB");
    }

}
 class Iphone11 extends Iphone10{

     void looks(){
         System.out.println("brand new design");
     }
 }

 class Iphone12 extends Iphone11{
      void takePics(){
         System.out.println("Can take pics from 3 back cameras");
     }
 }

