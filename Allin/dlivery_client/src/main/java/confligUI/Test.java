package confligUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame{
	private void init(){
		JPanel panel = new JPanel();
		String[] str = {"我是舒克", "我是贝塔"};
		MyComboBox co = new MyComboBox(str);
		co.setBounds(20, 20, 200, 30);
		panel.setLayout(null);
		panel.add(co);
		this.add(panel);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.setSize(800, 400);
		t.setVisible(true);
		t.init();
	}
}
