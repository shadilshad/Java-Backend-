package Day6;

public class Array2D {
    public static void main(String[] args) {
        
        String[] fruits = {"Tomato","apple","Banana"};
        String[] meat = {"chicken" ,"mutton", "duck"};
        String[] vegetable={"Onion","fish"};

         String[][] groceries = {fruits,vegetable,meat};
         
         for(String[] foods : groceries){
            for(String food : foods){
            System.out.print(food + " ");
            }
         }
  
  
        }
    
}
