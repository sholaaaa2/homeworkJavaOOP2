package level2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String text = "Hello World";
		TextTransformer tt = new TextTransformer();
		InverseTransformer it = new InverseTransformer();
		UpDownTransformer udt = new UpDownTransformer();
		
		File file = new File("c.txt");
		
		TextSaver ts = new TextSaver(udt, file);
		
		System.out.println(tt.transform(text));
		System.out.println(it.transform(text));
		System.out.println(udt.transform(text));
		
		ts.saveTextToFile(text);
	}

}
