// Base Animal class
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Animal {
    private String name;
    private Date birthDate;
    private Species species;
    private List<String> commands;

    // Animal constructor
    public Animal(String name, Date birthDate, Species species, ArrayList<String> commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.species = species;
        this.commands = new ArrayList<>(commands);
    }

        // Getters and setters:
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

        public List<String> getCommands() { return commands;
        }

        public void setCommands(List<String> commands) {
            this.commands = commands;
        }
    }


