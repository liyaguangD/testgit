
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
    
    <script>
        $(function () {
            $('#list').click(function () {
                $('.pageDetail').toggleClass('show');
            });
        });

    </script>
</head>
<body>
<a href="${request.contextPath}/book/addbook">新增</a>
	<form id="bookTable">
		<table  class="gridtable" style="width:100%;" border="1">
					<td>书籍ID</td>
					<td>书籍名称</td>
					<td>书籍类型</td>
					<td>书籍数量</td>
					<td>操作</td>
		  <#list list as emp>
                <tr>
                    <td>${emp.bookId}</td>
                    <td>${emp.bookName}</td>
                    <td>
                    
                    <#if emp.bookType==1>
                    	言情
                    </#if>
                     <#if emp.bookType==2>
                    	童话
                    </#if>
                     <#if emp.bookType==3>
                    	惊悚
                    </#if>
                    </td>
                    <td>${emp.bookNumber}</td>
                    <td>
                    <a href="${request.contextPath}/book/deletebookById/${emp.bookId}">删除</a>
                    <a href="${request.contextPath}/book/books/${emp.bookId}">修改</a>
                    </td>
                </tr>
                </#list>
		</table>
		</form>
<script type="text/javascript">
			function addBook(){
				location.href="../book/addbook.ftl"
			}		
</script>
</body>
</html>