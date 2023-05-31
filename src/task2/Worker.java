package task2;

public class Worker {
    private OnTaskDoneListenner callback;
    private OnTaskErrorListenner errorCallback;

    Worker (OnTaskDoneListenner callback, OnTaskErrorListenner errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    void start() {
        for (int i = 0; i < 100; i++) {
            if (i ==  33) {
                errorCallback.onError(String.format("Task %d is error!!!", i));
            }
            callback.onDone(String.format("Task %d is done", i));
        }
    }
}
