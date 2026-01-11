package practice;

public class inventory {
    public static void main(String[] args) {
        int[] price = {20, 50, 30, 20, 10};

        // Print products
        for(int i = 0; i < price.length; i++) {
            System.out.println("Product " + (i+1) + ": " + price[i]);
        }

        // Total inventory value
        int total = 0;
        for(int p : price) total += p;
        System.out.println("Total inventory value: " + total);

        // Count products > 20
        int count = 0;
        for(int p : price) if(p > 20) count++;
        System.out.println("Number of products costing more than 20: " + count);

        // Max and Min price
        int max = price[0];
        int min = price[0];
        for(int p : price) {
            if(p > max) max = p;
            if(p < min) min = p;
        }
        System.out.println("Most expensive product: " + max);
        System.out.println("Cheapest product: " + min);
    }
}
