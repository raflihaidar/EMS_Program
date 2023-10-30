package Elements;
import java.util.Scanner;
import Employee.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class EmployeeAdd {
    public void createFile(int menu) {
        Scanner sc = new Scanner(System.in);
        File theDir;
        Employee emp;
        switch (menu) {
            case 1 :
                emp = new ProjectManager();
                theDir = new File("/Belajar Java/CompanyManagementSystem/Project Manager");
                break;
            case 2 :
                emp = new FrontEnd();
                theDir = new File("/Belajar Java/CompanyManagementSystem/Front End");
                break;
            default :
                throw new IllegalArgumentException("Invalid menu selection");
        }
        emp.setDetailInfo();
        try{
            if(!theDir.exists()){
                theDir.mkdir();
            }
            File f1 = new File(theDir.getAbsolutePath() + "/file"+emp.getId()+".txt");
            if(f1.createNewFile()){
                FileWriter myWriter = new FileWriter(theDir.getAbsolutePath() + "/file"+emp.getId()+".txt");
                myWriter.write(emp.detailInfo());
                myWriter.close();
                System.out.println("\nEmployee has been Added :)\n");

                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }else{
                System.out.println("\nEmployee already exists");
                System.out.print("\nPlease Enter to Continue");
                sc.nextLine();
            }
        }catch(IOException error){
            System.out.println(error);
        }
    }
}
