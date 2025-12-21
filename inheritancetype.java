/* so there are few types in inheritance
1: single inheritance
  ex: PARENT TO CHILD
2: multilevel inheritance
  ex : PARENT TO CHILD TO GRANDCHILD
3: Hierarchical 
  ex: mutiple child for a same parent
4: Multiple inheritance
  ex: is given 
  */

 interface A{
    void show();
 }
 interface B{
    void display();
 }
public class Inheritancetype implements A, B{
    public void show(){
        System.out.println("Show method");
    }
    public void display(){
         System.out.println("Display method");
       
    }
    public static void main(String[] args){
        Inheritancetype obj = new Inheritancetype();
        obj.show();
        obj.display();
    }
    
 }