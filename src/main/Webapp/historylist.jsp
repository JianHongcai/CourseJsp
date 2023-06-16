<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2023/10/15
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                课程列表
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        课程编号
                    </td>
                    <td>
                        课程名称
                    </td>
                    <td>
                        教师姓名
                    </td>

                    <td>
                        选课时间
                    </td>
                    <td>
                        删除
                    </td>
                </tr>
                <c:forEach items="${requestScope.hislist}" var="his">
                    <tr class="row1">
                        <td>${his.id}</td>
                        <td>${his.courseCno}</td>
                        <td>${his.courseName}</td>
                        <td>${his.name}</td>
                        <td><fmt:formatDate value="${his.createTime}" pattern="yyyy-MM-dd"/></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/edu/courseStudyhistory/delete?id=${his.id}">删除</a>&nbsp;

                        </td>
                    </tr>
                </c:forEach>

            </table>
            <p>
                <a href="${pageContext.request.contextPath}/edu/course/list">返回</a>

            </p>
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
