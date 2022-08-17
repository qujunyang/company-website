package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orm.sqltest;

/**
 * Servlet implementation class gonggao
 */
@WebServlet("/gonggao")
public class gonggao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gonggao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String a = request.getParameter("name");
		//System.out.println(a);
		sqltest sql = new sqltest();
		String str = sql.sqlgonggao(a);
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.getWriter().write("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<meta charset=\"UTF-8\">\r\n" + 
				"		<title></title>\r\n" + 
				"		<style type=\"text/css\">\r\n" + 
				"\r\n" + 
				" \r\n" + 
				"/* 弹窗背景 */\r\n" + 
				".modal {\r\n" + 
				"    //display: none; /* Hidden by default */\r\n" + 
				"    position: fixed; /* Stay in place */\r\n" + 
				"    z-index: 1; /* Sit on top */\r\n" + 
				"    padding-top: 100px; /* Location of the box */\r\n" + 
				"    left: 0;\r\n" + 
				"    top: 0;\r\n" + 
				"    width: 100%; /* Full width */\r\n" + 
				"    height: 100%; /* Full height */\r\n" + 
				"    overflow: auto; /* Enable scroll if needed */\r\n" + 
				"    background-color: rgb(0,0,0); /* Fallback color */\r\n" + 
				"    background-color: rgba(0,0,0,0.9); /* Black w/ opacity */\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"/* 图片 */\r\n" + 
				".modal-content {\r\n" + 
				"    margin: auto;\r\n" + 
				"    display: block;\r\n" + 
				"    width: 80%;\r\n" + 
				"    max-width: 700px;\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"/* 文本内容 */\r\n" + 
				"#caption {\r\n" + 
				"    margin: auto;\r\n" + 
				"    display: block;\r\n" + 
				"    width: 80%;\r\n" + 
				"    max-width: 700px;\r\n" + 
				"    text-align: center;\r\n" + 
				"    color: #ccc;\r\n" + 
				"    padding: 10px 0;\r\n" + 
				"    height: 150px;\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"/* 添加动画 */\r\n" + 
				".modal-content, #caption { \r\n" + 
				"    -webkit-animation-name: zoom;\r\n" + 
				"    -webkit-animation-duration: 0.6s;\r\n" + 
				"    animation-name: zoom;\r\n" + 
				"    animation-duration: 0.6s;\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"@-webkit-keyframes zoom {\r\n" + 
				"    from {-webkit-transform:scale(0)} \r\n" + 
				"    to {-webkit-transform:scale(1)}\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"@keyframes zoom {\r\n" + 
				"    from {transform:scale(0)} \r\n" + 
				"    to {transform:scale(1)}\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"/* 关闭按钮 */\r\n" + 
				".close {\r\n" + 
				"    position: absolute;\r\n" + 
				"    top: 15px;\r\n" + 
				"    right: 35px;\r\n" + 
				"    color: #f1f1f1;\r\n" + 
				"    font-size: 40px;\r\n" + 
				"    font-weight: bold;\r\n" + 
				"    transition: 0.3s;\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				".close:hover,\r\n" + 
				".close:focus {\r\n" + 
				"    color: #bbb;\r\n" + 
				"    text-decoration: none;\r\n" + 
				"    cursor: pointer;\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"/* 小屏幕中图片宽度为 100% */\r\n" + 
				"@media only screen and (max-width: 700px){\r\n" + 
				"    .modal-content {\r\n" + 
				"        width: 100%;\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<!-- 弹窗 -->\r\n" + 
				"<div id=\"myModal\" class=\"modal\">\r\n" + 
				" \r\n" + 
				"  <!-- 关闭按钮 -->\r\n" + 
				"  <span class=\"close\" onclick=\"history.back()\">&times;</span>\r\n" + 
				" \r\n" + 
				//"  <!-- 弹窗内容 -->\r\n" + 
				//"  <img class=\"modal-content\" src=\""+ a +"\" id=\"img01\">\r\n" + 
				//" \r\n" + 
				"  <!-- 文本描述 -->\r\n" + 
				"  <div id=\"caption\">"+str+"</div>\r\n" + 
				"</div>\r\n" + 
				"	</body>\r\n" + 
				"</html>\r\n" + 
				"");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
