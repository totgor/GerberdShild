package com.gerberdshild.javalanguage.multithreadedprogramming.golovach_14;

//ѕосле залета первого потока в synchronized метод, остальные потоки закидывает в множество (Blocked - Set).
//“.к. ѕервый поток заблокировал монитор - synchronized методом и €вл€етс€ его владельцем.
//ѕосле завершени€ работы первого потока монитор освобождаетс€ и владелец отсуствует.
//“еперь планировщик виртуальной машины достает первый попавшийс€ в произвольном пор€дке поток из Blocked-Set и начинает его выполнение.
//» так пока все потоки в Blocked Set не завершат свою работу.
public class BlockedSet {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int tmp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    hello(tmp);
                }
            }).start();
        }
    }

    public static synchronized void hello(int id) {
        System.out.println(id + ": I'm here.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}
