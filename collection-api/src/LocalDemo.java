import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
	public static void main(String[] args) {
		
//		ResourceBundle bundle = ResourceBundle.getBundle("msgs");
		
//		ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.CANADA_FRENCH);
		
//		ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.of("hi"));
		
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.of("mr"));
		
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}
}
