
public class Account {
	public Account(String idF, String pwdF) {
		this.id = idF;
		this.pwd = pwdF;
	}
	
	
	String id;
	String pwd;
	int money;
	
	public String getId() {
		return this.id;
	}
	public String getPwd() {
		return this.pwd;
	}
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
