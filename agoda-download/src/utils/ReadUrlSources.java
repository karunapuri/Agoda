package utils;

import models.SourceReader;

import java.io.IOException;
import java.util.Scanner;

public class ReadUrlSources implements SourceReader {

    public void readUrlSourcesFromScanner(){
    try {
        System.out.println("Input List of URL Sources to download data: "+"\n");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String inputData = sc.nextLine();
        String[] data = inputData.split(",");

        int i =0;
        while (i<data.length)
        {
            String url = data[i];
            System.out.println("Currently Download in progress for URL source: "+data[i]);
            String fileNameWithExtn = url.substring( url.lastIndexOf('/')+1, url.length() );
            DownloadUsingNIO.downloadUsingNIO(url, "/Users/kpn6677/"+fileNameWithExtn);
            DownloadUsingStreams.downloadUsingStream(url, "/Users/kpn6677/"+fileNameWithExtn+" _stream");
            i++;
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
