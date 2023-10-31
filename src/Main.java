public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); // переменная b становится 0
        int c = 0;
        try {
            c = calc.devide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println("деление на 0");
        }
        calc.println.accept(c);
    }
}

//    причина возникновения ошибки: переменная b в результате выполнения действия вычитания
//    в строке кода № 5 становится 0, в следствие чего в строке кода  № 8 происходит деление на 0 и возникает
//    ошибка, которая выбрасывает необрабатываемое исключение типа ArithmeticException.
//    для того чтобы программа не прерывала свою работу необходимо поместить блок выполнения деления в ключевые
//    слова обработки исключений try и catch, что позволит в случае возникновения исключения уведомить
//    об этом пользователя.
