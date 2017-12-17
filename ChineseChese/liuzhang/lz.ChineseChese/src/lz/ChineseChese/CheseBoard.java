package lz.ChineseChese;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.ImageCapabilities;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;
public class CheseBoard extends JFrame implements ActionListener {
	public static void main(String[] args){
		new CheseBoard("���������սϵͳ");
	}
	//������ͼƬ����ʽǶ�봰����
	JLabel image;
	//����
	Container con;
	//������
	JToolBar menu;
	//���������ť(��ʼ���˳�)
	JButton start;
	JButton restart;
	JButton exit;
	//ϵͳ��ʾ��Ϣ
	JLabel st;
	//���캯����ʼ��һ������
	public CheseBoard(String title){
		ChesePiece piece;
		//��ô�������
		con = this.getContentPane();
		con.setLayout(null);
		
		//��������������ʼ����ť
		menu = new JToolBar();
		st = new JLabel("��ӭʹ�ã�ף����죡");
		st.setToolTipText("��Ϣ��ʾ");
		start = new JButton(" �� ʼ ");
		start.setToolTipText("��ʼ�µ���Ϸ");
		restart = new JButton(" ���¿�ʼ ");
		restart.setToolTipText("���¿�ʼ�µ���Ϸ");
		exit = new JButton(" �� �� ");
		exit.setToolTipText("�˳���Ϸ");
		
		//�Ѱ�ť��ӵ��˵���
		menu.setLayout(new GridLayout(0,4));
		menu.add(start);
		menu.add(restart);
		menu.add(exit);
		menu.add(st);
		menu.setBounds(0,0,538,30);
		con.add(menu);
		
		//������ӱ�ǩ,ע��Ҫ���������������̣�JLabel�����˳���Ǵ������ڣ������ӵ������ڵײ㲻���ڵ�����
		piece = new ChesePiece(con);
		
		//������̱�ǩ��ע���ļ�·�����ʹ��File.separator����ʽ���зָ��֤·����Ϣ�����ִ�λ
		
		image = new JLabel(new ImageIcon("src"+File.separator+"image"+File.separator+"main.gif"));
		//image = new JLabel(new ImageIcon("..\\lz.ChineseChese\\src\\image\\main.gif"));
		con.add(image);
		image.setBounds(0, 30, 558, 620);
		
		//�رմ���
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
		//���ھ�����ʾ
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize=this.getSize();
		if (frameSize.height > screenSize.height){
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width){
			frameSize.width = screenSize.width;
		}
		this.setLocation((screenSize.width - frameSize.width) / 2 - 280 ,(screenSize.height - frameSize.height ) / 2 - 350);
		//���ô������ԣ����ڱ�Ӧ�ò���ͼƬ��Ϊ���̣����Դ��ڲ�������
		this.setResizable(true);
		this.setTitle(title);
		this.setSize(558, 670);
		this.show();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
