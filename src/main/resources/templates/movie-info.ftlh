<#-- @ftlvariable name="movie.id" type="java.lang.Long" -->
<#-- @ftlvariable name="movie.year" type="java.lang.Integer" -->
<#-- @ftlvariable name="movie.city" type="java.lang.String" -->
<#-- @ftlvariable name="movie.rating" type="java.lang.Long" -->
<#-- @ftlvariable name="movie.description" type="java.lang.String" -->
<#-- @ftlvariable name="movie.title" type="java.lang.String" -->
<!DOCTYPE html>
<html>
<head>
    <title>BATFLIX V2.0</title>
</head>
<body>
<h1>BATFLIX</h1>
<hr>
<h4>More info about movie</h4>

<b>Movie title: </b>${movie.title}<br>
<b>Movie description: </b>${movie.description}<br>
<b>Movie rating: </b>${movie.rating}<br>
<b>Movie city: </b>${movie.city}<br>
<b>Movie year: </b>${movie.year}<br>
<hr>

<form action="/movie/delete/${movie.id}" method="post">
    <input type="Submit" value="Delete movie"/>
</form>
</body>
</html>