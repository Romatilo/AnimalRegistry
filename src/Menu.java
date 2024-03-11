import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        Boolean end = false;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add new animal");
            System.out.println("2. Show animal list");
            System.out.println("3. Select existing animal to edit");
            System.out.println("4. Show counter value");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Animal animal = AnimalBuilder.createAnimalFromConsoleInput();
                    AnimalRegistry.animalRegistry.add(animal);
                    break;
                case 2:
                    for (Animal instance : AnimalRegistry.animalRegistry) {
                        System.out.println(instance);
                    }
                    break;
                case 3:
                    System.out.println("Enter animal's name:");
                    String animalName = scanner.nextLine();
                    for (Animal instance : AnimalRegistry.animalRegistry) {
                        if (animalName.equals(instance.getName())) {
                            instance.showAnimalData();
                        }
                        subMenu(instance);
                        end = false; // User remains in ShowMenu loop
                    }
                    break;

                case 4:
                    System.out.println(AnimalBuilder.Counter.getCount());
                    break;
                case 5:
                    System.out.println("Good bye!");
                    end = true;

            }
        }
        while (!end);
    }

    public static void subMenu(Animal animalName) {
        Boolean end = false;
        do {
            System.out.println("\nSubmenu:");
            System.out.println("1. Show commands");
            System.out.println("2. Learn new command");
            System.out.println("3. Change animal species");
            System.out.println("4. Back to main menu");

            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            Scanner newScanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    animalName.showCommands();
                    break;
                case 2:
                    System.out.println("Enter new command to learn.");
                        String command = newScanner.nextLine();
                        animalName.addCommand(command);
                        System.out.println("Command \"" + command + "\" added to the list");
                        break;
                case 3:
                    System.out.println("Input correct species of " + animalName.getName());
                    for (Species s : Species.values()) {
                        System.out.println(s);
                    }
                    System.out.print("Enter species: ");
                    Species correctSpecies = Species.valueOf(newScanner.nextLine().toUpperCase());
                    animalName.setSpecies(correctSpecies);
                    System.out.println(animalName.getName() + " is " + correctSpecies + " now!");

                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    end = true;
            }
        }
        while (!end);
    }
}














