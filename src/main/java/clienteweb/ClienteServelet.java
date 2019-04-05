package clienteweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet responsavel por receber requisicoes do cliente
 * 
 * @author Lucas Lima
 */
@WebServlet(urlPatterns = {"/cliente", "/clienteController"})
public class ClienteServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * A bilitando o metodo get na rota de clientes
	 * 
	 * @author Lucas Lima
	 * @param Object req
	 * @param Object resp
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método GET");
	}
	
	/**
	 * Abilitando o metodo post na rota de clientes
	 * 
	 * @author Lucas Lima
	 * @param Object req
	 * @param Object resp
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método POST");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método DELETE");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método PUT");
	}
}
