import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler implements Writable {
    private final static String filePath = "tree.out";

    public void save(FamilyTree familytree) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutputStream.writeObject(familytree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FamilyTree load() {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            FamilyTree familytree = (FamilyTree) objectInputStream.readObject();
            return familytree;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
