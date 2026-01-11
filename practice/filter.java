package practice;
import java.util.Arrays;
public class filter {
    public static void main(String[] args) {
        double[] salary = {5000, 5000.60, 88000,30000,1200};
        int count = 0;
        for(double high : salary) if(high>=10000){ count++;
        }
            System.out.println("Number of people earns higher than 10K: " + count);

        }

    }

