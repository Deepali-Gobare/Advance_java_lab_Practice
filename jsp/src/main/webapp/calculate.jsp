<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSPdemo</title>
</head>
<body>

<%! public int Factorial(int n){
	int f=1;
	for(int i=1;i<=n;i++){
	f=f*i;
	}
	return f;
}

%>
<%
   String btn=request.getParameter("btn");
if(btn.equals("add")){
	int n1=Integer.parseInt(request.getParameter("num1"));
	int n2=Integer.parseInt(request.getParameter("num2"));
	int addition=n1+n2;

%>
Addition:<%=addition %>
<%}else{
	int n1=Integer.parseInt(request.getParameter("num1"));
	int fact=Factorial(n1);
	

	%>
Factorial:<%=fact %>
<% }%>

</body>
</html>