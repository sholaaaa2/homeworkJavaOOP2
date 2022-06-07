package level2;

public class InverseTransformer extends TextTransformer {
	@Override
	public String transform(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		return sb.toString();
	}
}
