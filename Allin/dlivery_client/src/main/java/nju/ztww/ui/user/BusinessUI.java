package nju.ztww.ui.user;
/**
 * 田琦
 * 
 * */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BusinessUI extends JPanel{
	
	JButton CarLoadingButton=new JButton();
	JButton receiveAndSendButton=new JButton();
	JButton ReceiveBillButton=new JButton();
	JButton CarManageButton=new JButton();
	JButton DriverManageButton=new JButton();
	JButton YourMessageButton=new JButton();
	
	public BusinessUI(){
		
		ImageIcon CarLoading=new ImageIcon("photo/CarLoading.gif");
		ImageIcon receiveAndSend=new ImageIcon("photo/receiveAndSend.gif");
		ImageIcon ReceiveBill=new ImageIcon("photo/ReceiveBill.gif");
		ImageIcon CarManage=new ImageIcon("photo/CarManage.gif");
		ImageIcon DriverManage=new ImageIcon("photo/DriverManage.gif");
		ImageIcon YourMessage=new ImageIcon("photo/YourMessage.gif");
		
		this.setBorder(new javax.swing.border.TitledBorder(null, "",
				javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.DEFAULT_POSITION));
				
		this.setLayout(null);
		CarLoadingButton.setIcon(CarLoading);
		CarLoadingButton.setBounds(0,60,209,58);
		CarLoadingButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				TextBussinessUI.changePanel(1);
			}});
		
		receiveAndSendButton.setIcon(receiveAndSend);
		receiveAndSendButton.setBounds(0,118,209,58);
		receiveAndSendButton.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent e) {
						TextBussinessUI.changePanel(2);
					}});
		
		ReceiveBillButton.setIcon(ReceiveBill);
		ReceiveBillButton.setBounds(0,176,209,58);
		ReceiveBillButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				TextBussinessUI.changePanel(3);
			}});
		
		
		CarManageButton.setIcon(CarManage);
		CarManageButton.setBounds(0,234,209,58);
		CarManageButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				TextBussinessUI.changePanel(4);
			}});
		
		DriverManageButton.setIcon(DriverManage);
		DriverManageButton.setBounds(0,292,209,58);
		DriverManageButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				TextBussinessUI.changePanel(5);
			}});
		
		YourMessageButton.setIcon(YourMessage);
		YourMessageButton.setBounds(0,350,209,58);
		YourMessageButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				TextBussinessUI.changePanel(6);
			}});
	
		this.add(CarLoadingButton);
		this.add(receiveAndSendButton);
		this.add(ReceiveBillButton);
		this.add(CarManageButton);
		this.add(DriverManageButton);
		this.add(YourMessageButton);
		//this.repaint();
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Image background=new ImageIcon("photo/background.gif").getImage();
		g.drawImage(background, 0,0,null);
		
	}
	
}
