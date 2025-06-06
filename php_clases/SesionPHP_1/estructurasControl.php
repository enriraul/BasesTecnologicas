<?php

    /*
        En este archivo encontrarás las estructuras de control:
        if-else
        switch
        for
        while
        do-while

    
    */

?>

<?
    //estructura if-else
    $edad = 20;
    if( $edad >20) {
        echo "Eres mayor de edad";
    }
    else if ($edad > 12){
        echo "Eres un adolescente";
    }
    else{
        echo "Eres un infante";
    }
?>

<?php 
    // estructura switch
    $dia = "Viernes";

    switch($dia){
        case "Lunes":
            echo "Inicio de semana";
            break;
        case "Martes":
            echo "Aún no";
            break;
        case "Viernes":
            echo "Feliz fin de semana";
            break;
        default:
            echo "día meh";
    }

?>

<?php

//Ciclos for-  while- do while

#Ciclo while

$i = 1;

while($i<=5){
    echo "Numero: $i<br>";
    $i++;
}


#do - while

$i = 1;
do {
    echo "Numero: $i<br>";
    $i++;
}while($i<=5);


#for

for($i = 1; $i <=5; $i++){
    echo "Iteración $i <br>";
}

?>


<?php
    $nombres = ["Ana", "Luis", "Pedro"];

    foreach($nombres as $nombre){
        echo "Hola, $nombre<br>";
    }

    foreach($nombres as $indice => $valor ){
        echo "$indice, $valor <br>";
    }
?>


<?php
//funciones

//Sintaxis 
function nombreFuncion(){
    //Instrucciones
}

function saludar(){
    echo "Hola, mundo!";
}

saludar();

//Parametros
function SaludarPresona($nombre){
    echo "Hola, $nombre <br>";
}

SaludarPresona("Pedro");

function sumar($a, $b){
    echo "Resultados: ". ($a + $b)."<br>";
}

sumar(5,8);

$n = 2;
function cuadrado($n){
    return $n * $n;
}

$n_2 = cuadrado($n);

echo "$n -> $n_2 <br>";

//Paso por referencia
function aumentar(&$x){
    $x += 1;
}

$x = "3";
aumentar($x);
echo $x;


function multiplicar (int $a,int  $b): int{
    return $a * $b;
}

$suma = function ($a, $b){ 
    return $a + $b;
};

echo "<br>".$suma(3,4);

//Paso de funciones de parametros
function operar($a, $b, $operacion){
    return $operacion($a, $b);
}

echo "Resultado ".operar(10,5, 
    function($x, $y){ 
        return $x -$y;
    }
);


//Recursividad

function factorial ($n){
    if ($n == 0) return 1;
    return $n * factorial($n -1);
}



?>


<?php
/*
    PHP ofrece las siguientes estructuras

    indexados: como una lista
    Asociado = clave-valor
    Multidimensionales = Arrays de Arrays
*/


//Arreglos indexados

$fruta = ["manzana","pera","melon"];
$fruta = array("manzana","pera","melon");


echo $fruta[1]; // acceder a la información

$fruta[1] = "platano"; //Modificar la información

$fruta[] = "uva"; //Agregar un nuevo elemento al final del arreglo.

foreach ($fruta as $f){
    echo "fruta: $f <br>";
}

foreach($fruta as $indice => $valor){
    echo "$indice -> $valor <br>";
}

?>

<?php

    $personas =[
        "nombre" => "Ana",
        "edad" => 29,
        "nacionalidad"=>"mexicana"
    ];

    //acceso
    echo $personas["nombre"]."<br>";
    //
    $personas["profesion"]= "arquitecta";

    foreach($personas as $indice => $valor){
    echo "$indice: $valor <br>";
    }


    $usuario =[
        [
            "nombre" => "Ana",
            "edad" => 29,
            "nacionalidad"=>"mexicana"
        ],
        [
            "nombre" => "Pedro",
            "edad" => 34,
            "nacionalidad"=>"mexicana"
        ],
        [
            "nombre" => "Pepe",
            "edad" => 54,
            "nacionalidad"=>"mexicana"
        ]
    ];
    echo $usuario[1]["nombre"];


    //metodos en arreglos
    echo count($fruta);
    $pos = array_search("platano",$fruta);
    echo $pos;

    $claves = array_keys($personas);
    $valores = array_values($personas);
?>