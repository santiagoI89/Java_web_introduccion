<html lang="es-co">
<head>
    <link rel="stylesheet" href="./assets/Css/StyleDeca.css">
    <link rel="shortcut icon" href="./assets/Imagenes/Decagono.jpg" type="image/x-icon">
    <title>Decagono</title>
</head>
<body>
    <h1 align ="center"><b>DECAGONO</b></h1>
        <br>
        <nav class="barra navegacion" align="center">
            <a href="index.jsp"><b>INICIO|</b></a>
            <a href="Triangulo.jsp"><b>TRIANGULO   |</b></a>
            <a href="Trapecio.jsp"><b>TRAPECIO ISOSCELES   |</b></a>
        </nav>
        <br>
        <div class="centrar-imagen">
            <img src="./assets/Imagenes/Decagono.jpg" alt="Decagono" width="450" height="350"> 
        </div>
        <form class="Decagono" align="center">
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