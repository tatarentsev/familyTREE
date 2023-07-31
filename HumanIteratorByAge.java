import java.util.Comparator;

public class HumanIteratorByAge implements Comparator<Human> {
    private HumanIteratorByAge LocalDate;

    @Override
    public int compare(Human h1, Human h2) {
        return Integer.compare(h1.getAge(), h2.getAge());
    }
}
