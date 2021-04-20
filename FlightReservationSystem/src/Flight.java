public class Flight {
    public String flightNumber,airline;
    public int capacity;
    private int bookedSeats;
    public int counter=1;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails(){
        return this.flightNumber+"\n"+this.airline;
    }

    public boolean checkAvailability(){

        if(capacity>bookedSeats) {
            return true;
        }else {
            return false;
        }
    }

    public void incrementBookingCounter(){
        counter++;
    }
}
