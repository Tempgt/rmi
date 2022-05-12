package rmi;
import java.net.MalformedURLException;
import java.rmi.*;

public class AddServer 
 {
	public static void main(String args[]) throws RemoteException, MalformedURLException 
	 {
          
          AddServerImpl addServerImpl = new AddServerImpl();
          Naming.rebind("AddServer", addServerImpl);
	 }
 }
