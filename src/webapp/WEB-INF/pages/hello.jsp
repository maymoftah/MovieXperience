
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Tourist list</h2>
<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Genre</th>
        <th>Release Year</th>
    </tr>
    <thead>
    <tbody>
    <c:forEach var="movie" items="${list}">
    <tr>
        <td>${movie.title}</td>
        <td>${movie.genre}</td>
        <td>${movie.year}</td>
    <tr>
        </c:forEach>
    </tbody>
</table>