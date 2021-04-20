public class Main {
    public static void main(String args[]){

//        Flight flight=new Flight("qw","as",23,123);
//        System.out.println(flight.getFlightDetails());
//        System.out.println(flight.checkAvailability());
//        System.out.println(flight.getBookedSeats());

        System.out.println(printTicketDetails(ticket1.pnr));
        System.out.println(printTicketDetails(ticket2.pnr));







    }



    public static void printTicketDetails(Ticket ticket){

        RegularTicket ticket1=new RegularTicket("none","1232","Hyderabad",
                "Pune","12:20 pm","3:00 pm","122", ticket.getFlight(),
                ticket.getPassenger(),1200.0f,false);

        TouristTicket ticket2=new TouristTicket("Taj Krishna Hotel","1233","mumbai",
                "Pune","12:20 pm","3:00 pm","100", ticket.getFlight(),
                ticket.getPassenger(),1200.0f,false);


    }
}
