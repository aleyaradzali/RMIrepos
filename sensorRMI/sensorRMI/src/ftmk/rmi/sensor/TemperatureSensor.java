package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;

// step 1 
public interface TemperatureSensor extends Remote {
   //step  2
	public int getTemperature() throws RemoteException;
}
