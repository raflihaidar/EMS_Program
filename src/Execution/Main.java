package Execution;

import Elements.MainMenu;
import java.util.Scanner;
import Elements.*;
import java.io.FileNotFoundException;

/**
 *
 * @author rafli
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        MainMenu program = new MainMenu();
        program.menu();
        int i = 0;
        while(i != 5){
           System.out.print("Please Enter choice : ");
           int menu = input.nextInt();
           switch(menu){
                case 1 :
                    EmployeeAdd ep = new EmployeeAdd();
                    System.out.println("Press 1 : add Project Manager");
                    System.out.println("Press 2 : add Front End");
                    System.out.println("Press 3 : back");
                    System.out.print("Please Enter choice : ");
                    menu = input.nextInt();
                    if(menu != 3) ep.createFile(menu);
                    program.menu();
                    break;
                case 2 :
                    EmployeeDetail epd = new EmployeeDetail();
                    System.out.println("Press 1 : Show Data Project Manager");
                    System.out.println("Press 2 : Show Data Front End");
                    System.out.println("Press 3 : back");
                    System.out.print("Please Enter choice : ");
                    menu = input.nextInt();
                    input.nextLine();
                    System.out.print("Please Enter Employee : ");
                    String id = input.nextLine();
                    if(menu != 3) epd.showDetail(menu, id);
                    program.menu();
                    break;
                case 5 : 
                    i = 5;
                    break;
                default :
                    System.out.println("Input Error");
                    break;
            }
        }
    }
    
}
