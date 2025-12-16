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
    }
}