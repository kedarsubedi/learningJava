//interface contains static files
interface Draw{
    int a = 0;
    void displayObjects();
}
class Rectangle implements Draw{
    public void displayObjects(){
        System.out.println("I am Rectangle");
    }
}
class Triangle implements Draw{
    public void displayObjects(){
        System.out.println("I am Triangle");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        t.displayObjects();
        r.displayObjects();
    }
}
