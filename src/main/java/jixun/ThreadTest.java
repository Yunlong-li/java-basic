package jixun;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 多线程
 * @date 2023-09-12 15:59:29
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread printAThread = new PrintAThread();
        Thread printBThread = new Thread(new PrintBThread());
        printAThread.start();
        printBThread.start();
    }
}

class PrintAThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("AAAAAAAAA");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class PrintBThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("BBBBBBBBB");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
