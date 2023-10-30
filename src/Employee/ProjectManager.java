package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectManager extends Employee implements Management {
    private final ArrayList<String> projectList = new ArrayList();
    
    public String getProject(){
        String projects = "";
        for(String item : projectList){
          projects += item + " || ";
        }
        return projects;
    }
    
    @Override
    public void addProject(String Project){
        projectList.add(Project);
    }
    
    @Override
    public void removeProject(int index){
        int projectIndex = projectList.indexOf(index);
        projectList.remove(projectIndex);
    }
    
        
    @Override
    public String detailInfo(){
        return "Id : " + super.getId() + "\n" + 
               "Name : " + super.getName() + "\n" +
               "Address : " + super.getAddress() + "\n" +
               "Email : " + super.getEmail() + "\n" +
               "Telephone : " + super.getTelephone() + "\n" +
               "Project List : " + getProject();
    }
    
    @Override
    public void setDetailInfo(){
        Scanner sc = new Scanner(System.in);
        String i;
        System.out.print("Enter Employee's ID ----------: ");
        super.setId(sc.nextLine());
        System.out.print("Enter Employee's name --------: ");
        super.setName(sc.nextLine());
        System.out.print("Enter Employee's Address ----: ");
        super.setAddress(sc.nextLine());
        System.out.print("Enter Employee's Email  ----: ");
        super.setEmail(sc.nextLine());
        System.out.print("Enter Employee Telephone Info --: ");
        super.setTelephone(sc.nextLine());
        do{
            System.out.print("Enter Project ---: ");
            addProject(sc.nextLine());
            System.out.print("Add Another Project [y/n] --: ");
            i = sc.nextLine();
        }while(i.equals("y"));
    }
}