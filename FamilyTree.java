import java.io.Serializable;
import java.util.ArrayList;

public class FamilyTree implements Serializable {
    private ArrayList<Human> family;

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

    @Override
    public String toString() {
        return getTree();
    }
}
