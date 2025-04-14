<!DOCTYPE html>
<html>
<head>
    <title>Book Details</title>
</head>
<body>

    <h3>Book Details</h3>

    <form action="book" method="get">
        Book Id: <input type="text" name="id" />
        <input type="submit" value="Search" />
    </form>

    <hr/>

    <p>Book Id: ${book.bookId}</p>
    <p>Book Name: ${book.bookName}</p>
    <p>Book Price: ${book.bookPrice}</p>

</body>
</html>
>