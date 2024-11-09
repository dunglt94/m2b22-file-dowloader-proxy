package proxy;

public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;
    public FileDownloaderProxy() {
        String firefoxUserAgent = "Mozilla Firefox";
        this.fileDownloader = new FileDownloader(firefoxUserAgent);
    }
    @Override
    public void download(String url, String path) {
        fileDownloader.download(url, path);
    }
}
