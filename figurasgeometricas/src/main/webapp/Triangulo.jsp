<!DOCTYPE html>
<html lang="es-co">
<head>
    <link rel="stylesheet" href="./assets/Css/StyleTri.css">
    <link rel="shortcut icon" href="./assets/Imagenes/Triangulo.jpg" type="image/x-icon">
    <title>Triangulo</title>
</head>
<body>
    <h1 align ="center"><b>TRIANGULO</b></h1>
        <br>
        <nav class="barra navegacion" align="center">
            <a href="index.jsp"><b>INICIO|</b></a>
            <a href="Decagono.jsp"><b>DECAGONO   |</b></a>
            <a href="Trapecio.jsp"><b>TRAPECIO ISOSCELES   |</b></a>
        </nav>
        <br>
        <div class="centrar-imagen">
            <img src="./Imagenes/Triangulo.jpg" alt="Triangulo" width="450" height="250"> 
        </div>
        <form class="Triangulo" align="center">
            <p>Ingresa el valor de uno de los lados de la figura:</p>
            <label>Lado:</label>
            <input type="text" name="lado">
            <br>
            <input type="submit" value="Calcular">  
            <input type="reset" value="Eliminar">
            <br>
            <br>
            <label>Area:</label>
            <input type="text" name="area">
            <output type="text"></output>
            <br>
            <br>
            <label>Perimetro</label>
            <input type="text" name="perimetro">
            <output type="text"></output>
        </form>
        
</body>
</html>