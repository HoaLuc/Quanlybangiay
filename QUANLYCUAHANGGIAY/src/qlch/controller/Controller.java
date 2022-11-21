package qlch.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import qlch.danhmuc.DanhMuc;
import qlch.view.TrangChuPanel;

public class Controller {

    private String kindSelected = "";
    private JPanel root;

    public Controller(JPanel root) {
        this.root = root;
    }

    public void setView(JPanel jpnItem, JLabel lblItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(139, 213, 237));
        lblItem.setBackground(new Color(139, 213, 237));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuPanel());
        root.validate();
        root.repaint();

    }
    
    public void setEvent(List<DanhMuc> list){
        for(DanhMuc item : list){
            
        }
    }
    
}
