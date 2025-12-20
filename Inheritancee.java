public class Car{
    protected String vehicle = "Alto 800";
    public void honk(){
        System.out.println("Bleeeze Bleeze");
        /* void is used for printing the text, it cant be used for returning */
    }
    public String honkk(){
        return "Bleeze bleeze";
    }

}
class Inheritancee extends Car{
    private int money = 20000;
    public static void main(String[] args){
        Inheritancee Mycar = new Inheritancee();

        Mycar.honk();
        System.out.println(Mycar.vehicle+" is the only car with " + Mycar.money + "and thats why it makes sounds like " + Mycar.honkk());
    }
}