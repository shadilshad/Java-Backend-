package method;
 
public class Practice {




    static void Marks(){
        Student mark = new Student("SHADIL VV", 22, 37, 40, 49);
    }
    
}

class Student{
   String name ;
   int age;
   float mark1, mark2, mark3;
   float total;
   String result;
       
         Student(String name, int age, float mark1,  float mark2, float mark3){
              this.name = name;
              this.age= age;
              this.mark1 = mark1;
              this.mark2 = mark2;
              this.mark3 = mark3;

              calculateTotal();
              calculateResult();
         }

         void calculateTotal(){
            this.total = mark1+mark2+mark3;
         }
         void calculateResult(){
            if(mark1>=35 && mark2>=35 && mark3>=35){
                this.result= "PASS";
            }
            else{
                this.result= "FAIL";   
            }
         }
        }