/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadgilang.apps.utils;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author asus
 */
public class RightRendering extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column)
        ;
        setHorizontalAlignment(SwingConstants.RIGHT);
        return this;
    }
}
