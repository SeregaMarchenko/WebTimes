package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.ZoneId;

@WebServlet("/beijing")
public class BeijingTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("Beijing time " + LocalTime.now(ZoneId.of("Asia/Shanghai")));
        writer.close();
    }
}
