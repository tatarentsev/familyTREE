import java.time.LocalDate;

public class Service {
    private FamilyTree familyTree;

    public Service() {
        familyTree = new FamilyTree();
    }

    public void addHuman(String name, Gender gender, LocalDate BirthDate, LocalDate DeathDate, Human mather, Human father) {
        Human human = new Human(name, gender, BirthDate, DeathDate, mather, father);
        familyTree.addHuman(human);
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список людей: \n");
        for (Human human : familyTree) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        familyTree.sortByName();
    }

    public void sortByAge() {
        familyTree.sortByAge();
    }
}
