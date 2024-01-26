package web_basic.view.ch11;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class UseRequestServlet1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {

		//リクエストスコープへの登録
		req.setAttribute("bookTitle", "JSP/サーブレットの本");
		req.getRequestDispatcher("/view/ch11/useRequest1.jsp").forward(req, resp);
	}
}

