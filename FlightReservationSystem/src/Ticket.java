public class Ticket {
    public String pnr,from,to,departureDateTime,arraivalDateTime,seatNo;
    public Flight flight;
    public  Passenger passenger;
    public float price;
    public boolean cancelled;

    public Ticket(String pnr, String from, String to, String departureDateTime,
                  String arraivalDateTime, String seatNo, Flight flight,
                  Passenger passenger, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arraivalDateTime = arraivalDateTime;
        this.seatNo = seatNo;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
        this.cancelled = cancelled;
    }

    public Passenger getPassenger() {
        return passenger;
    }

//    public String checkStatus(){
//
//    }
//
//    public int getFlightDuration(){
//
//    }



    public void cancel(boolean cancelled){
        this.cancelled=cancelled;
    }

}
