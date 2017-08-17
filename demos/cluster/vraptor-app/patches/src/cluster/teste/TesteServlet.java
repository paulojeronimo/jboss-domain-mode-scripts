import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

// TODO

public class TesteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		System.out.println("ID:" + session.getId());
		String att = (String) session.getAttribute("TESTE");
		if (att != null) {
			System.out.println("Esta aqui: " + att);
		} else {
			System.out.println("Não está na sessão. ");
			session.setAttribute("TESTE", "ATT : " + new Date());
		}
	}
}
