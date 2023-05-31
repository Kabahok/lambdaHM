package task2;

@FunctionalInterface
public interface OnTaskErrorListenner {
    void onError(String result);
}
