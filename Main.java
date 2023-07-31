import java.io.File;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addHuman("Илья", Gender.Male, LocalDate.of(2005, 5, 27), null, null, null);
        service.addHuman("Алексей", Gender.Male, LocalDate.of(1983,12,4), null, null, null);
        service.addHuman("Савелий", Gender.Male, LocalDate.of(1992,11,15), null, null, null);

        System.out.println(service.getInfo());
        service.sortByName();
        System.out.println(service.getInfo());
        service.sortByAge();
        System.out.println(service.getInfo());


//        FamilyTree familytree = new FamilyTree();
//
//        Human parent1 = new Human("Кристина", Gender.Female, LocalDate.of(1984,3, 27), null, null, null);
//        Human parent2 = new Human("Алексей", Gender.Male, LocalDate.of(1983,12,4), null, null, null);
//        Human parent3 = new Human("Савелий", Gender.Male, LocalDate.of(1992,11,15), null, null, null);
//
//        Human child = new Human("Илья", Gender.Male, LocalDate.of(2005, 5, 27), null, parent1, parent2);
//        Human child2 = new Human("Никита", Gender.Male, LocalDate.of(2003, 2, 7), null, parent1, parent2);
//        Human child3 = new Human("Захар", Gender.Male, LocalDate.of(2002, 7, 25), null, null, parent3);
//        Human child4 = new Human("Ваня", Gender.Male, LocalDate.of(2001, 8, 13), null, null, parent3);
//        Human child5 = new Human("Миша", Gender.Male, LocalDate.of(2004, 1, 10), null, parent1, parent2);
//
//        familytree.addHuman(parent1);
//        familytree.addHuman(parent2);
//        familytree.addHuman(parent3);
//        familytree.addHuman(child);
//        familytree.addHuman(child2);
//        familytree.addHuman(child3);
//        familytree.addHuman(child4);
//        familytree.addHuman(child5);
//
//        System.out.println(familytree);

        // FileHandler fileHandler = new FileHandler();
        // fileHandler.save(familytree);
//        FileHandler fileHandler = new FileHandler();
//        FamilyTree familytree = fileHandler.load();
//        System.out.println(familytree);
    }
}