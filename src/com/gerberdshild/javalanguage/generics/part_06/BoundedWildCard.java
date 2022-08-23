package com.gerberdshild.javalanguage.generics.part_06;

//Двухмерный координаты.
class TwoD {
    int x;
    int y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

//Трёхмерные координаты.
class ThreeD extends TwoD {
    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

//Четырёхмерные координаты.
class FourD extends ThreeD {
    int t;

    FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

// Обобщенный класс с ограниченным параметром типа. T - либо класс TwoD, либо его потомок.
// Хранит массив координатных объектов описанных выше.
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }
}

// Применение ограниченных метасимволов в качестве аругментов.
public class BoundedWildCard {
    
    // Cтатическая функция выводящая координаты XY класса Coords.
    static void showXY(Coords<?> obj) {
        System.out.println("Координаты X и Y:");
        for (int i = 0; i < obj.coords.length; i++) {
            System.out.println(obj.coords[i].x + " " + obj.coords[i].y);
        }
        System.out.println();
    }

    // Cтатическая функция выводящая координаты XYZ класса Coords.
    static void showXYZ(Coords<? extends ThreeD> obj) {
        System.out.println("Координаты X, Y и Z:");
        for (int i = 0; i < obj.coords.length; i++) {
            System.out.println(obj.coords[i].x + " " + obj.coords[i].y + " " + obj.coords[i].z);
        }
        System.out.println();
    }

    // Cтатическая функция выводящая координаты XYZT класса Coords.
    static void showAll(Coords<? extends FourD> obj) {
        System.out.println("Координаты X, Y, Z и T:");
        for (int i = 0; i < obj.coords.length; i++) {
            System.out.println(obj.coords[i].x + " " + obj.coords[i].y + " " + obj.coords[i].z + " " + obj.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] twoD_array = { new TwoD(1, 2),
                              new TwoD(4, 6),
                              new TwoD(31, 61), 
                              new TwoD(-12, -1)};

        FourD[] fourD_array = { new FourD(4, 0, 3, 6),
                                new FourD(-4, 2, -23, 12),
                                new FourD(21, 12, 34, 67),
                                new FourD(1, 1, 0, 0)};
        
        Coords<TwoD> twoD_obj = new Coords(twoD_array);
        Coords<FourD> fourD_obj = new Coords(fourD_array);

        System.out.println("Содержимое объекта twoD_obj:");
        showXY(twoD_obj);
        //showXYZ(twoD_obj); //ошибка не тип ThreeD или FourD
        //showAll(twoD_obj); //ошибка не тип  FourD
        System.out.println("Содержимое объекта fourD_obj:");
        showXY(fourD_obj);
        showXYZ(fourD_obj);        
        showAll(fourD_obj);
    }

}
