public class arrayobjectcar {

    String model;
    String color;
    
 arrayobjectcar(String model, String color)
{
    this.model = model;
    this.color =  color;
}   
void drive(){
    System.out.println("your drive the car model of "+ this.model + " with the color of "+ this.color);
}
public static void main(String[] args) {
        

    arrayobjectcar[] cars = {new arrayobjectcar("mustange", "red"),
    new arrayobjectcar("benz", "white")
    };

    for(arrayobjectcar car : cars){
       car.drive();
    }
    }
    
}
