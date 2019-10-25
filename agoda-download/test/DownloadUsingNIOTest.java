import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import utils.DownloadUsingNIO;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DownloadUsingNIOTest {

    @Test
    @DisplayName("DownloadUsingNIO test")
    public void testDownloadUsingNIOTest() throws IOException {

        DownloadUsingNIO downloadNIO = new DownloadUsingNIO();
        String url = "https://stackoverflow.com/questions/13883277/stanford-parser-and-nltk";
        String file = "stanford-parser-and-nltk";
        DownloadUsingNIO spy = Mockito.spy(downloadNIO);
        Mockito.doReturn(downloadNIO).when(spy).downloadUsingNIO(url,"stanford-parser-and-nltk");

        assertEquals("stanford-parser-and-nltk", file);
    }
}
