package rl.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public interface Screen {
	public void displayOutPut(AsciiPanel terminal);
	
	public Screen respondToUserInput(KeyEvent key);
}
