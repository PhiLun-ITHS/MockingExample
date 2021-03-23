public class Calculator {

    int add(String numbers) {
        String[] listOfNumbers = numbers.split(", |\n|//\n|//;| ;|,");

        if (numbers.isEmpty()) {
            return 0;
        } else if (listOfNumbers.length == 1) {
            return Integer.parseInt(numbers);

        } else if (listOfNumbers.length == 2) {
            return Integer.parseInt(listOfNumbers[0]) + Integer.parseInt(listOfNumbers[1]);

        } else if (listOfNumbers.length > 2) {
            int total = 0;
            for (String listOfNumber : listOfNumbers) {
                total = total + Integer.parseInt(listOfNumber);
            }
            return total;
        }
        return 1244312;
    }
}
