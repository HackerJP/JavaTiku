<%@page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>��¼�ж�ҳ��</title>
	</head>
	
	<body>
		<c:choose>
			<%--����û�������û�����root����Ϊ�Ϸ��û��� --%>
			<c:when test="${param.username =='root' }">
				<%--�ж��û������Ƿ�Ϸ����Ϸ���ֱ����ת����¼�ɹ�ҳ�� --%>
				<c:if test="${param.upassword =='admin' }">
					<jsp:forward page="test.html"></jsp:forward>
				</c:if>
				<jsp:forward page="loginFailure.jsp"></jsp:forward>
			</c:when>
			<%--����û�������û�������root����Ϊ�Ƿ��û�����ֱ����ת����½ʧ��ҳ�� --%>
			<c:otherwise>
				<jsp:forward page="loginFailure.jsp"></jsp:forward>
			</c:otherwise>
		</c:choose>
	</body>
</html>