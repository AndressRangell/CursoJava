'use strict';

//Función común
function sumar(num1, num2){
    return num1 + num2;
}
console.log(`Suma: ${sumar(5, 7)}`);

//Función de tipo expresión
let restar = function(num1, num2){return num1 - num2}
console.log(`Resta: ${restar(5, 2)}`);

//Función sin llamado, se ejecuta una única vez cuando se inicia la clase
(function(num1, num2){
    console.log(`Multiplicación: ${num1 * num2}`);
})(4, 3);

//Función de tipo flecha
const division = (num1, num2) => num1 / num2;
console.log(`División: ${division(10, 2)}`);

//Trabajando con arguments en funciones
function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}
console.log(`El resultado de la suma es: ${sumarTodo(1,2,3,4,5)}`);