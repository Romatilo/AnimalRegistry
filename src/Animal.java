// Base Animal class
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Animal {
    private static String name;
    private static Date birthDate;
    private static Species species;
    private static List<String> commands;

    /*
     Animal constructor
     */
    public Animal(String name, Date birthDate, Species species, ArrayList<String> commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.species = species;
        this.commands = new ArrayList<>(commands);
    }

    /*
     Getters and setters:
     */
    public void setName(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Species getSpecies() {
        return species;
    }

    public static void setSpecies(Species species) {
        Animal.species = species;
    }

    public static List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "{name='" + name + "'\n birthdate=" + birthDate + "'\n species = " + species + "}";
    }
    /*
    Show name, birthdate and species of the animal void
    */
    public static void showAnimalData() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Species: " + species);
    }

    public static void showCommands() {
        System.out.println("Commands:");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

    public void addCommand(String command) {
        Animal.commands.add(command);
    }


//    public void learnCommand(String newCommand) {
//        addCommand(newCommand);
//        System.out.println(name + " has learned a new command: " + newCommand);
//    }
}



