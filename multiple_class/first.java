class first
{
    int m = 20;
    int n = 30;
    
    void add(){
        int x=m+n;
        System.out.println("The added value is ");
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("My first add");
        first f1 = new first();
        f1.add();
        System.out.println("Calling the function of another class from separate file");
        third t1 = new third();
        t1.fun();
    }
}