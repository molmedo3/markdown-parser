
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void getLinksTest() throws IOException{
        Path fileName = Path.of("./test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("https://something.com");
        something.add("some-thing.html");
        assertEquals(something, links);
        
    }

    @Test
    public void getLinksTest2() throws IOException{
        Path fileName = Path.of("./test2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);
       

        
    }

    @Test
    public void getLinksTest3() throws IOException{
        Path fileName = Path.of("./test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);
        

        
    }

    @Test
    public void getLinksTest4() throws IOException{
        Path fileName = Path.of("./test4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("https://google.com");
        something.add("google.html");
        something.add("abc.com");
        assertEquals(something, links);        
    }
    @Test
    public void getLinksTestfile2() throws IOException{
        Path fileName = Path.of("./test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("https://something.com");
        something.add("some-page.html");
        assertEquals(something, links);     
    }  
    @Test
    public void getLinksTestfile3() throws IOException{
        Path fileName = Path.of("./test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }  
    @Test
    public void getLinksTestfile4() throws IOException{
        Path fileName = Path.of("./test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }  
    @Test
    public void getLinksTestfile5() throws IOException{
        Path fileName = Path.of("./test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }  
    @Test
    public void getLinksTestfile6() throws IOException{
        Path fileName = Path.of("./test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }
    @Test
    public void getLinksTestfile7() throws IOException{
        Path fileName = Path.of("./test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }
    @Test
    public void getLinksTestfile8() throws IOException{
        Path fileName = Path.of("./test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }
    
    
    @Test
    public void snippet1Test() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("google.com");
        assertEquals(something, links);        
    }
    
    @Test
    public void snippet2Test() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("b.com");
        something.add("example.com");
        assertEquals(something, links);        
    }

    @Test
    public void snippet3Test() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("https://www.twitter.com");
        something.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        something.add("https://cse.ucsd.edu/");
        assertEquals(something, links);        
    }


    
}
