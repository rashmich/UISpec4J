package org.uispec4j.interception.ui;

import org.uispec4j.interception.toolkit.empty.Empty;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import java.awt.*;

///CLOVER:OFF

public class UISpecRadioButtonUI extends BasicRadioButtonUI {
  public static ComponentUI createUI(JComponent component) {
    return new UISpecRadioButtonUI();
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
}
