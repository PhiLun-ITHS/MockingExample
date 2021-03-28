package calc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Calculator {


    public int add(String numbers) {

        numbers = handleCustomDelimiters(numbers);
        String[] listOfNumbers = numbers.split(", |\n|//\n|//;| ;|,");

        List<String> numList = new ArrayList<>();
        List<String> negativeList = new ArrayList<>();

        for (String num : listOfNumbers) {
            if (Integer.parseInt(num) < 0) {
                negativeList.add(num);
            } else if (Integer.parseInt(num) >= 0) {
                numList.add(num);
            }
        }
        numList.removeIf(a -> Integer.parseInt(a) > 1000);

        if (negativeList.size() > 0) {
            throw new RuntimeException("negatives not allowed" + " " + negativeList);
        }

        else if (numList.size() > 0){
            int total = 0;
            for (String num : numList) {
                total = total + Integer.parseInt(num);
            }
            return total;
        }
        return 5555;
    }

    private String handleCustomDelimiters(String s) {
        if (s.isEmpty()){
            return String.valueOf(0);
        }
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