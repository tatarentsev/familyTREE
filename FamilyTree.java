import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FamilyTree implements Iterable<Human> {
    private ArrayList<Human> family;
    private LocalDate birthDate;

    public FamilyTree() {
        this.family = new ArrayList<>();
    }

    public String getTree() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список семьи: \n");
        for (int i = 0; i < family.size(); i++) {
            stringBuilder.append(family.get(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void addHuman(Human human) {
        family.add(human);
        if (human.getMather() != null) {
            human.getMather().addChild(human);
        }
        if (human.getFather() != null) {
            human.getFather().addChild(human);
        }
    }

    public void sortByName() {
        Collections.sort(family);
    }

    public void sortByAge() {
        Collections.sort(family, new HumanIteratorByAge());
    }


    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(family);
    }

    @Override
    public String toString() {
        return getTree();
    }
}
