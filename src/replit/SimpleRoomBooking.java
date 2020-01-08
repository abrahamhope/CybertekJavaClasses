package replit;

public class SimpleRoomBooking {
    public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {
        if(!isAvailable || year!=2018  || (month==7&&(day>1&&day<9))){
            return false;
        }else {
            return true;
        }

    }
}
