package com.softserve.edu09.pt.Task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ArrayList<HeavyBox> boxList = new ArrayList<>();
        boxList.add(new HeavyBox(13,"Box"));
        boxList.add(new HeavyBox(23,"Bag"));
        boxList.add(new HeavyBox(15,"Socks"));
        boxList.add(new HeavyBox(145,"Table"));
        boxList.add(new HeavyBox(3,"Car"));

        print(boxList);

        boxList.get(0).setWeight(1);//Setting weight "1" to first element
        boxList.remove(boxList.size() - 1);//Removing last element

        System.out.println("After setting :");
        print(boxList);

        boxList.removeAll(boxList);//Removing all elements
        System.out.println("After removing elements : ");

        print(boxList);
    }

    public static void print(ArrayList<HeavyBox> boxList){

        if(boxList.isEmpty()){
            System.out.println("Empty list!");
        }else {
            for (HeavyBox box : boxList ){
                System.out.println(box);
            }
        }
    }
}
