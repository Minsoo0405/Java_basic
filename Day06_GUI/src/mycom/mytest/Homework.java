package mycom.mytest;

import javax.swing.text.LabelView;
import java.awt.*;
public class Homework {
    public static void main(String[] args) {
        Frame f = new Frame();
        GridLayout gl = new GridLayout(2,2);
        Panel pScreen = new Panel();
        Panel pText = new Panel();
        Panel pBtn = new Panel();

        Button bLogin = new Button("로그인");
        Button bPassword = new Button("취소");

        Label login = new Label("로그인 화면", Label.CENTER);
        Label Id = new Label("아이디");
        Label Pw = new Label("비밀번호");

        TextField tId = new TextField(10);
        TextField tPw = new TextField(10);

        pScreen.add(login);
        pText.setLayout(gl);
        pText.add(Id);
        pText.add(tId);
        pText.add(Pw);
        pText.add(tPw);
        pBtn.add(bLogin);
        pBtn.add(bPassword);

        f.add("North",pScreen);
        f.add("Center", pText);
        f.add("South", pBtn);

        f.setSize(400,250);
        f.setVisible(true);

    }
}
