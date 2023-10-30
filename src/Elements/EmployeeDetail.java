package Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rafli
 */
public class EmployeeDetail {
    public void showDetail(int menu, String id) throws FileNotFoundException{
        File file;
        switch (menu) {
            case 1 :
                file = new File("/Belajar Java/CompanyManagementSystem/Project Manager/" + "file" + id + ".txt");
                break;
            case 2 :
                file = new File("/Belajar Java/CompanyManagementSystem/Front end/" + "file" + id + ".txt");
                break;
            default :
                throw new IllegalArgumentException("Invalid menu selection");
        }
        Scanner sc = new Scanner(file);
        
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
