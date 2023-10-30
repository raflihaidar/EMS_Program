package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class FrontEnd extends Employee implements Programmer {
    private final ArrayList<String> skillSet = new ArrayList();
    
    public String getSkills(){
        String skill = "";
        for(String item : skillSet){
          skill += item + " || ";
        }
        return skill;
    }
    
    @Override
    public void addSkill(String skill){
        skillSet.add(skill);
    }
    
    @Override
    public void removeSkill(String skill){
        int skillIndex = skillSet.indexOf(skill);
        skillSet.remove(skillIndex);
    }
    
    @Override
    public String detailInfo(){
        return "Id : " + super.getId() + "\n" + 
               "Name : " + super.getName() + "\n" +
               "Address : " + super.getAddress() + "\n" +
               "Email : " + super.getEmail() + "\n" +
               "Telephone : " + super.getTelephone() + "\n" +
               "Skill List : " + getSkills();
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
            System.out.print("Enter Employee Skil List --: ");
            addSkill(sc.nextLine());
            System.out.print("Add Another Skill [y/n] --: ");
            i = sc.nextLine();
        }while(i.equals("y"));
    }
}
