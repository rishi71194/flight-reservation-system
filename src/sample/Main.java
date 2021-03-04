package sample;

public class Main {

    public static void  printTicketDetails(Ticket ticket){
           System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {
        String[] touristLocation = new String[]{"Bat", "Ball", "Iron Piller"};
        Flight flight = new Flight("12345", "JetAirways", 40);
        Passenger passenger = new Passenger("Vasant Kunj", "NewDelhi", "Delhi", "Rishi", "9971827550", "rbanerjee71194@gmail.com");

        RegularTicket ticket1 = new RegularTicket("112233", "DEL", "MUM", flight, "20/02/2020 20:00", "20/02/2020 23:00", passenger, "2", 2000, false, "Food, Drinks");
        TouristTicket ticket2 = new TouristTicket("122132", "MUM", "DEL", flight, "20/02/2020 16:00", "20/02/2020 19:00", passenger, "3", 2500, false, "8685,C-8,Vasant Kunj", touristLocation);

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);


    }
}
