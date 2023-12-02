package com.softserve.edu04.hw04;

public enum Season {

        WINTER ("Winter exams"), SPRING ("Second semester"), SUMMER ("Vacation period"), AUTUMN ("First semester");

        private final String name;
        Season (String name) {
                this.name = name;
        }
        public String getName() {
                return name;
        }
}
