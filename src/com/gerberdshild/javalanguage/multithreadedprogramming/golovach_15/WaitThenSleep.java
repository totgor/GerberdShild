package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_15;

//���������������� ������������� wait() � sleep() ��� �������.
//������ ����� �������� � ����� hello() � �������� wait()
//��� sleep() �������� �� ������� �������� �� ��������� Blocked - Set
public class WaitThenSleep {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            final int tmp = i;
            new Thread ( new Runnable() {
                public void run() {
                    hello(tmp);
                }
            }).start();
        }
    }

    public static synchronized void hello(int id) {
        System.out.println(id + ": * - wait - sleep :" + System.currentTimeMillis());
        try {
            WaitThenSleep.class.wait(1000);
        } catch ( InterruptedException ignore){/*NOP*/}
        System.out.println(id + ": wait - * - sleep :" + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {/*NOP*/}
        System.out.println(id + ": wait - sleep - * :" + System.currentTimeMillis());
    }
}
