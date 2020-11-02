<%--
  Created by IntelliJ IDEA.
  User: X1 Carbon
  Date: 02/11/2020
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form action="/caculator" method="post">
    <h1>Simple Caculator</h1>
    <feildset>
        <legend>Caculator</legend>
        <table>
            <tr>
                <td>
                    <label >First operand: </label>
                </td>
                <td>
                    <input type="text" name="firstOperand" placeholder="321">
                </td>
            </tr>
            <tr>
                <td>
                    <label >Operato: </label>
                </td>
                <td>
                    <select name="operator" >
                        <option value="Addition">Addition</option>
                        <option value="Subtraction">Subtraction</option>
                        <option value="Multiplication">Multiplication</option>
                        <option value="Division">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <label >Second operand: </label>
                </td>
                <td>
                    <input type="text" name="secondOperand" placeholder="123">
                </td>
            </tr>
            <tr>
                <td> </td>
                <td><input type="submit" value="Caculate"> </td>
            </tr>
        </table>


    </feildset>
</form>
</body>
</html>
