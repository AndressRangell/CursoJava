'use strict'

//Función anónima, no tiene nombre puede ser asignada a cualquier variable
const sumar = function(num1, num2){
    return num1 + num2;
}

const nuevaSuma = sumar;

console.log(nuevaSuma(3, 7));

//Función callback, función que se pasa como parametro de otra función
const operaciones = function(num1, num2, sumar, multiplicar){
    let suma = num1 + num2;
    let multiplicacion = num1 * num2;
    sumar(suma);
    multiplicar(multiplicacion);
}

operaciones(4, 7,
    function(resultado){
        console.log("El resultado de la suma es: " + resultado);
    },
    function(resultado){
        console.log("El resultado de la multiplicación es: " + resultado);
    }
)

//Función flecha, son para reducir la definición de una función
const saludar = nombre => console.log("Bienvenido al curso JS " + nombre);

saludar("Andres Rangel");