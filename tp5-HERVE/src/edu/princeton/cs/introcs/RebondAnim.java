package edu.princeton.cs.introcs;

public class RebondAnim {
	public final static int X_MAX = 1000, Y_MAX = 1000;
	public final static float WiDTH = 200f;

	public static void main(String[] args) {
		StdDraw.setXscale(-WiDTH, X_MAX + WiDTH);
		StdDraw.setYscale(-WiDTH, Y_MAX + WiDTH);
		double x = X_MAX / 2, y = Y_MAX, vx = 0, vy = 0, g = 0.981;
		while (true) {
			x = x + vx;
			y = y + vy;
			vy = vy - g;
			StdDraw.clear(StdDraw.GRAY);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(x, y, WiDTH);
			StdDraw.show(10);
			if (y < 0) {
				vy = -vy;
				y = 0;

			}
		}
	}

}
