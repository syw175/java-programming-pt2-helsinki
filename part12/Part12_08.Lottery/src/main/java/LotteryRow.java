
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random lottoNum = new Random();
        int randNumsGenerated = 0;

        while (randNumsGenerated < 7) {
            int num = lottoNum.nextInt(40) + 1;
            if (!this.containsNumber(num)) {
                this.numbers.add(num);
                randNumsGenerated++;
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

