package rl.procgen;

import java.awt.Color;
import asciiPanel.AsciiPanel;

public enum Room {
	//do room dimensions include walls? i think so
	//that would mean a room size of 5 would have to change to 7
	
	//for a square room (denoted by 'SQ_', the width is equal to the height 
	SQR_SML(7,7,AsciiPanel.cyan),
	SQR_MED(12,12,AsciiPanel.cyan),
	SQR_BIG(22,22,AsciiPanel.cyan);
	
	//corridors have different size types, where the size refers to the width of
	//walkable space in the direction that the corridor spans
	//COR_HRZ()
	//COR_VRT
	
	//rectangle
	//REC_SML
	
	private Color color;
	public Color color() { return color; }
	
	
	/* should width refer to the width of open, empty space in the room (A)
	 * or to the total width of the room including walls (B)?
	 * 
	 * (A) a room with width 5
	 * 
	 * 		1~2~3~4~5~6~7
	 *		# . . . . . #
	 *		# . . . . . #
	 *		# . . . . . #
	 *		~ ~ ~ ~ ~ ~ ~ 
	 *
	 * (B) a room with width 5
	 * 
	 * 		1~2~3~4~5
	 *		# . . . #
	 *		# . . . #
	 *		# . . . #
	 *		~ ~ ~ ~ ~ 
	 *
	 * This question also applies to height and a potential z-dimension
	 * for simplicity and ease of checking space available, i think solution (B)
	 * would be best
	 */
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
