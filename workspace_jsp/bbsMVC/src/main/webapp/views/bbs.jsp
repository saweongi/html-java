<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.1.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/list.js/2.3.1/list.min.js"></script>
<meta charset="UTF-8">
<title>bbs</title>
<script>
$(document).ready(function(){
	let options = {
			valueNames:["bbsTitle", "authorId", "updateDt"],
			page:10,
			pagination : true
	};
	let userList =new List("bbs", options)
});
</script>
</head>
<body>
<jsp:include page="/WEB-INF/inc/top.jsp" />
<div class="container-fluid p-3">

		<div class="row">

			<div class="col-lg-1"></div>

			<div class="col-lg-10" id="bbs">
				<div class="input-group">
					<input type ="text" class="search form-control" placeholder="search">
					<button class="sort btn input-group-text" data-sort="bbsTitle">제목 </button>
				</div>

				<table class="table table-striped"

					style="text-align:center">

					<thead>

						<tr>

							<th>제목</th>

							<th>작성자</th>

							<th>작성일</th>

						</tr>

					</thead>

					<tbody class="list">
						<c:forEach var="vo" items="${arr}">
							<tr>
								<td class="bbsTitle">${vo.bbsTitle}</td>
								<td class="authorId">${vo.authorId}</td>
								<td class="updateDt">${vo.updateDt}</td>
							</tr>
						</c:forEach>

					</tbody>

				</table>
				<div class="de-flex justify-content-center">
				<ul class="pagination"></ul>
				</div>
			</div>

			<div class="col-lg-1">				
				<span id="sessionTime" style="display:none"></span>
			</div>

		</div>

	</div>
<jsp:include page="/WEB-INF/inc/footer.jsp" />
</body>
</html>