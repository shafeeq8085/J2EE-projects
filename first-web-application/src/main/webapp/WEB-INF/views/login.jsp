<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<form action="/login.do" method="post">
			<div>
				Enter name: <input type="text" name="name">
			</div>
			<div>
				Enter password: <input type="password" name="password">
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>
			<p>
				<font color="red">${errorMessage}</font>
			</p>
		</form>
	</div>

<%@ include file="../common/footer.jspf"%>