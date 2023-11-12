package br.com.alura.threads;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MultiplicationTask implements Runnable {
	/*
	 * attribute
	 */
	private JTextField first;
	private JTextField second;
	private JLabel result;

	/*
	 * constructor
	 */
	public MultiplicationTask(JTextField first, JTextField second, JLabel result) {
		this.first = first;
		this.second = second;
		this.result = result;
	}

	/*
	 * methods
	 */
	@Override
	public void run() {
		long value_1 = Long.parseLong(first.getText());
		long value_2 = Long.parseLong(second.getText());
		BigInteger calculation = new BigInteger("0");

		for (int i = 0; i < value_1; i++) {
			for (int j = 0; j < value_2; j++) {
				calculation = calculation.add(new BigInteger("1"));
			}
		}

		result.setText(calculation.toString());
	}

}
