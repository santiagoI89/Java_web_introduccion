<html lang="es-co">
<head>
    <link rel="stylesheet" href="./assets/Css/StyleTrapecio.css">
    <link rel="shortcut icon" href="./assets/Imagenes/Trapecio.jpg" type="image/x-icon">
    <title>Trapecio</title>
</head>
<body>
    <h1 align ="center"><b>TRAPECIO</b>></h1>
        <br>
        <nav class="barra navegacion" align="center">
            <a href="index.jsp"><b>INICIO|</b></a>
            <a href="Decagono.jsp"><b>DECAGONO   |</b></a>
            <a href="Triangulo.jsp"><b>TRIANGULO   |</b></a>
        </nav>
        <br>
        <div class="centrar-imagen">
            <img src="./assets/Imagenes/Trapecio.jpg" alt="Trapecio" width="450" height="300"> 
        </div>
        <form class="Trapecio" align="center">
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