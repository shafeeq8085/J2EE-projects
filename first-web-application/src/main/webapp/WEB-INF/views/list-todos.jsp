<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<H1>Welcome ${name}</H1>
		
 		<div>Todos are</div>
 			
 			<table class="table table-striped">
 				<thead>
 					<th>Description</th>
 					<th>Category</th>
 					<th>Action</th>
 				</thead>
 				<tbody>
 					<shaf:forEach items="${Todos}" var="todo">
	 					<tr>
	 						<td>${todo.name}</td>
	 						<td>${todo.category}</td>
	 						<td>&nbsp;&nbsp;<a class="btn btn-danger" href="/Delete-Todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
	 					</tr>
 					</shaf:forEach>
 				</tbody>
 			</table>
 			<a class="btn btn-success" href="/Add-Todo.do">Add a New Todo</a>

		</div>

<%@ include file="../common/footer.jspf"%>