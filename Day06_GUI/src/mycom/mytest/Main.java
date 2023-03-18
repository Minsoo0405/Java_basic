package mycom.mytest;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Frame f = new Frame();

        Button btnLogin = new Button("login");
        Button btnCancel = new Button("cancel");
        Button btnClear = new Button("Clear");

        Panel pCenter = new Panel(); // Container Component: LayoutManager(Flow)를 가지고 있음
        pCenter.add(btnLogin);
        pCenter.add(btnCancel);
        pCenter.add(btnClear);

        f.add("Center",pCenter);

        f.setSize(800,600);
        f.setVisible(true);

    }
}
