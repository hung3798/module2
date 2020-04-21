package CaseStudy.Controller;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tBooking Movie Ticket 4D\n" +
                "8.\tFind Employee\n" +
                "9.\tExit\n" +
                "------------------------------------\n" +
                "Select the requirement for the system: ");
        inputChoose(scanner);
    }

    private static void inputChoose(Scanner scanner) {
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewService(scanner);
                break;
            case 2:
                showService(scanner);
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showCustomer();
                break;
            case 5:
                addNewBooking();
                break;
            case 6:
                showEmployee();
                break;
            case 7:
                bookingTicket();
                break;
            case 8:
                findEmployee();
                break;
            case 9:
                System.exit(0);
            default:
                inputChoose(scanner);
        }
    }

    private static void findEmployee() {
    }

    private static void showCustomer() {
    }

    private static void bookingTicket() {
    }

    private static void showEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void addNewCustomer() {
    }

    private static void showService(Scanner scanner) {
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n" +
                "--------------\nSelect number to choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showAllNameVilla();
                break;
            case 5:
                showAllNameHouse();
                break;
            case 6:
                showAllNameRoom();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("input invalid!");
                showService(scanner);
        }
    }

    private static void showAllNameRoom() {

    }

    private static void showAllNameHouse() {

    }

    private static void showAllNameVilla() {

    }

    private static void showAllRoom() {
    }

    private static void showAllHouse() {
    }

    private static void showAllVilla() {
    }

    private static void addNewService(Scanner scanner) {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "----------------------\n" +
                "Select number to choose:");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                addNewService(scanner);
        }
    }

    private static void addNewRoom() {
    }

    private static void addNewHouse() {
    }

    private static void addNewVilla() {
    }
}
