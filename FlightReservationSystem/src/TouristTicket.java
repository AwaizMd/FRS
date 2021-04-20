public class TouristTicket {
    public  String hotelAddress;
    public String[] selectedTouristLocation;



    public TouristTicket(String hotelAddress) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation=new String[5];

    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    public String[] getSelectedTouristLocation(){
        return this.selectedTouristLocation;
    }

    public void removeTouristLocations(String[] location){
        this.selectedTouristLocation=location;
        location=null;
    }

    public void addTouristLocations(String[] location){
        this.selectedTouristLocation=location;
    }

}
