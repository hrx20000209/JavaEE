import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ThreeParams", value = "/ThreeParams")
public class ThreeParams extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=GB2312");
        PrintWriter out = response.getWriter();
        String title = "Reading three Request Parameters";
        request.setCharacterEncoding("GBK");
        out.println("<body>\n" +
                        "<h1 align=center>" + title + "</h1>\n" +
                        "<ul>\n" +
                        "<li><b>First Parameter:</b>\n" +
                        request.getParameter("firstParameter") + "\n" +
                        "<li><b>Second Parameter:</b>\n" +
                        request.getParameter("secondParameter") + "\n" +
                        "<li><b>Third Parameter:</b>\n" +
                        request.getParameter("thirdParameter") + "\n" +
                        "</ul>\n" +
                    "</body></html>"
        );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
