/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.utils;

/**
 *
 * @author Administrator
 */
public class DiceRoller {
	public static int rollDice() {
		return (int) ((Math.random() * 6) + 1);
	}
}
