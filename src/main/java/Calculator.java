public class Calculator {

    int add(String numbers) {
       String[] listOfNumbers = numbers.split(", ");

        if (isEmpty(numbers)){
            return 0;
        }
        else {
            return Integer.parseInt(listOfNumbers[0]) + Integer.parseInt(listOfNumbers[1]);
        }
    }

    private boolean isEmpty(String numbers){
        return numbers.isEmpty();
    }
}
