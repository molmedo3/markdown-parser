MarkdownParse.class: MarkdownParse.java
	echo "MarkdownParse.class"
	javac MarkdownParse.java
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	echo "MarkdownParseTest.class"
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
runtest: MarkdownParseTest.class 
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest