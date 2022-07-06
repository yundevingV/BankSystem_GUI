import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.*;

import javax.swing.*;


class loginFrame extends JFrame {
	
	public loginFrame(String idF,String pwdF) {
		this.setSize(500,300);
		this.setLayout(new GridLayout(3,2));

		
		//버튼
		JButton deposit = new JButton("Deposit");
		this.add(deposit);
		JTextField idM = new JTextField("");
		this.add(idM);
		//돈넣기
		deposit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager m = Manager.getInstance();
				
				int money = Integer.parseInt(idM.getText());

				m.deposit(idF,pwdF, money);
			}});
		
		
		
		JButton withdraw = new JButton("Withdraw");
		this.add(withdraw);	
		JTextField idM1 = new JTextField("");
		this.add(idM1);
		withdraw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager m = Manager.getInstance();
				
				int money1 = Integer.parseInt(idM1.getText());

				m.withdraw(idF,pwdF, money1);
			}});
//		
		
		
		
		
		JButton backB = new JButton("back");

		this.add(backB);		
		backB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyFrame();

			}});
		JButton showB = new JButton("show");

		this.add(showB);		
		showB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager m = Manager.getInstance();

				m.show();

			}});
		
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
// 조인
class joinFrame extends JFrame {
	JButton joinB;
	public joinFrame() {
		this.setSize(500,300);
		this.setLayout(new GridLayout(3,2));
		this.add(new Label("ID :"));
		JTextField idF = new JTextField("");
		this.add(idF);
		
		this.add(new Label("Pwd :"));
		JTextField pwdF = new JTextField("");
		this.add(pwdF);
		
		joinB = new JButton("join");

		joinB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Manager m = Manager.getInstance();
				m.join(idF.getText(), pwdF.getText());
			}});
		this.add(joinB);		

		JButton backB = new JButton("back");

		this.add(backB);		
		backB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyFrame();

			}});
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
class MyFrame extends JFrame {
	JButton loginB;
	JButton joinB;
	public MyFrame() {
		this.setSize(500,300);
		this.setLayout(new GridLayout(3,2));
		this.add(new Label("ID :"));
		JTextField idF = new JTextField("");
		this.add(idF);
		
		this.add(new Label("Pwd :"));
		JTextField pwdF = new JTextField("");
		this.add(pwdF);
		loginB = new JButton("LogIn");
		this.add(loginB);		
		
		joinB = new JButton("join");
		joinB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new joinFrame();
			}});
		this.add(joinB);
		loginB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager m = Manager.getInstance();
				if(m.login(idF.getText(), pwdF.getText()))
					new loginFrame(idF.getText(),pwdF.getText());
				
			}});

		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
}
public class Bank {

	public static void main(String[] args) {
		new MyFrame();
	}

}
