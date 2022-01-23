import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit){
            menu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    //System.out.println(r);
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }


    public static void menu(){
        System.out.println("Choose an action: ");
        System.out.println("\t1. Print list of contacts");
        System.out.println("\t2. Add a new contact");
        System.out.println("\t3. Update existing contact");
        System.out.println("\t4. Remove existing contact");
        System.out.println("\t5. Search contact");
        System.out.println("\t6. Quit");
        System.out.println("Enter your choice");
    }

    public static void printContacts(){
        System.out.println("You have " + contactsList.size() + " contacts in your list");
        for(int i = 0; i < contactsList.size(); i++){
            System.out.println((i+1) + ". " + contactsList.get(i).getName() + ": " +
                    contactsList.get(i).getPhoneNumber());
        }
    }

    public static void addNewContact(){
        System.out.println("Enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter the person's phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts contact = new Contacts(name, phoneNumber);
        contactsList.add(contact);
    }

    public static void updateContact(){
        int contactIndex = searchContact();
        if(contactIndex >= 0){
            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new phone number: ");
            String newNumber = scanner.nextLine();
            contactsList.get(contactIndex).setName(newName);
            contactsList.get(contactIndex).setPhoneNumber(newNumber);
            System.out.println("Contact updated");
        }
    }

    public static void removeContact(){
        int contactIndex = searchContact();
        if(contactIndex >= 0){
            contactsList.remove(contactIndex);
            System.out.println("Contact remmoved");
        }
    }

    public static int searchContact(){
        System.out.println("Enter name: ");
        String searchName = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String searchNumber = scanner.nextLine();
        int contactIndex = -1;
        boolean found = false;
        for(int i = 0; i < contactsList.size(); i++){
            if(contactsList.get(i).getName().equals(searchName) &&
                contactsList.get(i).getPhoneNumber().equals(searchNumber)){
                System.out.println("Found the contact: " + searchName + " " + searchNumber);
                contactIndex = i;
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Contact not found");
        }
        return contactIndex;
    }
}
