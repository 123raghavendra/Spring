<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save"  method="get">
${message}
${error}


<input type="text" name="ownearName"/>
 <input type="submit" value="search"/>
</form>

</body>
</html>