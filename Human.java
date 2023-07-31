import java.io.Serializable;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements Comparable<Human> {
    private Human mather, father;
    private String name;
    private List<Human> children;
    private Gender gender;
    private LocalDate BirthDate, DeathDate;
    private int age;

    public Human(String name, Gender gender, LocalDate BirthDate, LocalDate DeathDate, Human mather, Human fathe) {
        this.name = name;
        this.gender = gender;
        this.BirthDate = BirthDate;
        this.DeathDate = DeathDate;
        this.mather = mather;
        this.father = father;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Имя: ");
        stringBuilder.append(name);
        stringBuilder.append(", пол: ");
        stringBuilder.append(gender);
        stringBuilder.append(", день рождения: ");
        stringBuilder.append(BirthDate);

        if (DeathDate != null) {
            stringBuilder.append(", дата смерти: ");
            stringBuilder.append(DeathDate);
        }

        if (mather != null) {
            stringBuilder.append(", мать: ");
            stringBuilder.append(mather.name);
        }

        if (father != null) {
            stringBuilder.append(", отец: ");
            stringBuilder.append(father.name);
        }

        stringBuilder.append(list_of_children());

        return stringBuilder.toString();
    }

    // создать список


    // метод, добавление детей в список
    public void addChild(Human child) {
        children.add(child);
    }

    public Human getFather() {
        return father;
    }

    public int getAge() {
        int bd = BirthDate.getYear();
        int now = LocalDate.now().getYear();
        return now - bd;
    }

    public Human getMather() {
        return mather;
    }
    // метод String, выводящий все имена детей в строку

    public String list_of_children() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", дети: ");
        if (children.size() == 0) {
            stringBuilder.append("детей нет");
        }
        else {
            stringBuilder.append(children.get(0).name);
            for (int i = 1; i < children.size(); i++) {
                stringBuilder.append(", " + children.get(i).name);
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Human human) {
        return name.compareTo(human.name);
    }
}

