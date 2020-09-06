import javax.lang.model.util.Types;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ContactList {

    static Scanner input = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static Scanner decision = new Scanner(System.in);
    static List<People> person;
    static List<String> contacts;
    static int choice;
    static String again;
    static Path contact = Paths.get("src", "contacts");

    public static void listPeople(List<People> person) {
        try {
            contacts = Files.readAllLines(contact);
        } catch (IOException e) {
            e.printStackTrace();
        }
        person = People.nameStringsToPeople(contacts);
        for (People people : person) {
            System.out.printf("%s%n", people.getName());
        }
    }

    public static void addPeople() {
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        String[] arr = name.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(Character.toUpperCase(s.charAt(0)))
                    .append(s.substring(1)).append(" ");
        }
        System.out.println("Please enter number");
        String phoneNumber = scanner.nextLine();
        String info = sb + " | " + phoneNumber;
        try {
            Files.write(
                    Paths.get("src", "contacts"),
                    Collections.singletonList(info),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            contacts = Files.readAllLines(contact);
        } catch (IOException e) {
            e.printStackTrace();
        }
        listPeople(person);
    }


    public static void searchName() {
        System.out.println("Please enter the name of person to search for: ");
        String searchedName = scanner.nextLine();
        try {
            contacts = Files.readAllLines(contact);
        } catch (IOException e) {
            e.printStackTrace();

        }

        for (String singleName : contacts) {
            if (singleName.contains(searchedName)) {
                System.out.printf("Here is the info for : %s%n", searchedName);
                System.out.println(singleName);
            }
        }

    }


    public static void deleteByName() {
        System.out.println("Please enter the name of person to delete: ");
        String name = scanner.nextLine();
        try {
            contacts = Files.readAllLines(contact);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String toBeRemoved = "";

        for (String singleName : contacts) {
            toBeRemoved = singleName;
            if (singleName.contains(name)) {
                System.out.println(name + " Has been removed.");
            }
        }
        contacts.remove(toBeRemoved);
        try {
            Files.write(contact, contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(contacts);
    }

    public static void selection() {

        do {
            choice = input.nextInt();
            if (choice == 1) {
                listPeople(person);
                System.out.print("Please select an option from MENU: ");
                continue;
            }
            if (choice == 2) {
                addPeople();
                System.out.print("Please select an option from MENU: ");
                continue;
            }
            if (choice == 3) {
                searchName();
                System.out.print("Please select an option from MENU: ");
                continue;
            }
            if (choice == 4) {
                deleteByName();
                System.out.print("Please select an option from MENU: ");
                continue;
            }
            if (choice == 5) {
                System.out.println("exiting");
                break;
            }

        } while (choice != 0);

    }

    public static void main(String[] args) {
        System.out.println("MENU\n1. View contacts. \n2. Add a new contact. \n3. Search a contact by name. \n4. Delete an existing contact. \n5. Exit. ");
        System.out.print("Please select an option from MENU: ");
        selection();
    }
}

