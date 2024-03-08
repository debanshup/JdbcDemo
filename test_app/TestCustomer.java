package test_app;


import java.util.Scanner;

// import DB_info.DatabaseInfo;
import insert_action.InsertData;
import insert_info.InsertInfo;

public class TestCustomer {
    public static void main(String[] args)  {
        String name, mobile_no, village, post_office, landmark, pin_code, full_address;
        Scanner scanner = new Scanner(System.in);
        System.out.println("YOUR NAME :");
        name = scanner.nextLine();
        System.out.println("MOBILE NO :");
        mobile_no = scanner.nextLine();
        System.out.println("VILLAGE :");
        village = scanner.nextLine();
        System.out.println("POST OFFICE :");
        post_office = scanner.nextLine();
        System.out.println("NEARBY LANDMARK :");
        landmark = scanner.nextLine();
        System.out.println("PIN CODE :");
        pin_code = scanner.nextLine();

        full_address = village + "\n" + post_office + "\n" + landmark + "\n" + pin_code;

        InsertInfo info = new InsertInfo(name, mobile_no, full_address, pin_code);
        ;
        if (InsertData.insert(info)) {
            System.out.println("data inserted successfully :) ");
        } 
        

        scanner.close();

    }
}
