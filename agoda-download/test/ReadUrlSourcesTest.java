import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadUrlSourcesTest {

    @Test
    @DisplayName("ReadUrlSources test")
    public void testReadUrlSources() throws IOException {

        URL url = new URL("ftp://webftp.vancouver.ca/OpenData/csv/schools.csv");
        assertEquals("ftp", url.getProtocol());

        String urlFileName = "https://docs.oracle.com/cd/E41633_01/pt853pbh1/eng/pt/tiba/" +
                "task_Example8_UsingTheSFTPTargetConnector.html";
        String fileNameWithExtn = urlFileName.substring( urlFileName.lastIndexOf('/')+1, urlFileName.length() );
        assertEquals("task_Example8_UsingTheSFTPTargetConnector.html", fileNameWithExtn);

        String streamUrl = "ftp://webftp.vancouver.ca/OpenData/csv/schools.csv";
        String fileNameForStreamDownload = streamUrl.substring( streamUrl.lastIndexOf('/')+1, streamUrl.length() )+" _stream";
        assertEquals(fileNameForStreamDownload, "schools.csv _stream");

        URL urlQueryParam = new URL("https://materials.springer.com/?ok#header");
        assertEquals("ok", urlQueryParam.getQuery());

        URL urlPort = new URL("https://www.example.com/");
        assertEquals(-1, urlPort.getPort());

    }

}
