class Ifelse{
    public static void main(String []args){
        int Marks = 75;
        if(Marks>=90){
            System.out.println("A+");
        }
        else if(Marks>=85){
            System.out.println("A");
        }
        else if(Marks>=80){
            System.out.println("B+");
        }
        else if(Marks>=75){
            System.out.println("B");
        }
        else if(Marks>=70){
            System.out.println("C+");
        }
        else if(Marks>=65){
            System.out.println("C");
        }
        else if(Marks>=60){
            System.out.println("D+");
        }
        else if(Marks>=55){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    }
}