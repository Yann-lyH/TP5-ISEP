package edu.princeton.cs.introcs;

public class RebondConsole {

	public static double CoordBall(double Px, double Py, double Vx, double Vy) {
		boolean sol = false;
		int F = 0;
		int t = 0;
		double g = 0.981;
		if (Vx == 0 && Vy == 0) {
			System.out.println("cas sans vitesse initiale");
			while (sol != true) {
				if (Py <= 0) {
					Py = Math.abs(Py - Vy * t) - F;
					if (Py <= F) {
						System.out.println(" à t = " + t + " la balle est à terre");
						sol = true;
					}
					F = F + 2;

				} else {

					System.out.println("Vy: " + Vy);
					Vy = Vy + g * t;
					System.out.println("Py: " + Py);
					Py = Py - Vy * t;
					System.out.println("t:" + t);
					t = t + 1;
				}

			}

		} else {
			System.out.println("cas avec vitesse initiale");
			while (sol != true) {
				if (Py <= 0) {
					Py = Math.abs(Py - Vy * t) - F;
					if (Py <= F) {
						System.out.println(" à t = " + t + " la balle est à terre");
						sol = true;
					}
					F = F + 2;

				} else {
					System.out.println("Vx: " + Vx);
					System.out.println("Vy: " + Vy);
					Vy = Vy + g * t;
					System.out.println("Py: " + Py);
					Py = Py - Vy * t - 0.5 * g * t;
					System.out.println("Px:" + Px);
					Px = Px + Vx * t;
					System.out.println("t:" + t);
					t = t + 1;
				}

			}
		}
		return (0);

	}

	public static void main(String[] args) {
		CoordBall(0.0, 30.0, 0.0, 0.0);
		// CoordBall(0.0, 30.0, 5, 6);

	}
}
