package task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            // Так как мы делаем операцию вычитания, то в итоге получаем 0
            int b = calc.minus.apply(1,1);
            // В b у нас находится 0, мы пытаемся делить на 0. Чтобы избежать краша программы
            // ловим исключение и выводим сообщение о том, что происходит деление на 0
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (Exception e) {
            System.out.println("Вы делите на ноль!");
        }

    }
}
