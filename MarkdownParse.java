//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next 
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            
            if (closeParen == -1 || openParen == -1 || closeBracket == -1 || openBracket == -1){
                break;
            }
            else if(openBracket - 1 < 0){
                break;

            }
           
            if(markdown.substring(openBracket-1, openBracket).equals("!")){

            } 
            else if (!markdown.substring(closeBracket+1, closeBracket+2).equals("(")){

            }
            else{
                toReturn.add(markdown.substring(openParen+1, closeParen));
                
            }
            currentIndex = closeParen + 1;

           

            
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
        }
}