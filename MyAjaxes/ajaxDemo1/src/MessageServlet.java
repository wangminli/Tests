import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MessageServlet extends HttpServlet {

	public MessageServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		System.out.println("hello");
		PrintWriter out = response.getWriter();
		out.println("你好，我来自服务器(GET)。");
		out.flush();
		out.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		System.out.println("hello");
		PrintWriter out = response.getWriter();
		out.println("你好，我来自服务器(POST)");
		out.flush();
		out.close();
	}

}
