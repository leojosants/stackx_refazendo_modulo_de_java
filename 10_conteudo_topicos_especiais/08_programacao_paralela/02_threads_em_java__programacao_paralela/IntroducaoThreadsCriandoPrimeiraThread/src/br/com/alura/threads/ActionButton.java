
package br.com.alura.threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionButton implements ActionListener {
	/*
	 * attribute
	 */
	private JTextField first;
	private JTextField second;
	private JLabel result;

	/*
	 * constructor
	 */
	public ActionButton(JTextField first, JTextField second, JLabel result) {
		this.first = first;
		this.second = second;
		this.result = result;
	}

	/*
	 * methods
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		MultiplicationTask task = new MultiplicationTask(first, second, result);
		Thread thread_calculation = new Thread(task);
		thread_calculation.start();
	}

}