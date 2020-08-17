class Calculator {  // Арифметические операции
    static int CalcArNum(int a, int b, char operation) throws NumberFormatException {
        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result; // Возвращаем результат вычисления
    }
}