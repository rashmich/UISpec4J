package org.uispec4j.interception.ui;

import org.uispec4j.interception.toolkit.empty.Empty;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

///CLOVER:OFF

public class UISpecOptionPaneUI extends BasicOptionPaneUI {
  public static ComponentUI createUI(JComponent component) {
    return new UISpecOptionPaneUI();
  }

  public void paint(Graphics g, JComponent c) {
  }

  protected void maybeUpdateLayoutState() {
  }

  public Dimension getPreferredSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }

  public Dimension getMaximumSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }

  public Dimension getMinimumSize(JComponent c) {
    return Empty.NULL_DIMENSION;
  }

  protected Icon getIconForType(int messageType) {
    if (messageType < 0 || messageType > 3) {
      return null;
    }
    return Empty.NULL_ICON;
  }
}
