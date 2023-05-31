package task2;

@FunctionalInterface
public interface OnTaskDoneListenner {
    void onDone(String result);
}
