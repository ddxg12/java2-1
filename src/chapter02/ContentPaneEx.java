package chapter02;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제"); //프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane(); //컨텐트팬 알아내기
        contentPane.setBackground(Color.ORANGE); //오렌지색 배경설정
        contentPane.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout
                                                 //배치관리자 달기
        contentPane.add(new JButton("OK")); //OK버튼 달기
        contentPane.add(new JButton("Cancel")); //Cancel버튼 달기
        contentPane.add(new JButton("Ignore"));
        
        setSize(300, 150);
        setVisible(true);
    }   
    public static void main(String[] args) {
        new ContentPaneEx();
    }

}
