package OOPs;

import java.time.LocalTime;
class Airplane {
    int flightNumber;
    String destination;
    public LocalTime time;
    public int delaytime;

    public Airplane(int flightNumber, String destination, LocalTime time) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.time = time;
        this.delaytime = 0;
    }


    public void delay(int timee) {
        this.delaytime = timee;
        this.time = this.time.plusMinutes(timee);
    }

    public void checkStatus() {

        if (delaytime == 0) {
            System.out.println("Flight " + flightNumber + " is on time,"+"to the destination "+destination);
        } else {

            System.out.println("Flight " + flightNumber + " is delayed by " + delaytime + " minutes,"+"to the destination "+destination);
        }
    }
}

    public class oops12 {
        public static void main(String[] args) {
            Airplane al=new Airplane(1234,"ooty",LocalTime.of(10,30));
            al.checkStatus();
            al.delay(30);
            al.checkStatus();
            Airplane al1=new Airplane(2334,"rjy",LocalTime.of(4,2));
            Airplane al2=new Airplane(5643,"vzg",LocalTime.of(12,45));
            al1.checkStatus();
            al2.checkStatus();

        }

    }

