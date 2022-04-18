package com.gerberdshild.javalanguage.operations;

//Применение сдвига влева в качестве умножения на 2
public class MultOnTwoByShift {
    public static void main(String[] args) {
        int num = 0xFFFFFFE; //запись в 16-чной форме
        System.out.println(num);
        for(int i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        } //После 4 сдвига тип int будет переполнен
    }
}
