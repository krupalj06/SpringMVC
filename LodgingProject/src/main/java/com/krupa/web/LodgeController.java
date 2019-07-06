package com.krupa.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LodgeController
 */
public class LodgeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LodgeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int roomId = Integer.parseInt(request.getParameter("roomId"));
		System.out.println(roomId);
		
		LodgeDao dao = new LodgeDao();
		Lodge log =dao.getLodgeDetail(roomId);
		
		request.setAttribute("log", log);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowLodgeDetails.jsp");
		rd.forward(request, response);
		
	}


}
