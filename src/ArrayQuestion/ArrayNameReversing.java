package ArrayQuestion;

//Sriya
public class ArrayNameReversing {
	public static void main(String[] args) {
		String name = "sriya shrestha    ";
		// agadi ra paxadi ko value hatauxa
		name = name.trim();
		
		String revName = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}
		//replacing or removing space in between
		System.out.println(revName.replaceAll("\\s+",""));
		System.out.println(revName);
	}
}
