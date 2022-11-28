class getData{
    double principle1;
    double rate1;
    double time1;
    void getD(double p, double r, double t){
        principle1 = p;
        rate1=r;
        time1=t;

    }
    void display1()
    {
        System.out.println("prinicple="+principle1);
        System.out.println("RAte="+rate1);
        System.out.println("Time="+time1);
    } 
}
class calculateSI1 extends getData{
    double SI1(){
        return (principle1*rate1*time1)/100;
    }
}
public class MultipleInheritance extends calculateSI1 {
    public static void main(String[] args){
        MultipleInheritance m = new MultipleInheritance();
        m.getD(12345.67, 3.4, 3);
        m.display1();
        System.out.println("Simple Interest="+m.SI1());
        m.SI1();
    }
}