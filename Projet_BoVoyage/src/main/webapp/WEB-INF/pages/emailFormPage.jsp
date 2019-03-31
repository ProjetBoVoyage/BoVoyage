<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Ajouter la lib de jstl -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC Email Example</title>
        <style type="text/css">
            #sendEmailBtn {
                float: left;
                margin-top: 22px;
            }
        </style>
    </head>
 
    <body>
      
            <h2>Spring MVC Email Example</h2>
            <form:form id="sendEmailForm" method="post" action="sendMail" enctype="multipart/form-data">
            <div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">Your name: </label>
			<div class="col-sm-5">
				<input class="form-control" id="name" type="text" name="name" size="65" required="required"/>
		</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="mail" class="col-sm-2 control-label">Your email: </label>
			<div class="col-sm-5">
				<input class="form-control" id="mail" type="text" name="mail" size="65" required="required"/>
		</div>
		</div>
				<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="telephone" class="col-sm-2 control-label">Your phone number (optional): </label>
			<div class="col-sm-5">
				<input class="form-control" id="telephone" type="text" name="telephone" size="65"/>
		</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="mailSubject" class="col-sm-2 control-label">Subject: </label>
			<div class="col-sm-5">
				<select id="mailSubject" name="subject">
					<option value="Remarks and suggestions">Remarks and suggestions</option>
					<option value="Report a problem on the website">Report a problem on the website</option>
					<option value="Change my file">Change my file</option>
					<option value="Confirm my reservation">Confirm my reservation</option>
					<option value="Information request">Information request</option>
					<option value="Booking assistance">Booking assistance</option>
					<option value="Complaints">Complaints</option>
				</select>
			</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<label for="mailMessage" class="col-sm-2 control-label">Message: </label>
			<div class="col-sm-5">
                        <textarea id="mailMessage" cols="50" rows="10" name="message"></textarea>

			</div>
		</div>
		<div class="col-sm-6 col-md-1"></div>
		<div class="form-group">
			<div class="col-sm-offset-4 col-sm-10">
				<button type="submit" class="btn btn-primary">Send Email</button>
			</div>
		</div>
	</form:form>
        
    </body>
</html>