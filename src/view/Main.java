package view;

import proxy.FileDownloaderProxy;

public class Main {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        String url = "https://www.google.com";
        String path = "C:\\Users\\admin\\OneDrive\\Desktop";

        fileDownloaderProxy.download(url, path);
    }
}
