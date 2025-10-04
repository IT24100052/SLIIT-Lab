package Lab7;


    class Room {
        protected int roomNumber;
        protected String guestName;
        protected int nightsStayed;

        // Default constructor
        public Room() {
            this.roomNumber = 0;
            this.guestName = "Unknown";
            this.nightsStayed = 0;
        }

        // Parameterized constructor
        public Room(int roomNumber, String guestName, int nightsStayed) {
            this.roomNumber = roomNumber;
            this.guestName = guestName;
            this.nightsStayed = nightsStayed;
        }

        // Method to display room details
        public void displayRoomDetails() {
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Guest Name: " + guestName);
            System.out.println("Nights Stayed: " + nightsStayed);
        }

        // Method to calculate total room cost
        public double calculateRoomCost() {
            return 150.00 * nightsStayed; // Default cost per night is $150
        }

        // Overloaded method to calculate room cost with discount per night
        public double calculateRoomCost(int discount) {
            return calculateRoomCost() - (discount * nightsStayed);
        }
    }

    // Subclass representing a standard room
    class StandardRoom extends Room {
        private boolean hasWiFi; // this Indicates if Wi-Fi is available

        // Constructor
        public StandardRoom(int roomNumber, String guestName, int nightsStayed, boolean hasWiFi) {
            super(roomNumber, guestName, nightsStayed);
            this.hasWiFi = hasWiFi;
        }

        // Override method to calculate room cost
        public double calculateRoomCost() {
            return 100.00 * nightsStayed; // Cost per night is $100
        }

        // Override method to display room details
        public void displayRoomDetails() {
            super.displayRoomDetails();
            System.out.println("Wi-Fi Included: " + (hasWiFi ? "Yes" : "No"));
            System.out.println("Total Cost: $" + calculateRoomCost());
        }
    }

    // Subclass representing a luxury suite
    class LuxurySuite extends Room {
        private boolean includesExtras; // Indicates if extra services are included

        // Constructor
        public LuxurySuite(int roomNumber, String guestName, int nightsStayed, boolean includesExtras) {
            super(roomNumber, guestName, nightsStayed);
            this.includesExtras = includesExtras;
        }

        // Override method to calculate room cost (Luxury suites are more expensive)
        @Override
        public double calculateRoomCost() {
            return (200.00 * nightsStayed) + (includesExtras ? 75 : 0); // Extra charge of $75 if extras are included
        }

        // Override method to display room details
        @Override
        public void displayRoomDetails() {
            super.displayRoomDetails();
            System.out.println("Includes Breakfast & Airport Pickup: " + (includesExtras ? "Yes" : "No"));
            System.out.println("Total Cost: $" + calculateRoomCost());
        }
    }

    // Main class to run the program


