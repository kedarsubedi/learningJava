package Student_mgmt_sys;

import java.util.Scanner;

import javax.xml.namespace.QName;

public class StudentRecordLinkedList {
    public static void main(String[] args) {
        // creating student_mgmt object.
        StudentRecordManagement hr = new StudentRecordManagement();
        Record record = new Record();
        record.setIdNumber(69);
        record.setContactNumber(977);
        record.setName("Hari");
        /*
         * calling add() record method to
         * add static data/to linked list
         */
        hr.add(record);

        // creating scanner object to read input
        Scanner input = new Scanner(System.in);

        // creating object to read input
        int option = 0;

        // Do - while loop
        do {
            menu();
            option = input.nextInt();

            // switch case
            switch (option) {
                case 1:
                    // display message
                    System.out.println("What is the Student id Number ?");

                    int idNumber = input.nextInt();

                    System.out.println("What is the Student Contact Number ?");

                    int contactNumber = input.nextInt();
                    input.nextLine();

                    System.out.println("what is the Student Name ?");

                    String name = input.nextLine();

                    // Create record object and pass constructor parameters.
                    record = new Record(name, idNumber, contactNumber);

                    // call add() record
                    hr.add(record);
                    System.out.println(record.toString());
                    break;

                case 2:
                    System.out.println("What is the Student id Number ?");
                    int rId = input.nextInt();

                    // Invoked delete record
                    hr.delete(rId);

                    break;
                case 3:
                    System.out.println("What is the Student id number ?");
                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);
                    break;

                case 4:
                    System.out.println("What is the Student id ?");
                    int bookId = input.nextInt();

                    if (!hr.find(bookId)) {
                        System.out.println("Student id doesnot exist\n");
                    }
                    break;

                case 5:
                    hr.display();
                    break;

                    break;

                case 9:
                    System.out.println("\n Thank you. Goodbye!\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n Invalid input\n");
                    break;
            }
        }
        // checking condition
        while (option != 9);
    }
    public static void menu() {

        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
