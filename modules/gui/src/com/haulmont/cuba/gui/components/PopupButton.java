/*
 * Copyright (c) 2010 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 */
package com.haulmont.cuba.gui.components;

/**
 * @author pavlov
 * @version $Id$
 */
public interface PopupButton extends Component.ActionsHolder,
        Component.HasCaption, Component.BelongToFrame, Component.HasIcon {

    String NAME = "popupButton";

    boolean isPopupVisible();

    void setPopupVisible(boolean popupVisible);

    void setMenuWidth(String width);

    boolean isAutoClose();

    void setAutoClose(boolean autoClose);
}