import java.util.ArrayList;
import java.util.List;

public class Calculator {

    int add(String numbers) {
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
        if (negativeNumber.size() > 0) {
            throw new RuntimeException("negatives not allowed" + " " + negativeNumber);

        } else if (listOfNumbers.length == 1) {
            return Integer.parseInt(numbers);

        } else if (listOfNumbers.length == 2) {
            return Integer.parseInt(listOfNumbers[0]) + Integer.parseInt(listOfNumbers[1]);

        } else if (listOfNumbers.length > 2) {
            int total = 0;
            for (String listOfNumber2 : listOfNumbers) {
                total = total + Integer.parseInt(listOfNumber2);
            }
            return total;
        }
        return 1244312;
    }
}
