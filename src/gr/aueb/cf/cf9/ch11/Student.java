package gr.aueb.cf.cf9.ch11;

/**
 * java bean,
 * Data Class Που εχει private πεδια
 * τουλαχιστον ενα Default Constructor
 * getters και setters με συμβασεις
 */
public class Student {
    private static int studentCount ;

    private int id;
    private String firstname;
    private String lastname;


    public Student() {
        studentCount++;

        
    }

    //Public Getters και Setters

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public int getId(){     //convention: getX
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public  void setFirstname(String firstname) {
        this.firstname = firstname;
    }

     public String getLastname() {
        return lastname;
    }

    public  void setLastname(String firstname) {
        this.lastname = firstname;
    }

}

