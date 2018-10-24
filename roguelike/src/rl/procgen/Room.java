package rl.procgen;

import java.awt.Color;
import asciiPanel.AsciiPanel;

public enum Room {
	//for a square room (denoted by 'SQ_', the width is equal to the height 
	SQ_SMALL(5,5,AsciiPanel.cyan),
	SQ_MED(10,10,AsciiPanel.cyan),
	SQ_BIG(20,20,AsciiPanel.cyan);
	
	//corridors have 
	//COR_HORIZ
	//COR_VERT
	
	//rectangle
	//REC_SMALL
	
	private Color color;
	public Color color() { return color; }
	
	private int width;
	public int width() {return width;}
	
	private int height;
	public int height() {return height;}
	
	//public tile wall
	//public tile floor
	
	Room (int width, int height, Color color){
		this.width = width;
		this.height = height;
		this.color = color;
	}
}
