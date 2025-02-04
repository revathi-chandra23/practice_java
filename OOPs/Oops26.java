package OOPs;
//26. Write a Java program to create a class called "Event" with attributes
// for event name, date, and location. Create subclasses "Seminar" and
// "MusicalPerformance" that add specific attributes like number of speakers
// for seminars and performer list for concerts. Implement methods to display
// event details and check for conflicts in the event schedule.
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
class Event {
    String eventName;
    Date date;
    String location;

    public Event(String eventName, Date date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    public boolean isConflict(Event otherEvent) {
        return this.date.equals(otherEvent.date) && this.location.equals(otherEvent.location);
    }
}
class Seminar extends Event {
    int numberOfSpeakers;

    public Seminar(String eventName, Date date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}
class MusicalPerformance extends Event {
    List performers;

    public MusicalPerformance(String eventName, Date date, String location, List performers) {
        super(eventName, date, location);
        this.performers = performers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + String.join(", ", performers));
    }
}

public class Oops26 {
    public static void main(String[] args) {
        Date date = new Date();

        Seminar seminar = new Seminar("Space Conference", date, "Convention Center", 5);

        List performers = new ArrayList<>();
        performers.add("Band A");
        performers.add("Band B");
        MusicalPerformance concert = new MusicalPerformance("Winter Fest", date, "Convention Center", performers);

        System.out.println("Seminar Details:");
        seminar.displayDetails();

        System.out.println("\nMusical Performance Details:");
        concert.displayDetails();


        if (seminar.isConflict(concert)) {
            System.out.println("\nConflict detected: Both events are scheduled at the same time and location.");
        } else {
            System.out.println("\nNo conflict: Events are scheduled at different times or locations.");
        }
    }

}
