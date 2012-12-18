package fac;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import fa.TestSeverRMI;

public class Client {

	private static TestSeverRMI test;
	private static Integer loginId; 
	
	public static void main(String[] args) {
	
		System.setSecurityManager(new RMISecurityManager());

		try {
			test = (TestSeverRMI) Naming.lookup("rmi://127.0.0.1:9090/testserver");
			//loginId = test.login(args[0], args[1]);
			test.dbConnectionTest();
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
