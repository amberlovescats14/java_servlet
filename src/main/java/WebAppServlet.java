import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//localhost:8080/webapp
@WebServlet(name = "WebAppServlet", urlPatterns = "/")public class WebAppServlet extends HttpServlet {

    //GET doGet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, World!</h1>");

//        req.getRequestDispatcher("index.jsp").forward(req, res);
    }

    //POST  doPost
}
