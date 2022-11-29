interface printable{
    void print();
}
interface showable{
    void show();
}
public class MultipleInheritance1 implements printable, showable {
    public void print(){
        System.out.println("Printing");
    }
    public void show(){
        System.out.println("Showing");
    }
    public static void main(String[] args) {
        MultipleInheritance1 m = new MultipleInheritance1();
        m.print();
        m.show();
    }
}
