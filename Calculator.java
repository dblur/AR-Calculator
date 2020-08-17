class Calculator {  // Арифметические операции
    static int CalcArNum(int a, int b, char operation) throws NumberFormatException {
        int result;
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
            default:
                throw new NumberFormatException("Неверный знак");
        }
        return result; // Возвращаем результат вычисления
    }
}