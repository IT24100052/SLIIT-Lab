package Lab7;


    class HotelApp {
        public static void main(String[] args) {
            // Creating a standard room booking
            StandardRoom standardRoom = new StandardRoom(101, "Alice", 3, true);
            // Creating a luxury suite booking
            LuxurySuite luxurySuite = new LuxurySuite(202, "Bob", 5, true);

            // Display details for Standard Room
            System.out.println("Standard Room Details:");
            standardRoom.displayRoomDetails();
            // Display cost with discount
            System.out.println("Cost with $10 discount per night: $" + standardRoom.calculateRoomCost(10));

            // Display details for Luxury Suite
            System.out.println("\nLuxury Suite Details:");
            luxurySuite.displayRoomDetails();
            // Display cost with discount
            System.out.println("Cost with $20 discount per night: $" + luxurySuite.calculateRoomCost(20));
        }
    }


