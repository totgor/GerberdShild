package com.gerberdshild.javalanguage.enum_auto_boxing_annotations.enumeration.part_05;

//В перечислении можно реализовать интерфейс.
enum Apple implements Harvest{

    Jonathan(true), GoldenDel(false), RedDel(true), Winesap(true), Cortland(false);

    private boolean harvested;
    
    Apple(boolean harvested) {
        this.harvested = harvested;
    }

    public void setHarvested(boolean harvested) {
        this.harvested = harvested;
    }
    
    public boolean getHarvested() {
        return harvested;
    }
}

public class EnumAppleDemo {
    public static void main(String[] args) {
        for (Apple a : Apple.values())
            System.out.println("Урожай яблок сорта " + a + " собран: " + a.getHarvested());
        System.out.println();

        Apple ap = Apple.Winesap;
        ap.setHarvested(false);
        System.out.println("Урожай яблок сорта " + ap + " собран: " + ap.getHarvested());
    }
}
