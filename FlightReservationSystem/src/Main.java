public class Main {
    public static void main(String args[]){

        Flight flight=new Flight("qw","as",23,123);
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());
        System.out.println(flight.getBookedSeats());

    }
}
