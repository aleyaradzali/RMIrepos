import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ftmk.rmi.sensor.TemperatureSensor;

public class TemperatureClientRMIapp {

	public static void main(String[] args) {
		
		
		try {
			
			//1 Get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
			
			//2 lookup for the remote object
			TemperatureSensor remotesensorKepong = (TemperatureSensor) rmiRegistry.lookup("SensorKepong");
		
			//3 invoke method from the remote object
			int currTemperature = remotesensorKepong.getTemperature();
			
			
			System.out.println("Current Temperature : " + currTemperature + " Celcius");
			
			
		} catch (RemoteException | NotBoundException e) {
			
			e.printStackTrace();
		}

	}

}
