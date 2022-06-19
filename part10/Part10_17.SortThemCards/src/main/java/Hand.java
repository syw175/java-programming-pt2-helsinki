import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;


    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream()
                .forEach(card -> System.out.println(card));
    }


    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(hand, comparator);
    }

    @Override
    public int compareTo(Hand otherHand) {
        int thisValue = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        int otherValue = otherHand.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);

        return thisValue - otherValue;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
