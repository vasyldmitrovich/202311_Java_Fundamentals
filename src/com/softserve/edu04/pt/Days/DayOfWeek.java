package com.softserve.edu04.pt.Days;

import java.util.Scanner;

public class DayOfWeek {

    enum DaysOfWeek {


        MONDAY("Monday", "Понеделник"),
        TUESDAY("Tuesday", "Вторник"),
        WEDNESDAY("Wednesday", "Сряда"),
        THURSDAY("Thursday", "Четвъртък"),
        FRIDAY("Friday", "Петък"),
        SATURDAY("Saturday", "Събота"),
        SUNDAY("Sunday", "Неделя");

        private final String nameInEnglish;
        private final String nameInBulgarian;

        DaysOfWeek(String nameInEnglish, String nameInBulgarian) {
            this.nameInEnglish = nameInEnglish;
            this.nameInBulgarian = nameInBulgarian;

        }

        public String getNameInEnglish() {
            return nameInEnglish;
        }

        public String getNameInBulgarian() {
            return nameInBulgarian;
        }

        public static String getDayName(int choice){

            DaysOfWeek day;

             day = switch (choice){

                 case 1 -> DaysOfWeek.MONDAY;
                 case 2 -> DaysOfWeek.TUESDAY;
                 case 3 -> DaysOfWeek.WEDNESDAY;
                 case 4 -> DaysOfWeek.THURSDAY;
                 case 5-> DaysOfWeek.FRIDAY;
                 case 6 -> DaysOfWeek.SATURDAY;
                 case 7 -> DaysOfWeek.SUNDAY;
                 default -> throw new IllegalStateException("Unexpected value: " + choice);
             };
          return "Day in english : " + day.getNameInEnglish()
                  + "\nDay in bulgarian : " + day.getNameInBulgarian();
        }


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Input day number of the day of the week");
            int choice = scanner.nextInt();

            System.out.println(getDayName(choice));

//            if(choice >= 1 && choice <= 7){
//                DaysOfWeek day = DaysOfWeek.values()[choice - 1];
//
//                System.out.println("Day in English : " + day.getNameInEnglish());
//                System.out.println("Day in Bulgarian : " + day.getNameInBulgarian());
//            } else {
//
//                System.out.println("Wrong choice");
//            }

        }
    }
}