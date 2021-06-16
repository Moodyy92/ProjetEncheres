<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="WEB-INF/jsp/parts/header.jsp">
		<jsp:param name="title" value="Index"/>
	</jsp:include>
</head>
<body>
	<jsp:include page="WEB-INF/jsp/menuNavbar.jsp">
		<jsp:param name="monCul" value=" "/>
    </jsp:include>
    
    <jsp:include page="WEB-INF/jsp/entete.jsp">
 		<jsp:param name="maVar" value="Liste des encheres"/>
    </jsp:include>
</body>
</html>