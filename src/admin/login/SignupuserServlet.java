package admin.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubjectManagementServlet
 */
@WebServlet("/signupuser")
public class SignupuserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupuserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher= request.getRequestDispatcher("/userregistration.jsp");
		dispatcher.forward(request, response);
	}

	private Signupuser signupuser;
	public void init() {
		signupuser = new Signupuser();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("userid");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String emailid = request.getParameter("emailid");
		String contactno = request.getParameter("contactno");
		String password = request.getParameter("password");

		
		signup_user user = new signup_user();
		user.setUserid(userid);
	    user.setPassword(password);
	    user.setFname(fname);
	    user.setLname(lname);
	    user.setEmailid(emailid);
	    user.setContactno(contactno);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
		
		try {
			signupuser.registerUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/signupsuccess.jsp");
		dispatcher.forward(request, response);
		
	}

}
