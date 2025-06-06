<?php
/*
    En este archivo encontraras la sintexis de php
    Declaración variables, constantes y globales
    Los tipos de datos
    Operadores
    Tipados

*/
?>



<?php
    //Sintaxis de la estructura php
    echo "Hola mundoooo!"; //Imprime varios elementos
    print "Hola mundo2!"; //Imprime sólo un elemento
?>

<!DOCTYPE html>
<html>
<head>
    <title>Primera sesión de PHP con html </title>
</head>

<body>
    <h1><?php echo "Hola mundo!" ?></h1>
</body>

</html>


<?php
//Comentarios en php

#Comentarios para 1 sola línea

/*
    Comentario para multiples líneas. 
*/ 
?>

<?php 
    //Declaración de variables y tipo de datos.
    /*
        Variables:
        siempre inician con un $
        Después del simbolo puede ir una letra o un guión bajo, pero nunca un número
    */
    $nombre;
    $_edad = 10;
    $_Edad = 20;
    $_Edad = "veinte años";
    $nacionalidad= "Mexicana";
    $pasaporte= false;

    //Tipado debil, y Tipado ajustable.

    $numero1 = 4;
    $numero2 = "4";
    $numero3 = ($numero1 + $numero2). "<br>";
    echo $numero3;
    $numero4 = $numero1 . $numero2;
    echo $numero4;
?>

<?php
    //constante
    define("PI",3.141567);

    const IVA = 0.16;
?>

<?php
    //Operadores.

    $a = 10;
    $b = 3;

    $suma = $a + $b;
    $resta = $a - $b;
    $multiplicacion = $a * $b;
    $división = $a / $b; // b != 0
    $residuo = $a % $b;

    //Operadores comparativos
    $a == $b; //Igualdad
    $a === $b; //Igualdad estricta;
    $a != $b; //Diferente
    $a > $b; // A mayor que B
    $a < $b; // A menor que B

    //Operadores Lógicos

    ($a>5) && ($b<10); //and
    ($a == 10) || ($b > 2); // or
    !($a == 10); //negación
?>

<?php
    //Tipados
    $var = 42;
    echo gettype($var)."<br>";

    $var = "hola";
    echo gettype($var)."<br>";

    $var = (int)"142";

    //funciones para verificar tipados
    echo is_int($var)."<br>";
    echo is_string($var)."<br>";
    echo is_bool($var)."<br>";
    echo is_array($var)."<br>";
?>

