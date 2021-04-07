import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TilfoejEmne", value = "/TilfoejEmne")
public class TilfoejEmne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                    PrintWriter out = response.getWriter();


                    String emne = request.getParameter("emne");

                    HttpSession session = request.getSession();


//

        List<String> emneListe = (List<String>) session.getAttribute("emneListe");

        if (emneListe == null ) {    // der her sker kun første gang vi forbi

            emneListe = new ArrayList<>();

        }

        emneListe.add(emne);

        int emneListeSize = emneListe.size();

        session.setAttribute("emneListe", emneListe);
        session.setAttribute("emneListeSize", emneListeSize);

        request.getRequestDispatcher("/WEB-INF/Bruger.jsp").forward(request,response);


    }
}
