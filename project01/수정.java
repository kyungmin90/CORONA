package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DataBase.LoginDAO;
import DataBase.LoginVO;
import javax.swing.SwingConstants;

public class 수정 {
	private static JTextField t1;
	private static JTextField id1;
	private static JTextField id2;
	private static JTextField id3;
	private static JTextField id4;
	private static JTextField id5;
	private static JTextField del1;
	private static JTextField del2;
	private static JTextField del3;
	private static JTextField del4;
	private static JTextField del5;
	private static JPasswordField t2;

	public static void main(String[] args) {
		JFrame f1 = new JFrame();
		f1.getContentPane().setBackground(new Color(0, 150, 179));
		f1.setSize(500, 500);
		//f1.setLocationRelativeTo(f);
		f1.getContentPane().setLayout(null);

		id1 = new JTextField();
		id1.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		id1.setBounds(128, 34, 200, 52);
		f1.getContentPane().add(id1);
		id1.setColumns(10);

		id2 = new JTextField();
		id2.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		id2.setColumns(10);
		id2.setBounds(128, 117, 200, 52);
		f1.getContentPane().add(id2);

		id3 = new JTextField();
		id3.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		id3.setColumns(10);
		id3.setBounds(128, 200, 200, 52);
		f1.getContentPane().add(id3);

		id4 = new JTextField();
		id4.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		id4.setColumns(10);
		id4.setBounds(128, 284, 200, 52);
		f1.getContentPane().add(id4);

		id5 = new JTextField();
		id5.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		id5.setColumns(10);
		id5.setBounds(128, 365, 200, 52);
		f1.getContentPane().add(id5);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("휴먼모음T", Font.PLAIN, 25));
		lblNewLabel.setBounds(55, 37, 70, 42);
		f1.getContentPane().add(lblNewLabel);

		JLabel lblId = new JLabel("I D");
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("휴먼모음T", Font.PLAIN, 25));
		lblId.setBounds(55, 120, 61, 42);
		f1.getContentPane().add(lblId);

		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw.setForeground(Color.WHITE);
		lblPw.setFont(new Font("휴먼모음T", Font.PLAIN, 25));
		lblPw.setBounds(55, 203, 61, 42);
		f1.getContentPane().add(lblPw);

		JLabel lblTel = new JLabel("Tel");
		lblTel.setHorizontalAlignment(SwingConstants.LEFT);
		lblTel.setForeground(Color.WHITE);
		lblTel.setFont(new Font("휴먼모음T", Font.PLAIN, 25));
		lblTel.setBounds(55, 294, 61, 42);
		f1.getContentPane().add(lblTel);

		JLabel lblBirth = new JLabel("Birth");
		lblBirth.setHorizontalAlignment(SwingConstants.LEFT);
		lblBirth.setForeground(Color.WHITE);
		lblBirth.setFont(new Font("휴먼모음T", Font.PLAIN, 25));
		lblBirth.setBounds(55, 368, 62, 42);
		f1.getContentPane().add(lblBirth);
		//아이디찾기 in 정보찾기
		JButton read = new JButton("찾기");
		read.setBackground(Color.WHITE);
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user_name = id1.getText();
				LoginDAO dao = new LoginDAO();

				try {
					LoginVO bag = dao.one(user_name);
					id2.setText(bag.getUser_id());
					id3.setText(bag.getUser_pw());
					id4.setText(bag.getUser_tel());
					id5.setText(bag.getUser_birth());

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(f1, "검색결과가 없습니다.");
				}

			}

		});
		read.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		read.setBounds(340, 34, 85, 52);
		f1.getContentPane().add(read);

		JLabel lblNewLabel_1 = new JLabel("* 이름을 입력하세요");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(128, 85, 136, 18);
		f1.getContentPane().add(lblNewLabel_1);
		f1.setVisible(true);

		
		
		
		f1.setVisible(true);
	}
		


}
