<html>
<head>
    <title>AAAA</title>
    <script src="${request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        .pageDetail {
            display: none;
        }

        .show {
            display: table-row;
        }
    </style>
</head>
<body>

<form action="${request.contextPath}/book/savebook" method="post">
	<table class="gridtable" style="width:800px;">
	<input type="hidden" name="bookId" value="${book.bookId}">
		<tr>
			<td>书籍名称</td>
			<td><input type="text" name="bookName" value="${book.bookName}"></td>
		</tr>
		<tr>
			<td>书籍类型</td>
			<td>
			<select name="bookType">
			<option value="">请选择
			<option value="1"
			<#if book.bookType==1>selected</#if>
			>言情
			<option value="2"
			<#if book.bookType==2>selected</#if>
			>童话
			<option value="3"
			<#if book.bookType==3>selected</#if>
			>惊悚
			</select>
			</td>
		</tr>
		<tr>
			<td>书籍数量</td>
			<td><input type="number" name="bookNumber" value="${book.bookNumber}"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="保存" ></td>
		</tr>
		
	</table>
</form>
<script type="text/javascript">
			
</script>
</body>
</html>