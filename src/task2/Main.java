package task2;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListenner listenner = System.out::println;
        OnTaskErrorListenner errorListenner = System.out::println;

        Worker worker = new Worker(listenner, errorListenner);
        worker.start();
    }
}
