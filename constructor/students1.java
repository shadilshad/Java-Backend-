package constructor;

public class students1 {
      int rollno;
      String name;
      float mark1, mark2, mark3;
      float total;
      String result;

           students1(int rollno, String name, float mark1, float mark2, float mark3)
           {
            this.rollno = rollno;
            this.name = name;
            this.mark1 =mark1;
            this.mark2=mark2;
            this.mark3=mark3;
            
            calculatetotal();
            seeresult();

        
        }
            void calculatetotal(){
            total= mark1 + mark2 + mark3;
            }

            void seeresult(){
            if(mark1>=35 && mark2>=35 && mark3>=35){
                result = "pass";
            }
            else if(total >= 110){
                result = "pass";
            }
            else{
                result="fail";
            }
        }

        }

    

