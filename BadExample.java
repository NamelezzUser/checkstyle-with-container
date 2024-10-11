import java.util.ArrayList;
import java.util.List;

public class BadExample {
    
    private List<String> names;

    /**
     * Constructor initializes the names list.
     */
    public CheckstyleExample()   {
        names = new ArrayList<>();
    }

    /**
     * Adds a name to the list.
     * 
     * @param name
     */
    public void addName(String n) {
        if (n != null && !n.isEmpty()) {
            names.add(n);
        }
    }

    /**
     * Gets the list of names
     */
    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public static void main(String[] args) {
        CheckstyleExample example = new CheckstyleExample();
        example.addName("Alice");
        example.addName("Bob");

        System.out.println("Names: " + example.getNames());
    }
}