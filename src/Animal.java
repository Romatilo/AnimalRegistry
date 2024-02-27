// Base Animal class
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Animal {
    private String name;
    private Date birthDate;
    private Species species;
    private List<String> commands;

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

    public String getName() {
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

    public void setSpecies(Species species) {
        this.species = species;
    }

    public List<String> getCommands() {
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
    public void showAnimalData() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Species: " + species);
    }

    public void showCommands() {
        System.out.println("Commands:");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

    public void addCommand(String command) {
        commands.add(command);
    }


//    public void learnCommand(String newCommand) {
//        addCommand(newCommand);
//        System.out.println(name + " has learned a new command: " + newCommand);
//    }
}



