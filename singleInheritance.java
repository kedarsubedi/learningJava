class parent{
    int a =10;
    void display(){
        System.out.println("I am present");
    }
}
public class singleInheritance extends parent {
    public static void main(String[] args){
        singleInheritance s = new singleInheritance();
        System.out.println(s.a);
        s.display();
    }
}
