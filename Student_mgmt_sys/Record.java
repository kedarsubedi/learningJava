package Student_mgmt_sys;

public class Record {
    
    //instance variables
    private String name;
    private int idNumber;
    private int contactNumber;

    //default constructor
    public Record(){}

        // Parameterized Constructor
        // @param name
        // @param idNumber
        // @param contactNumber
    public Record(String name, int idNumber, int contactNumber)
    {
        //this keyword refers to current instance itself
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }

    //getting the value of contactNumber
    //@return the value of contactNumber
    public int getContactNumber(){ return contactNumber; }

    //set the value of contactNumber
    //@param contactNumber new value of contactNumber
    public void setContactNumber(int contactNumber){
        this.contactNumber = contactNumber;
    }
    //Getting the value of idNumber
    //@return the value of idNumber
    public int getIdNumber(){ return idNumber; }

    //setting the value of idNumber
    //@param idNumber new value of idNumber
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }


    //getting the value of name
    //@return the value of name
    public String getName(){ return name; }


    //setting the value of name
    //@param name new value of name
    public void setName(String name){
        this.name = name;
    }

    @Override public String toString()
    {
        //returing the record
        return "Records{"+"name= "+ name + ", idNumber= "+ idNumber + ", contactNumber= " + contactNumber +'}';
    }

}
