package startup;

import javax.swing.SwingUtilities;

import gui.frame.MainFrame;
import gui.panel.MainPanel;
import gui.panel.SpendPanel;
import util.GUIUtil;

public class Bootstrap {
    public static void main(String[] args) throws Exception{
        GUIUtil.useLNF();

        //使用SwingUtilities.invokeAndWait方法启动，避免线程冲突
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                //显示主窗体
                MainFrame.instance.setVisible(true);
                //主窗体下显示消费一览panel
                MainPanel.instance.workingPanel.show(SpendPanel.instance);
            }
        });
    }
}
