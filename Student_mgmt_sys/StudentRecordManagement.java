package Student_mgmt_sys;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordManagement {
    //creating an empty linkedlist
    LinkedList<Record> list;
    public StudentRecordManagement(){
        list = new LinkedList<>();
    }
    //Method 1
    //adding record
    //@param record
    public void add(Record record)
    {
        //checking if a record already exis or not,
        //if not add it to record list, otherwise
        //error display message
        if(!find(record.getIdNumber())){
            list.add(record);
        }
        else{
            System.out.println("Record already exists in the Record list");
        }
    }
    //Method 2
    //Searching Record
    //@param idNumber
    //@return
    public boolean find(int idNimber)
    {
        //iterating record list
        //using for each loop
        for (Record l : list){
            //checking  
        }
    }
}
