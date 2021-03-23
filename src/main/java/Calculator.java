public class Calculator {

    int add(String numbers) {
        String[] listOfNumbers = numbers.split(",|\n");

        if (numbers.isEmpty()) {
            return 0;
        } else if (listOfNumbers.length == 1) {
            return Integer.parseInt(numbers);

        } else if (listOfNumbers.length == 2) {
            return Integer.parseInt(listOfNumbers[0]) + Integer.parseInt(listOfNumbers[1]);

        } else if (listOfNumbers.length > 2) {
            int total = 0;
            for (int i = 0; i < listOfNumbers.length; i++) {
                total = total + Integer.parseInt(listOfNumbers[i]);
            }
            return total;
        }
        return 1244312;
    }
}
