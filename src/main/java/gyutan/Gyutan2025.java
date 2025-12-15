package gyutan;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import apiClass.GetClu;

@WebServlet("/tan")
public class Gyutan2025 extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public Gyutan2025() {
    	super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	response.getWriter().println("doGet method");}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // ★ 文字化け対策
        request.setCharacterEncoding("UTF-8");

        // ★ パラメータ取得
        String param = request.getParameter("param");
        if (Objects.isNull(param)) {
            param = "";
        }

        // ★ CLU で分類
        String detected = GetClu.getLanguageText(param);

        // ★ 遷移先ページ
        String nextPage;

        switch (detected.toUpperCase()) {

            case "ABOUT":
                nextPage = "/about.jsp";
                break;

            case "MENU":
                nextPage = "/menu.jsp";
                break;

            case "SHOP":
                nextPage = "/shop.jsp";
                break;

            case "HISTORY":
                nextPage = "/history.jsp";
                break;

            default:
                request.setAttribute("msg", "キーワードを理解できませんでした");
                nextPage = "/index.html";
                break;
        }

        // ★ forward（これがないと遷移しない）
        request.getRequestDispatcher(nextPage).forward(request, response);
    


    }
}
