import java.util.LinkedHashMap;
import java.util.Map;

// Класс перевода арабские цифр в римские

class ArabToRoman {
    static String RomanNumerals(int Int) {

        LinkedHashMap<String, Integer> roman = new LinkedHashMap<String, Integer>();
        roman.put("C", 100);
        roman.put("XC", 90);
        roman.put("L", 50);
        roman.put("XL", 40);
        roman.put("X", 10);
        roman.put("IX", 9);
        roman.put("V", 5);
        roman.put("IV", 4);
        roman.put("I", 1);
        StringBuilder res = new StringBuilder();

        for(Map.Entry<String, Integer> entry : roman.entrySet()){
            int matches = Int/entry.getValue();
            res.append(repeat(entry.getKey(), matches));
            Int = Int % entry.getValue();
        }
        return res.toString();
    }
    private static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s.repeat(Math.max(0, n)));
        return sb.toString();
    }
}

// Класс перевода римских цифр в арабские

class RomanToArab {
    private static int convertRec(String s) {
        if (s.isEmpty()) return 0;
        else if (s.startsWith("C")) return 100 + convertRec(s.substring(1));
        else if (s.startsWith("XC")) return 90 + convertRec(s.substring(2));
        else if (s.startsWith("L")) return 50 + convertRec(s.substring(1));
        else if (s.startsWith("XL")) return 40 + convertRec(s.substring(2));
        else if (s.startsWith("X"))  return 10   + convertRec(s.substring(1));
        else if (s.startsWith("IX")) return 9    + convertRec(s.substring(2));
        else if (s.startsWith("V"))  return 5    + convertRec(s.substring(1));
        else if (s.startsWith("IV")) return 4    + convertRec(s.substring(2));
        else if (s.startsWith("I"))  return 1    + convertRec(s.substring(1));
        throw new IllegalArgumentException("Не существующее римское число");
    }

    static int convert(String s) {
        if (s == null || s.isEmpty() || !s.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            return -1;
        }
        return convertRec(s);
    }
}

// Проверка на арабские цифры

class IntCheck {
    static boolean isNumeric(String str)
    {
        try
        {
            int a = Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            return true;
        }
        return false;
    }
}