import java.io.*;
import java.util.*;

public class EmployeeFileIO {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            FileOutputStream fout = new FileOutputStream("employee2.txt");
            int empno;
            String empname;
            int salary;

            System.out.println("Enter the number of employees:");
            int limit = obj.nextInt();
            obj.nextLine(); // Consume the newline

            for (int j = 0; j < limit; j++) {
                try {
                    System.out.println("Enter the employee number:");
                    empno = obj.nextInt();
                    obj.nextLine(); // Consume the newline
                    String a = String.valueOf(empno);
                    byte a1[] = a.getBytes();
                    fout.write(a1);
                    fout.write("\r\n".getBytes());

                    System.out.println("Enter the employee name:");
                    empname = obj.nextLine();
                    byte b[] = empname.getBytes();
                    fout.write(b);
                    fout.write("\r\n".getBytes());

                    System.out.println("Enter the employee salary:");
                    salary = obj.nextInt();
                    obj.nextLine(); // Consume the newline
                    String c = String.valueOf(salary);
                    byte c1[] = c.getBytes();
                    fout.write(c1);
                    fout.write("\r\n".getBytes());

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    obj.nextLine(); // clear invalid input
                    j--; // retry current employee entry
                }
            }
            fout.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        // Reading the file
        try {
            FileInputStream fin = new FileInputStream("employee2.txt");
            System.out.println("Contents of the file:");
            int data;
            while ((data = fin.read()) != -1) {
                System.out.print((char) data);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
