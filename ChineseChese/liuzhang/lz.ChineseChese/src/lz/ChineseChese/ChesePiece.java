package lz.ChineseChese;

import java.awt.Container;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ChesePiece {
	JLabel[] pieces=new JLabel[32];
	//ʹ��i��k���������Ӱڷŵ�������
	int i;
	int k;
	//����ͼ��
	Icon in;
	//���ӵĹ��캯����ʼ������λ��,����ÿ�����ӵ�λ����ͨ�����̴�С�����Ӵ�С��������ģ�ÿһ���������57
	public ChesePiece(Container con){
		//��------����-------��
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"�ڳ�.gif");
		for(i=0, k=24;i<2;i++,k+=456){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,56,55,55);
		}
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=2, k=81;i<4;i++,k+=342){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,56,55,55);
		}
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=4, k=138;i<6;i++,k+=228){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,56,55,55);
		}
		//ʿ
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"��ʿ.gif");
		for(int i=6, k=195;i<8;i++,k+=114){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,56,55,55);
		}
		//�� 
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"�ڽ�.gif");
		pieces[8] = new JLabel(in);
		con.add(pieces[8]);
		pieces[8].setBounds(252,56,55,55);
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=9, k=81;i<11;i++,k+=342){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,170,55,55);
		}
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=11, k=24;i<16;i++,k+=114){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,227,55,55);
		}
		//��------����------��
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"�쳵.gif");
		for(int i=16, k=24;i<18;i++,k+=456){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,569,55,55);
		}
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=18, k=81;i<20;i++,k+=342){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,569,55,55);
		}
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=20, k=138;i<22;i++,k+=228){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,569,55,55);
		}
		//ʿ
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"��ʿ.gif");
		for(int i=22, k=195;i<24;i++,k+=114){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,569,55,55);
		}
		//˧
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"�콫.gif");
		pieces[24] = new JLabel(in);
		con.add(pieces[24]);
		pieces[24].setBounds(252,569,55,55);
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=25, k=81;i<27;i++,k+=342){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,455,55,55);
		}
		//��
		in = new ImageIcon("src"+File.separator+"image"+File.separator+"����.gif");
		for(int i=27, k=24;i<32;i++,k+=114){
			pieces[i] = new JLabel(in);
			con.add(pieces[i]);
			pieces[i].setBounds(k,398,55,55);
		}
		/*
		 * pieces�е����ӷֲ�Ϊ{0�ڳ�1��1�ڳ�2��2����1��3����2��4����1��5����2��6��ʿ1��7��ʿ2��8�ڽ���9����1��10����2��11����1��12����2��13����3��14����4��15����5
		 *                  16�쳵1��17�쳵2��18����2��19����2��20����1��21����2��22��ʿ1��23��ʿ2��24��˧��25����1��26����2��27���1��28���2��29���3��30���4��31���5}
		 */
	}
}
