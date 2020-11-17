<%
    String Username=request.getParameter("Username");
    String pswd=request.getParameter("Password");
  
    if(Username.equals("admin")&pswd.equals("admin")){
    response.sendRedirect("AdminHome.jsp?msg=sucess");
    }else{
    response.sendRedirect("Admin.jsp?msg=failure");
    }
%>