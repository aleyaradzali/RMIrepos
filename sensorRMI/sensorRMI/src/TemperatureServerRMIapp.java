import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ftmk.rmi.sensor.TemperatureSensor;
import ftmk.rmi.sensor.manager.TemperatureSensorManager;

//step 4
public class TemperatureServerRMIapp {

	public static void main(String[] args) throws RemoteException {
		
		
		try {
			
			//1. create interface object
			TemperatureSensor sensorKepong = new TemperatureSensorManager();
			
			
			//2. get registry
			Registry rmiRegistry = LocateRegistry.getRegistry();
		
		
			// 3. registry interface object as remote object
			rmiRegistry.rebind("SensorKepong", sensorKepong);
			
			
			System.out.println("SensorKepong is successfully registered");
			
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		
		
		
		
		
	}

}
