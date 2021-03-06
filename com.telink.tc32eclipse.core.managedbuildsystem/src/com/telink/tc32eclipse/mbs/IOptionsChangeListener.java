/******************************************************************************
 * Copyright (c) 2009-2016 Telink Semiconductor Co., LTD.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * -----------------------------------------------------------------------------
 * Module:
 * Purpose:
 * Reference :   
 * $Id: IOptionsChangeListener.java 851 20.1.08-07 19:37:00Z innot $
 *******************************************************************************/
/**
 * 
 */
package com.telink.tc32eclipse.mbs;

/**
 * @author Thomas
 *
 */
public interface IOptionsChangeListener {

	public void optionChanged(String option, String newvalue);
	
}
