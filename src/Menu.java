import java.util.Scanner;

public class Menu {
    public static void showMenu() {

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new animal");
            System.out.println("2. Show animal list");
            System.out.println("3. Select existing animal");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Animal animal = AnimalBuilder.createAnimalFromConsoleInput();
                    AnimalRegistry.animalRegistry.add(animal);
                    break;
                case 2:
                    for (Animal instance: AnimalRegistry.animalRegistry) {
                        System.out.println(instance);
                    }
                    break;
                case 3:hyb
                    System.out.println("Enter animal's name:");
                    String animalName = scanner.nextLine();
                    for (Animal instance : AnimalRegistry.animalRegistry) {
                        if (Animal.getName() == animalName) {
                            Animal chosenAnimal = instance;
                            Animal.showAnimalData();
                    /*
                    Submenu for chosen animal
                     */
                            int subChoice = 0;
                            while (subChoice != 3) {
                                System.out.println("\nSubmenu:");
                                System.out.println("1. Show commands");
                                System.out.println("2. Learn new command");
                                System.out.println("3. Change animal species");
                                System.out.println("4. Back to main menu");
                                System.out.print("Enter your choice: ");
                                subChoice = scanner.nextInt();

                                switch (subChoice) {
                                    case 1:
                                        Animal.showCommands();
                                        break;
                                    case 2:
                                        while (true) {
                                            String command = scanner.nextLine();
                                            if (command.equals("done")) {
                                                break;
                                            }
                                            Animal.getCommands().add(command);
                                            break;
                                        }
                                    case 3:
                                        System.out.println("Input correct species of " + Animal.getName());
                                        for (Species s : Species.values()) {
                                            System.out.println(s);
                                        }
                                        System.out.print("Enter species: ");
                                        Species correctSpecies = Species.valueOf(scanner.nextLine().toUpperCase());
                                        Animal.setSpecies(correctSpecies);
                                        break;
                                    case 4:
                                        System.out.println("Returning to main menu...");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }
                            }
                            break;

                        } else {
                            System.out.println("No animal called " + animalName + " is found.");
                        }
                                        }

                        case 4:
                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");


                    }
            }
        }
    }






