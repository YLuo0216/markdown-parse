import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    /*@Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
    @Test
    public void getLinks2() throws IOException {
        Path filename = Path.of("testFile2.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("https://link1.com", "https://link2.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks3() throws IOException {
        Path filename = Path.of("testFile3.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("https://link1.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks4() throws IOException {
        Path filename = Path.of("testFile4.md");
        String contents = Files.readString(filename);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile() throws IOException{
        Path fileName = Path.of("test-fileA.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksTestFile2() throws IOException{
        Path fileName = Path.of("test-file2A.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksBracketFile() throws IOException{
        Path fileName = Path.of("bracket-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksEmptyFile() throws IOException{
        Path fileName = Path.of("empty-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }*/

    @Test
    public void labReportSnippet1() throws IOException {
        Path filename = Path.of("lab-report-snippet1.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("`google.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void labReportSnippet2() throws IOException {
        Path filename = Path.of("lab-report-snippet2.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("a.com", "a.com(())", "example.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void labReportSnippet3() throws IOException {
        Path filename = Path.of("lab-report-snippet3.md");
        String contents = Files.readString(filename);
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"), MarkdownParse.getLinks(contents));
    }
}
