/**
 * The object of this class creates two panels (one for Mouse stuff and one to show status)
 * The MouseEventPanel has two listeners 
 */
import java.awt.*;import java.awt.*;
import javax.swing.*;

public class MouseEventFrame extends SimpleFrame {
    private MouseEventPanel mePanel;
    private StatusPanel stPanel;
    private MyMousePositionListener mPL; 
    private MyMouseListener mL;
        
    public MouseEventFrame() {
        this.setTitle("Mouse Click Application");
        mePanel = new MouseEventPanel();
        add(mePanel,BorderLayout.CENTER);
        stPanel = new StatusPanel();        
        add(stPanel,BorderLayout.SOUTH);
        pack();
        //create the mePanel's MousePostionListener with a link to status panel
        mPL = new MyMousePositionListener(stPanel, mePanel);
        mePanel.addMouseMotionListener(mPL);
        //create the mePanel's MouseListener with a link to status pane
        mL = new MyMouseListener(stPanel,mePanel);
        mePanel.addMouseListener(mL);
    }
}
