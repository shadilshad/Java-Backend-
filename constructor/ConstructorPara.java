package constructor;

public class ConstructorPara {
    public static void main(String[] args) {
        
        students std = new students(11, "Shadil",40 , 34, 39);
        System.out.println("Total: " + std.total);
        System.out.println("Result: " + std.result);
        System.out.println(std.name);


        students1 std1 = new students1(11, "Shadil",40 , 34, 39);
        System.out.println("Total: " + std1.total);
        System.out.println("Result: " + std1.result);
        System.out.println(std1.name);

    }

}
    

