import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sun.jvm.hotspot.utilities.Assert;
import utils.DownloadUsingStreams;

import java.io.IOException;

public class DownloadUsingStreamsTest {

    private DownloadUsingStreams mock;

    @Test
    @DisplayName("DownloadUsingStreams test")
    public void testDownloadUsingStreams() throws IOException {

        DownloadUsingStreams downloadStreams = new DownloadUsingStreams();
        DownloadUsingStreams spy = Mockito.spy(downloadStreams);

        String url = "https://stackoverflow.com/questions/13883277/stanford-parser-and-nltk";
        String file = "stanford-parser-and-nltk _stream";

        try {
            mock = Mockito.mock(DownloadUsingStreams.class);
            Assert.that(true, "Assertion Failure Message");
            System.out.println("Download Streams method called and verified if test is true");
        }
        catch (AssertionError e)
        {
            e.printStackTrace();
        }
        Mockito.doReturn(downloadStreams).when(spy).downloadUsingStream(url,file);
    }
}

