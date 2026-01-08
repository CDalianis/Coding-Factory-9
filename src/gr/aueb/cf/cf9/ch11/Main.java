package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();


        Student student2 = new Student(4, "makis" ,"kapetis");
        student2.setFirstname("Xrisostomos");
        Student student3 = new Student(5, "Lampros", "Ioannou");


//        alice.id = 1;
//        bob.id = 1;
//        student.firstname = "George";

            alice.setId(1);                 //setter
            alice.setFirstname("Alice");
            alice.setLastname("Wonderland");

            bob.setId(2);
            bob.setFirstname("bob");
            bob.setLastname("Dylan");


        System.out.println(alice.getId());  //getter
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d , Firstname: %s , Lastname: %s\n " ,
                alice.getId(), alice.getFirstname(), alice.getLastname());
    }
}
