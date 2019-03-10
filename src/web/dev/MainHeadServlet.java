package web.dev;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainHeadServlet
 */
@WebServlet("/mainhead")
public class MainHeadServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainHeadServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 	PrintWriter out = response.getWriter();
		 	
		 	
		 	
		 	String firnum = request.getParameter("first_num");
		 	String secnum = request.getParameter("second_num");
		 	
		 	int f1 = 0, f2=0;
		 	
		 	if (firnum != null)
		 		f1 = Integer.parseInt(firnum);
		 	if (secnum != null)
		 		f2 = Integer.parseInt(secnum);
		 	
		 		Calc c1= new Calc();
		 	
		 		int z= c1.addNum(f1, f2);
		 	 
		    String str= "<h2> Hello Total is  "+z+" </h2> "+new Date().toString();
		    
		    out.println(str);
		    
		    String[] list = c1.getListDemo();
		    
		    for (int i =0; i< list.length; i++)
		    {
		    	out.print(" <h1> "+list[i]);
		    }
		    
		    out.close();
		    
	}

}
