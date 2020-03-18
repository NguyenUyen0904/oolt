package week1;
//chưa hiểu, tý hỏi anh ny đẹp zai

import javax.swing.*;

public class Bai7LuaChon {
    public static void main(String[] args) {
        int iLuaChon;
        String strLuaChon;

        iLuaChon = JOptionPane.showConfirmDialog(null,
                "Ban co muon chuyen sang ve hang nhat khong?");

        if (iLuaChon == JOptionPane.YES_OPTION)
            strLuaChon = "co";
        else
            strLuaChon = "khong";

        JOptionPane.showMessageDialog(null, "Ban da chon " + strLuaChon);
        System.exit(0);
    }

}
