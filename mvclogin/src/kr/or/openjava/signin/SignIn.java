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
		id = (id == null) ? "" : id; // �Ķ���� nulló��
		String pw = request.getParameter("pw");
		pw = (pw == null) ? "" : pw; // �Ķ���� nulló��
		
		String url = "main.jsp";
		
		if( !checkId.equals(id)  ) {
			// ���̵� Ʋ�����
			url = "idNotFound.jsp";
		} else {
			// ���̵� ��ġ
			if( !checkPw.equals(pw) ) {
				// �н����� ����ġ
				url = "passwordNotMatch.jsp";
			} else {				
				// main.jsp�� ������ ����
				// ���߿� DB���� ó����
				UserInfo user = new UserInfo("�̰���", "����", "arduino", "ard1234");
				request.setAttribute("user", user );
				
				// List ����
				// ���߿� DB���� ó����
				List <UserInfo> userList = new ArrayList<UserInfo>();
				userList.add(user);
				user = new UserInfo("�̰���", "����", "arduino", "ard1234");
				userList.add(user);
				user = new UserInfo("�̰��", "����", "arduino", "ard1234");
				userList.add(user);
				user = new UserInfo("�̰��", "����", "arduino", "ard1234");
				userList.add(user);
				user = new UserInfo("�̰��", "����", "arduino", "ard1234");
				userList.add(user);
				request.setAttribute("userList", userList );
			}
		}
    	
		// jsp���Ϸ� �̵�
    	RequestDispatcher dispatcher = request.getRequestDispatcher( url );
    	
    	
    	dispatcher.forward(request, response);
	}

}
