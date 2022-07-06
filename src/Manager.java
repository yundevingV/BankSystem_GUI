import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	private ArrayList<Account> list;
	
	
	private static Manager instance = new Manager();
	
	private Manager() {
		list = new ArrayList<Account>();
	}
	public static Manager getInstance() {
		return instance;
	}
	
	public void join(String idF,String pwdF) {
		list.add(new Account(idF, pwdF));
		for(Account a : list) {
			System.out.println(a.id);
			System.out.println(a.pwd);
		}
	}
	public String act(String idF, String pwdF) {

		return "zxcasd";
	}

	public boolean login(String idF, String pwdF) {
		for(Account a : list) {
			if(a.id.equals(idF)){
				if(a.pwd.equals(pwdF)) {
					return true;
				}
			}
		} 
	       return false;
	    }
	
	public void withdraw(String idF, String pwdF, int m) {
		for(Account a : list) {
			if(a.id.equals(idF)){
				if(a.pwd.equals(pwdF)) {
					if(m > a.getMoney()) {}
					else {
					a.setMoney(a.getMoney() - m);
					}
				}
			}
		} 
	}

	public void deposit(String idF, String pwdF, int m) {
		for(Account a : list) {
			if(a.id.equals(idF)){
				if(a.pwd.equals(pwdF)) {
					a.setMoney(a.getMoney() + m);
				}
			}
		} 
	}
	public void show() {
		for(Account a : list) {
			System.out.println(a.getId() + a.getPwd() + a.getMoney());
		}
	}
}

		
	
	

