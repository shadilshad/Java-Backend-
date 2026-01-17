interface father {
    abstract void help();
    abstract void kills();
}
class interfaces implements father{
    public void help(){
        System.out.println("Helping..");
    }
    public void kills(){
        System.out.println("Killing..");
    }

    public static void main(String[] args) {
        interfaces obj = new interfaces();
        obj.help();
        obj.kills();
    }
}
