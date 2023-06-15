public class Main {
     public static void main(String[] args) {
        // Create the model
        Student student = new Student();

        // Create the view
        StudentView studentView = new StudentView();

        // Create the controller
        StudentController studentController = new StudentController(student, studentView);

        // Update the model data
        studentController.setStudentName("John Doe");
        studentController.setStudentAge(20);

        // Display the model data using the view
        studentController.updateView();
    }
}
