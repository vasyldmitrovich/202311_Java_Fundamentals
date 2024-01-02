package com.softserve.edu7.pt.pt2;

class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(""+ getName() +":" + TYPE_PERSON);
    }


    @Override
    public int salary() {
        return 10000;
    }
}
