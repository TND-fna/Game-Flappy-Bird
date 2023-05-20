package view;

import java.awt.BorderLayout;

import javax.swing.AbstractButton;

public class DecorateButton extends AbstractButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AbstractButton button;

	public DecorateButton(AbstractButton c) {

		button = c;
		setLayout(new BorderLayout());
		add("Center", c);

	}

	public AbstractButton getBtn() {
		return button;
	}
}
