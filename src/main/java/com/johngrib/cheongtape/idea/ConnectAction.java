package com.johngrib.cheongtape.idea;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * Connect 메뉴 토글 기능을 제공합니다.
 */
public class ConnectAction extends ToggleAction {
  private boolean selected = false;
  private Logger logger = Logger.getInstance(ConnectAction.class);

  @Override
  public boolean isSelected(@NotNull AnActionEvent e) {
    return this.selected;
  }

  @Override
  public void setSelected(@NotNull AnActionEvent e, boolean state) {
    logger.info("Connect " + selected + " => " + !selected);
    this.selected = !selected;
  }
}