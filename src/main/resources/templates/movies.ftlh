<#-- @ftlvariable name="movies" type="String" -->
<!DOCTYPE html>
<html>
<head>
    <title>BATFLIX V2.0</title>
</head>
<body>
<h1>BATFLIX</h1>
<hr>
<h4>Movies from all the World</h4>
<form action="/" method="get">
    Search by title: <input type="text" name="title"><br>
    <input type="submit" value="Search"/>
</form>
<#list movies as movie>
    <div>
        <p><b>${movie.title}:</b>${movie.year} | <a href="/movie/${movie.id}">More Information...</a></p>
    </div>
    <#else>
    <h3> Movies not found</h3>
</#list>
<hr>
<h3>Add new movie</h3>
<form action="/movie/add" method="post">
    Movie title: <input type="text" name="title"/><br><br>
    Movie description : <input type="text" name="description"/><br><br>
    Movie rating : <input type="number" name="rating"/><br><br>
    Movie city : <input type="text" name="city"/><br><br>
    Movie year : <input type="number" name="year"/><br><br>
    <input type="Submit" value="Add new movie"/>
</form>
</body>
</html>