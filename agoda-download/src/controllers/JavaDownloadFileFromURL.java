package controllers;

import utils.ReadUrlSources;

public class JavaDownloadFileFromURL{

    public static void main(String[] args) {

        ReadUrlSources urlSourceReader = new ReadUrlSources();
        urlSourceReader.readUrlSourcesFromScanner();
        System.out.println("Download Complete for entered URLs..");
    }

}
