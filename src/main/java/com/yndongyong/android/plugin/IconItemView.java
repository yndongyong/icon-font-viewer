package com.yndongyong.android.plugin;

import com.yndongyong.android.plugin.IconFontGlyph;
import com.yndongyong.android.plugin.IconVo;

import javax.swing.*;
import java.awt.*;

public class IconItemView extends JComponent {
    private JPanel rootPanel;
    private IconFontGlyph iconFontGlyph;
    private JLabel jTextCodePoint;
    private JLabel jTextScript;

    private void createUIComponents() {
        rootPanel = new JPanel();
    }

    public IconItemView(IconFontGlyph iconFontGlyph) {
        this.iconFontGlyph = iconFontGlyph;
        setUI();
    }

    private void setUI() {
        IconVo iconVo = iconFontGlyph.getIconVo();
//        jTextCodePoint.setText("&#x" + Integer.toHexString(iconVo.getCodePoint()) + ";");
        jTextCodePoint.setText("\\u" + Integer.toHexString(iconVo.getCodePoint()));
        jTextScript.setText(iconVo.getPostScript());
    }

    @Override
    public Component getComponent(int n) {
        return rootPanel;
    }
}
