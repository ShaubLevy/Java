package rl;

import java.awt.Color;

public class Creature {

	private World world;
	
	public int x;
	public int y;
	
	public char glyph;
	private char glyph() {return glyph;}
	
	public Color color;
	private Color color() {return color;}
	
	public Creature (World world, char glyph, Color color) {
		this.world = world;
		this.glyph = glyph;
		this.color = color;
	}
}
