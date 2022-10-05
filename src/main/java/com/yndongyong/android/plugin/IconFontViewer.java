package com.yndongyong.android.plugin;

import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public abstract class IconFontViewer implements FileEditor {
    protected JPanel rootPanel;
    protected JLabel jLabelFontName;
    protected JTextField jTextSearch;
    protected JButton jButtonSearch;
    protected JList<IconVo> jListIcons;
    protected JScrollPane jScrollPanel;
    private JLabel codeString;

    private void createUIComponents() {
        rootPanel = new JPanel();
    }

    @Override
    public @Nullable VirtualFile getFile() {
        return (VirtualFile)FILE_KEY.get(this);
    }
}
