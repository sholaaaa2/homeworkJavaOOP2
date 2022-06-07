package level2;

public class UpDownTransformer extends TextTransformer {
	@Override
	public String transform(String text) {
		StringBuilder sb = new StringBuilder(text);
		String big = text.toUpperCase();
		String small = text.toLowerCase();
		for (int i = 0; i < sb.length(); i++) {
			if (i%2==0) {
				sb.setCharAt(i, big.charAt(i));
			} else {
				sb.setCharAt(i, small.charAt(i));
			}
		}
		return sb.toString();
	}
}
