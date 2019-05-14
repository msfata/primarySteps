import javax.swing.JOptionPane;

/**
 * @author msfata ProgrammingHelp
 *
 */
public class LargeLargerLargest {
	private static int largest = 0;
	private static int larger = 0;
	private static int large = 0;
	private static int king;
	private static int quen;
	private static int jack;

	public static void main(String[] args) {
		large = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
		larger = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
		if (large == larger) {
			System.out.println("amount is equals");
			System.exit(0);
		} else {
			largest = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
		}
		if (largest > larger && largest > large) {
			king = largest;
			if (larger > large) {
				quen = larger;
				jack = large;
			} else if (large > larger) {
				quen = large;
				jack = larger;
			}
		} else if (larger > largest && larger > large) {
			king = larger;
			if (largest > large) {
				quen = largest;
				jack = large;
			} else if (large > largest) {
				quen = large;
				jack = larger;
			}
		} else if (large > largest && large > larger) {
			king = large;
			if (largest > larger) {
				quen = largest;
				jack = larger;
			} else {
				quen = larger;
				jack = largest;
			}
		}

		System.out.println("largest : " + king);
		System.out.println("larger  : " + quen);
		System.out.println("large   :" + jack);
	}
}
