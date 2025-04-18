package Encapsulation.StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem st = new StudentManagementSystem();
        st.setName("Ubaidullah");
        st.setId("A-001");
        st.setGpa(3.25);

        String name = st.getName();
        String id = st.getId();
        double gpa = st.getGpa();
        
        System.out.println("\n" + name + " " + id + " " + gpa + "\n");
    }
}
