package com.softserve.edu04.hw.Task1;

public class Numbers {
    private double firstNumber;
    private double secondNumber;
    private double thirdNumber;

    public Numbers(double firstNumber, double secondNumber, double thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getThirdNumber() {
        return thirdNumber;
    }


    public static void checkRange(Numbers number){

        int notInRange = 0;
        double [] outOfRangeValues = new double[3];
        double [] arr = new double[3];

        arr[0] = number.getFirstNumber();
        arr[1] = number.getSecondNumber();
        arr[2] = number.getThirdNumber();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < -5.0 || arr[i] > 5.0 ){
                notInRange++;
                outOfRangeValues[notInRange - 1] = arr[i];
            }
        }

        if (notInRange != 0 ){

            System.out.println("\nThere are numbers outside of range!");
            for (int i = 0; i < notInRange; i++) {
                System.out.print(outOfRangeValues[i] + " ");
            }

        } else {
            System.out.println("\nOk");
        }

    }


}
