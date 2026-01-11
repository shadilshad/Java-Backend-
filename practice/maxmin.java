package practice;

public class maxmin {
    public static void main(String[] args) {
        
        double[] salary = {5000, 5000.60, 88000,30000,1200};

        double max = salary[0];
        double min = salary[0];

        for(double p : salary){
            if( p > max ){ max = p;}
            if( p < min)  {min=p;}
            System.out.println("maximum "+ max +" and minimum "+min);
    }
    }
}
