import utils.DownloadUsingNIO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadSource extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        String inputData = req.getParameter("url");
        String[] data = inputData.split(",");
        int i = 0;
        while (i < data.length) {
            String url = data[i];
            String fileNameWithExtn = url.substring(url.lastIndexOf('/') + 1, url.length());
            DownloadUsingNIO.downloadUsingNIO(url, "/Users/kpn6677/" + fileNameWithExtn);
            i++;

            pw.println("Download Complete for entered URLs..");
            pw.close();

        }
    }
}
