package fac;

import java.rmi.*;

public interface TestServerRMI extends Remote {
	public boolean dbConnectionTest() throws RemoteException;
	public void logout(Integer loginId);
	public Integer login(String username, String password);
}