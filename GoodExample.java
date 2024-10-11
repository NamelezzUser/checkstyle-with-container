// Import necessary packages
import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to demonstrate Checkstyle compliance.
 */
public class GoodExample {
    
    private List<String> names;

    /**
     * Constructor initializes the names list.
     */
    public CheckstyleExample() {
        names = new ArrayList<>();
    }

    /**
     * Adds a name to the list.
     * 
     * @param name the name to be added
     */
    public void addName(String name) {
        if (name != null && !name.isEmpty()) {
            names.add(name);
        }
    }

    /**
     * Gets the list of names.
     * 
     * @return a list of names
     */
    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    /**
     * Main method to run the example.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        CheckstyleExample example = new CheckstyleExample();
        example.addName("Alice");
        example.addName("Bob");

        System.out.println("Names: " + example.getNames());
    }
}