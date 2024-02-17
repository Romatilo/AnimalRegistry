// Основной класс Animal
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Animal {
    private String species;
    private Date birthDate;
    private String name;
    private List<String> commands;

    // Конструктор Animal
    public Animal(String species, Date birthDate, String name, List<String> commands) {
        this.species = species;
        this.birthDate = birthDate;
        this.name = name;
        this.commands = new ArrayList<>(commands);
    }

        // Геттеры и сеттеры для полей
        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getCommands() {
            return commands;
        }

        public void setCommands(List<String> commands) {
            this.commands = commands;
        }
    }


