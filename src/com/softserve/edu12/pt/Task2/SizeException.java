package com.softserve.edu12.pt.Task2;

public class SizeException  {
    public static int validateSize (int size, String type) throws IllegalArgumentException{

        if((type.equals("PALM") || type.equals( "TREE"))
                && ( size <= 1 || size >= 25 )){

            throw new IllegalArgumentException("Size must be between 1m and 25m. Your input = " + size);

        } else if((type.equals("GRASS") || type.equals("BUSH"))
                && ( size <= 1 || size >= 50 )){

            throw new IllegalArgumentException("Size must be between 1cm and 50cm. Your input = " + size);

        } else if(type.equals("FLOWER")
                && ( size <= 1 || size >= 30 )){

           throw new IllegalArgumentException("Size must be between 1cm and 30cm. Your input = " + size);
        } else {
            return size;
        }
    }
}
