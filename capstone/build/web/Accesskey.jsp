<%@page import="java.sql.PreparedStatement"%>
<%@page import="DataBaseCon.DbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Towards</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
    </head>
<body id="top">
     <div class="wrapper row1">
  <header id="header" class="hoc clear"> 
    
      <div id="logo" style="align-content: center">
   <center>   <h3 style="font-family: Poppins-Regular;font-size: 24px; padding: 20px;"><a style="text-decoration: none; " href="index.html" >Fetch n Share</a></h3></center>
    </div>
  </header>
</div>
     
       <div class="wrapper row2" >
  <nav id="mainav" class="hoc clear"> 
    <ul class="clear" style="float: center">
      <li><a style="text-decoration: none;" href="AdminHome.jsp">Home</a></li>
      <li   class="active" ><a style="text-decoration: none;" href="Accesskey.jsp">Data Owner</a></li>
      <li><a style="text-decoration: none;" href="DUdetails.jsp">Data User</a></li>
      <li><a style="text-decoration: none;" href="Cfile.jsp">Cloud Files</a></li>
      <li><a style="text-decoration: none;" href="Admin.jsp">Logout</a></li>
      
    </ul>
  </nav>
</div>
       <div style="background-image: url(images/x.png); background-repeat:no-repeat; background-position:center; background-size:cover;"><br><br><br>
    <div>
        
              <div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100">
					<table >
						<thead>
							<tr class="table100-head">
								<th class="column1">Oid</th>
                                                                <th class="column2">Owner Name</th>
								<th class="column2">Email</th>
                                                                <th class="column5">Shared key</th>
                                                        </tr>
						</thead>
                                                 <%
			//String reqowner=(String)session.getAttribute("name");
			int fid=0,sid=0;
                        String name=null,fname=null,skey="Not Allocated";
ResultSet rs=null;

Connection con=null;
try
{
	 con = DbConnection.getConnection();
        String qry="select ownerId,name,email,sharedkey from ownerreg";
	PreparedStatement ps=con.prepareStatement(qry);

        rs =ps.executeQuery(qry);
	while(rs.next())
	{
        sid=rs.getInt("ownerId");
        name=rs.getString("name");
	fname=rs.getString("email");
	skey = rs.getString("sharedkey");
%>
<tbody>
<tr>
<td class="column1"><%=sid%></td>

<td class="column2"><%=name%></td>
<td class="column2"><%=fname%></td>
<td class="column2">
    <% if(skey.equalsIgnoreCase("Not Allocated")){
        %><a href="genrateAccesskey.jsp?sid=<%=sid%>">Generate Key</a> <%
    }else{
        out.println(skey);
    } %>
    </td>
 
</tr>
<%	  
}
}
 catch(Exception e1)
{
 e1.printStackTrace();
 }
 %>	
								
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>  
				
			</div>
         
          </center>
       <br> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
       </div>
  
    </div>
        <div class="wrapper row5">
  <div id="copyright" class="hoc clear"> 


  </div>
</div>
<a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>

<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
</body>
    </html>
