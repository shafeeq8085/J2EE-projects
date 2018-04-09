<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
			Your New Action Item:	
 			<form action="/Add-Todo.do" method="post">
 				<fieldset class="form-group">
 					<label>Description:</label> 
 					<input type="text" name="todo" class="form-control"/> <BR/>
 				</fieldset>
 				<fieldset class="form-group">
 					<label>Category   :</label>
 					<input type="text" name="category" class="form-control"/> <BR/>
 				</fieldset>
 					<input type="submit" value="Submit" class="btn btn-success"/>
 			</form>
	</div>

<%@ include file="../common/footer.jspf"%>