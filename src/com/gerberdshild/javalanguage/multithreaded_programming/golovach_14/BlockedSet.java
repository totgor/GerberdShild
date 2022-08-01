package com.gerberdshild.javalanguage.multithreaded_programming.golovach_14;

//После залета первого потока в synchronized метод, остальные потоки закидывает в множество (Blocked - Set).
//Т.к. Первый поток заблокировал монитор - synchronized методом и является его владельцем.
//После завершения работы первого потока монитор освобождается и владелец отсуствует.
//Теперь планировщик виртуальной машины достает первый попавшийся в произвольном порядке поток из Blocked-Set и начинает его выполнение.
//И так пока все потоки в Blocked Set не завершат свою работу.
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
