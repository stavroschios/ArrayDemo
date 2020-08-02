import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    processArrayList();
            }

        }
    }

public static void printInstructions(){
            System.out.println("\n Press");
            System.out.println("\t 0 - to print choice options");
            System.out.println("\t 1 - To print the list of groceries items.");
            System.out.println("\t 2 - To add an item to the list.");
            System.out.println("\t 3 - To modify an item from the list. ");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To quit the application.");

        }

    public static void addItem(){
        System.out.println("Enter an item: ");
        groceryList.addGroceryItem(scanner.nextLine());

        }
    public static void modifyItem(){
        System.out.println("Enter current item number: ");
        String itemNumber = scanner.nextLine();
        System.out.println("Modify an item (position, item's name): ");
        String itemName = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, itemName);
    }

    public static void removeItem(){
        System.out.println("Enter item number you wish to remove:" );
        String itemNumberToRemove = scanner.nextLine();
        groceryList.removeGroceryItem(itemNumberToRemove);
    }

    public static void searchForItem(){
        System.out.println("Enter the name of the item you wish to search: ");
        String nameOfTheItem = scanner.nextLine();
        if(groceryList.onFile(nameOfTheItem)){
            System.out.println("Found " + nameOfTheItem + " in your grocery list");
        } else {
            System.out.println( nameOfTheItem + " not found in your grocery list. Try again.");
        }

    }

    public static void processArrayList(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(groceryList.getGroceryList());

        ArrayList<String> newArrayList = new ArrayList<String>(groceryList.getGroceryList());

        String[] newArray = new String[groceryList.getGroceryList().size()];
        newArray = groceryList.getGroceryList().toArray(newArray);


    }


    }


