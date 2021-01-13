<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Create an account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">

    <form:form method="POST" modelAttribute="userForm" class="form-signin">
        <h2 class="form-signin-heading">EZY PAYMENT ACCOUNT</h2>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="Invoice Amount" class="form-control" placeholder="InvoiceAmount"
                            autofocus="true"></form:input>
                <form:errors path="Invoice Amount"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="SubscriptionType" path="SubscriptionType" class="form-control" placeholder="SubscriptionType"></form:input>
                <form:errors path="SubscriptionType"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="InvoiceDate">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="InvoiceDate" path="InvoiceDate" class="form-control"
                            placeholder="InvoiceDate"></form:input>
                <form:errors path="InvoiceDate"></form:errors>
            </div>
        </spring:bind>

      <spring:bind path="StartDateDuration">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="StartDateDuration" path="StartDateDuration" class="form-control"
                            placeholder="StartDateDuration"></form:input>
                <form:errors path="StartDateDuration"></form:errors>
            </div>
        </spring:bind>

      <spring:bind path="EndDateDuration">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="EndDateDuration" path="InvoiceDate" class="form-control"
                            placeholder="EndDateDuration"></form:input>
                <form:errors path="EndDateDuration"></form:errors>
            </div>
        </spring:bind>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>