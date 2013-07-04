/*
 * Copyright (c) 2008 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 */
package com.haulmont.cuba.gui.components;

/**
 * @author abramov
 * @version $Id$
 */
public interface BoxLayout extends ExpandingLayout, Component.Spacing, Component.Margin, Component.BelongToFrame {

    String VBOX = "vbox";
    String HBOX = "hbox";
}