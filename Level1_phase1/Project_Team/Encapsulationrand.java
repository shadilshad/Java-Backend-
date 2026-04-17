public class Data{
    private String name;
    private String dept;
    private int age;
    private String charr;
Data(String name, String dept, int age, String charr){
    this.name = name;
    this.dept = dept;
    this.age = age;
    this.charr = charr;}
//getters
public String getname(){ return name; }
public String getdept(){ return dept; }
public String getcharr(){ return charr; }
public int getage(){ return age; }
//setters
public void setname(String name){ this.name = name; }
public void setdept(String dept){ this.dept = dept ;}
public void setcharr(String charr){ this.charr = charr;} 
public void setage(int age){ this.age = age; } }
public class Encapsulationrand{ 
    public static void main(String[] args){
        Data ui = new Data("Vinayak", "CSE", 21,"Nice and Awesome");
        System.out.println("My friend "+ ui.getname() + " is studying "+ ui.getdept()
        + ". He is "+ui.getage()+" and he is "+ ui.getcharr());
    }
    
}
