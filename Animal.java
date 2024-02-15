// Основной класс Animal
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void performCommands() {
        System.out.println("Animal " + name + " performCommands");
    }
}
