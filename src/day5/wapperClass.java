package day5;
public class wapperClass {

		public static void main(String[] args) {
        
			Double d = new Double(2.5);

			Double a = new Double(8.9);
			System.out.println(eq(d));
			compare(d, a);
		}

		public static void compare(Double d, Double a) {
			System.out.println(d.compareTo(d));

		}

		public static String eq(Double d) {
			if (d.equals(2.0)) {
				return "equal";
			} else {
				return "Not equal";
			}
		}
	}
