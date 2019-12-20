package kr.or.openjava.signin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.openjava.signin.dto.UserInfo;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/signIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request
							, HttpServletResponse response
						) throws ServletException, IOException {
		String checkId = "arduino";
		String checkPw = "ard1234";
		String id = request.getParameter("id");
		id = (id == null) ? "" : id; // 파라미터 null처리
		String pw = request.getParameter("pw");
		pw = (pw == null) ? "" : pw; // 파라미터 null처리
		
		String url = "main.jsp";
		
		if( !checkId.equals(id)  ) {
			// 아이디가 틀린경우
			url = "idNotFound.jsp";
		} else {
			// 아이디 일치
			if( !checkPw.equals(pw) ) {
				// 패스워드 불일치
				url = "passwordNotMatch.jsp";
			} else {				
				// main.jsp에 데이터 전달
				// 나중에 DB에서 처리됨
				UserInfo user = new UserInfo("이경일", "서울", "arduino", "ard1234");
				request.setAttribute("user", user );
				
				// List 전달
				// 나중에 DB에서 처리됨
				List <UserInfo> userList = new ArrayList<UserInfo>();
				userList.add(user);
				user = new UserInfo("이경이", "서울", "arduino", "ard1234");
				userList.add(user);
				user = new UserInfo("이경삼", "서울", "arduino", "ard1234");
				userList.add(user);
				user = new UserInfo("이경사", "서울", "arduino", "ard1234");
				userList.add(user);
				user = new UserInfo("이경오", "서울", "arduino", "ard1234");
				userList.add(user);
				request.setAttribute("userList", userList );
			}
		}
    	
		// jsp파일로 이동
    	RequestDispatcher dispatcher = request.getRequestDispatcher( url );
    	
    	
    	dispatcher.forward(request, response);
	}

}
