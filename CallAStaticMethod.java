//UIUC CS125 FALL 2013 MP. File: CallAStaticMethod.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T15:57:58-0500.653928462
//@author schmnsk2
/**
 * Prints out only lines that contain an email address Each printed line is
 * justified to right by prepending the text with '.' characters The minimum
 * width of the line including padding is 40 characters. See the test case for
 * example input and expected output.
 */
class CallAStaticMethod {

	public static void main(String[] args) {

		while (!TextIO.eof()) {
			String line = TextIO.getln();
			// Use ExampleClassMethods
			// 'isEmailAddress' and 'createPadding' to complete this method
			if(ExampleClassMethods.isEmailAddress(line)){
				String periods = ExampleClassMethods.createPadding('.', 40 - line.length());
				TextIO.putln(periods + line);
			}
		}
		

	}
}
