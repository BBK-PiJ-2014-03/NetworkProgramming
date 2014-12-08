import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

public interface CalendarService extends Remote {
    
    public Date getCalendar() throws RemoteException;
}