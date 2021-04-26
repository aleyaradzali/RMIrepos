package ftmk.rmi.sensor.manager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ftmk.rmi.sensor.TemperatureSensor;

//step 3 
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor {

	public TemperatureSensorManager() throws RemoteException {
		super();

	}


	public int getTemperature() throws RemoteException {

		return 35;
	}

}
