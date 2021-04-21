public class Main {
    public static void main(String args[]){

//        Flight flight=new Flight("qw","as",23,123);
//        System.out.println(flight.getFlightDetails());
//        System.out.println(flight.checkAvailability());
//        System.out.println(flight.getBookedSeats());

//        System.out.println(printTicketDetails(ticket1.pnr));
//        System.out.println(printTicketDetails(ticket2.pnr));

//        Flight flight = new Flight();
//        System.out.println(flight.getAirline());

        Ticket ticket=new RegularTicket();
        printTicketDetails(ticket);

    }

    public static void printTicketDetails(Ticket ticket){

        RegularTicket ticket1=new RegularTicket("none","PNR no: 1234","Hyderabad",
                "Pune","12:20 pm","3:00 pm","122", ticket.getFlight(),
                ticket.getPassenger(),1200.0f,false);
        System.out.println(ticket1.getPnr());

        TouristTicket ticket2=new TouristTicket("Taj Krishna Hotel","PNR no: 43245","mumbai",
                "Pune","12:20 pm","3:00 pm","100", ticket.getFlight(),
                ticket.getPassenger(),1200.0f,false);
        System.out.println(ticket2.getPnr());


    }
}
