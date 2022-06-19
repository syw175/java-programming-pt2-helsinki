import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card card, Card otherCard) {
        int same = card.getSuit().ordinal() - otherCard.getSuit().ordinal();
        return same == 0 ? card.getValue() - otherCard.getValue() : same;
    }
}