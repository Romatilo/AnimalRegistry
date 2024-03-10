import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class AnimalBuilder {
    public static Animal createAnimalFromConsoleInput() {

//        class Counter implements AutoCloseable {
//            private int count = 0;
//
//            public void add() {
//                count++;
//            }
//
//            @Override
//            public void close(
//            ) {
//                System.out.println("Total count: " + count);
//            }
//        }
//        try (Counter counter = new Counter()) {
        /// name input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter animal's name: ");
        String name = scanner.nextLine();
        if (name.equals(""))
        {
            System.out.println("Unacceptable name, default name \"Nameless\" is set for the animal");
            name = "Nameless";
        }

        /// birthdate input
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = null;
        boolean validDate = false;

        while (!validDate) {
            System.out.print("Enter animal's birth date in dd.mm.yyyy format: ");
            String dateString = scanner.nextLine();
            try {
                birthDate = dateFormat.parse(dateString);
                validDate = true;
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in dd.mm.yyyy format.");
            }
        }

        /// species of the animal input
        Species species = null;
        boolean validSpecies = false;

        System.out.println("Choose animal's species:");
        for (Species s : Species.values()) {
            System.out.println(s);
        }

        while (!validSpecies) {
            System.out.print("Enter species: ");
            try {
                species = Species.valueOf(scanner.nextLine().toUpperCase());
                validSpecies = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid species. Please choose from the provided options.");
            }
        }


        System.out.println("Enter commands for the animal (type 'done' to finish):");
        ArrayList<String> commands = new ArrayList<>();
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("done")) {
                break;
            }
            commands.add(command);
        }

        Animal animal = new Animal(name, birthDate, species, commands);
        return animal;
////            counter.add();
//
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }


    }
}