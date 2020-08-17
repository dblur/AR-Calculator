import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class main {
    public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Калькулятор запущен");
            System.out.println("Введите пример с арабскими или римскими цифрами через пробел");
            System.out.println("Числа должно быть больше 0 и меньше 10");
            System.out.println("Оба числа должны быть или арабскими или римскими!");
            System.out.println("Пример: 1 + 2 или IV + I");
            String values = reader.readLine();    // Считываем переменные
            String result = Operation.Result(values);   // Делаем расчет при помощи класса Operation
            System.out.println(result);   // Вывод результата
        }
    }

