
    package Labsheet_09;
    abstract class Transport{
        protected String vehicleNumber;
        protected int distanceTravelled;

        public Transport(String vehicleNumber, int distanceTravelled) {
            this.vehicleNumber = vehicleNumber;
            this.distanceTravelled = distanceTravelled;
        }
        abstract double calculateFare();

        public void displayDetails(){
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Distance Travelled: " + distanceTravelled);
        }
    }

    class Bus extends Transport{

        public Bus(String vehicleNumber, int distanceTravelled) {
            super(vehicleNumber, distanceTravelled);
        }

        @Override
        double calculateFare() {
            return 10*distanceTravelled;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Total fare: " + calculateFare());
        }
    }
    class Taxi extends Transport{

        public Taxi(String vehicleNumber, int distanceTravelled) {
            super(vehicleNumber, distanceTravelled);
        }

        @Override
        double calculateFare() {
            return 20*distanceTravelled + 50;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Total fare: " + calculateFare());
        }
    }
    public class TransportFareSystem {
        public static void main(String[] args) {
            Transport bus = new Bus("VTNB0002", 4);
            Transport taxi = new Taxi("VTNT002", 8);

            bus.displayDetails();
            System.out.println();
            taxi.displayDetails();
        }
    }


