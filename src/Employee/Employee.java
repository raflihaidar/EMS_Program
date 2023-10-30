
package Employee;
import java.util.Scanner;
/**
 *
 * @author rafli
 */
public class Employee {
    private String id;
    private String name;
    private String address;
    private String email;
    private String telephone;
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    
    public String getTelephone(){
        return this.telephone;
    }

    public String detailInfo(){
        return "Id : " + this.getId() + "\n" + 
               "Name : " + this.getName() + "\n" +
               "Address : " + this.getAddress() + "\n" +
               "Email : " + this.getAddress() + "\n" +
               "Telephone : " + this.getTelephone();
    }
    
    public void setDetailInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee's ID ----------: ");
        id = sc.nextLine();
        System.out.print("Enter Employee's name --------: ");
        name=sc.nextLine();
        System.out.print("Enter Employee's Address ----: ");
        address = sc.nextLine();
        System.out.print("Enter Employee's Email  ----: ");
        email = sc.nextLine();
        System.out.print("Enter Employee Telephone Info --: ");
        telephone = sc.nextLine();
    }
}
