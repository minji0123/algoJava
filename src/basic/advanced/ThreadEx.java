package basic.advanced;
    // 동작하고 있는 프로그램을 프로세스(process)라고 한다.
    // 보통 한 개의 프로세스는 한 가지의 일을 한다.
    // 스레드(thread)를 이용하면 한 프로세스 내에서 두가지 이상의 일을 동시에 할 수 있다.

import java.util.ArrayList;

public class ThreadEx extends Thread{
    int seq;

    public ThreadEx(int seq) {
        this.seq = seq;
    }

    public void run() {  // Thread 를 상속하면 run 메서드를 구현해야 한다.
        System.out.println(this.seq + " thread start.");  // 쓰레드 시작
        try {
            Thread.sleep(1000);  // 1초 대기한다.
        } catch (Exception e) {
//            throw new RuntimeException();
        }
        System.out.println(this.seq + " thread end.");  // 쓰레드 종료
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
            Thread t = new ThreadEx(i);
            t.start();
            threads.add(t);
        }

        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다린다.
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");  // main 메서드 종료
    }
}
// 스레드를 활용한 프로그래밍을 할 때 가장 많이 실수하는 부분이
// 스레드가 종료되지 않았는데 스레드가 종료된 줄 알고 그다음 작업을 진행하게 만드는 일이다.
// 스레드가 모두 종료된 후 그다음 작업을 진행해야 할 때 join 메서드를 꼭 기억하자.
