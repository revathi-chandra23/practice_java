package OOPs;
// 23. Write a Java program to create a class called "Course" with
// attributes for course name, instructor, and credits. Create a subclass
// "OnlineCourse" that adds attributes for platform and duration. Implement methods
// to display course details and check if the course is eligible for a certificate based on duration.

 class Course {
    private String courseName;
    private String instructor;
    private int credits;

    // Constructor
    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}

class OnlineCourse extends Course {
    private String platform;
    private int duration; // Duration in weeks

    // Constructor
    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    // Method to display course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " weeks");
    }

    // Method to check if the course is eligible for a certificate
    public boolean isEligibleForCertificate() {
        return duration >= 4; // Assuming a course is eligible for a certificate if it is at least 4 weeks long
    }
}
public class Oops23 {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", "John Smith", 3, "Coursera", 6);
        onlineCourse.displayCourseDetails();
        System.out.println("Eligible for Certificate: " + onlineCourse.isEligibleForCertificate());
    }


}
