public class ExpectionHandling{
    public static void main(String[] args){
        try{
            int a = 100/0;
            int b[]= new int[10];
            b[10]=100;

        }
        catch(Exception e){
            System.out.println("Expection: "+ e);

        }
    }
}