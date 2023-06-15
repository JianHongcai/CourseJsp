<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>update Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								2009/11/20
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						更新员工信息:
					</h1>
					<form action="${pageContext.request.contextPath}/edu/course/update" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									ID:
								</td>
								<td valign="middle" align="left">
									<input value="${course.id}" type="text" class="inputgri" name="id" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									课程号:
								</td>
								<td valign="middle" align="left">
									<input value="${course.courseCno}" type="text" class="inputgri" name="courseCno" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									课程名称:
								</td>
								<td valign="middle" align="left">
									<input value="${course.courseName}" type="text" class="inputgri" name="courseName" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									创建时间:
								</td>
								<td valign="middle" align="left">
									<input  value="<fmt:formatDate value="${course.createTime}" pattern="yyyy/MM/dd"/>" type="text" class="inputgri" name="createTime" />
								</td>
							</tr>

						</table>
						<p>
							<input type="submit" class="button" value="提交" />
							<a class="button" href="${pageContext.request.contextPath}/edu/course/list">返回</a>
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
