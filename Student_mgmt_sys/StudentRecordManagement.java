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
            //checking  record by Id Number
            if(l.getIdNumber() == idNimber){
                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    //Method 3
    //Delete Record 
    //@param recIdNumber
    public void delete(int recIdNumber){

        Record recordDel = null;

        //iterating record list
        for(Record II : list){
            //finding record to be deleted by id Number

            if(II.getIdNumber() == recIdNumber){
                recordDel = II;
            }
        }
        //if recordbel is null, then show error message,
        //otherwise remove the record from Record list
        if(recordDel == null){
            System.out.println("Invlaid Record Id");
        }
        else{
            list.remove(recordDel);

            System.out.println("Sucessfully removed reocrd from the list");
        }
    }
    //Method 4
    //Finding Record
    //@param idNumber
    //@return
    public Record findRecord(int idNumber)
    {
        //iterate record list
        //using for each loop
        for (Record I : list){
            if(I.getIdNumber() == idNumber){
                return I;
            }
        }
        return null;
    }
    //Method 5
    //Update Record
    //@param id
    //@param input
    public void update(int id, Scanner input)
    {
        if(find(id)){
            Record rec = findRecord(id);
            //display message only
            System.out.println("What is the new student id Number ?");
            int idNumber = input.nextInt();

            System.out.println("What is the new Student contact Number ?");
            int contactNumber = input.nextInt();
            input.nextLine();

            System.out.println("What is the new Student Name ?");
            String name = input.nextInt();
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Record updated Successfully");
        }
    }
    //method 6
    //display records
    public void dipslay()
    {
        //if reocrd list is empty then
        if(list.isEmpty()){
            System.out.println("The list has no records\n");
        }
        //Iterating record list
        //using for each loop
        for (Record record : list){
            System.out.println(record.toString());
        }
    }
}
