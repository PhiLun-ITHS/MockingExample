import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {



    int add(String numbers) {

        numbers = handleCustomDelimiters(numbers);

        //String[] listOfNumbers = numbers.split(" , ");

        String[] listOfNumbers = numbers.split(", |\n|//\n|//;| ;|,");

        if (numbers.isEmpty()) {
            return 0;
        }

        List<String> negativeNumber = new ArrayList<>();
        for (String listOfNumber : listOfNumbers) {
            if (Integer.parseInt(listOfNumber) < 0) {
                negativeNumber.add(listOfNumber);
            }
        }

        List<String> numbers2 = new ArrayList();
        for (String num2 : listOfNumbers) {
            numbers2.add(num2);
        }
        numbers2.removeIf(n -> Integer.parseInt(n) > 1000);

        if (negativeNumber.size() > 0) {
            throw new RuntimeException("negatives not allowed" + " " + negativeNumber);

        } else if (numbers2.size() == 1) {
            return Integer.parseInt(numbers);

        } else if (numbers2.size() == 2) {
            return Integer.parseInt(listOfNumbers[0]) + Integer.parseInt(listOfNumbers[1]);

        } else if (numbers2.size() > 2) {
            int total = 0;
            for (String listOfNumber2 : listOfNumbers) {
                total = total + Integer.parseInt(listOfNumber2);
            }
            return total;
        }
        return 1244312;
    }

    private String handleCustomDelimiters(String s) {
        StringBuilder builder = new StringBuilder();
        boolean skip = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) || c == '-') {
                skip = true;
                builder.append(c);
            } else if (skip) {
                skip = false;
                builder.append(",");
            }
        }
        return builder.toString();
    }
}
