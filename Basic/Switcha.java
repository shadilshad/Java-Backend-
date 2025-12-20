class switcha{
    public static void main(String []args){
        String Marks = "ten";
        switch(Marks){
            case "hundred":
            case "fifty":
                System.out.println("Not a bad performance");
                break;
            case "thirty":
                System.out.println("Not a good performance");
                break;
            case "twenty":
               System.out.println("very bad performance");
            break;

            default:
                                System.out.println("worst performance");
        }
         performance p = new performance();
         p.printDay();

    }
}
class performance extends switcha{
    int day= 4;
    void printDay(){
    switch(day){
        case 1:
            System.out.println("monday");
            break;

            case 2:
            System.out.println("tuesday");
            break;
    case 3:
            System.out.println("wednsday");
            break;
    case 4:
            System.out.println("thursday");
            break;
    default:
            System.out.println("holiday");


    }

}}