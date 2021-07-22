'use strict';

console.log('Saludos desde JavaScript');

//obtenemos el valor de la etiqueta con id título
let titulo = document.getElementById('titulo');
console.log(titulo.innerHTML);
setTimeout(() => {
    titulo.innerHTML = 'Texto enviado desde js';
}, 3000);

//Obtenemos el valor de las etiquetas <p>
let parrafos = document.getElementsByTagName('p');
console.log(`Número de párrafos: ${parrafos.length}`);

for(let parrafo of parrafos){
    console.log(parrafo.innerHTML);
}

//Obtenemos el valor de las etiquetas por nombre de clase
let elementosAzules = document.getElementsByClassName('azul');
setTimeout(() => {
    console.log(`Número de elementos con clase azul: ${elementosAzules.length}`);
}, 6000);

//Obtenemos el valor de todos los parrafos con clase azul
let parrafosAzules = document.querySelectorAll('p.azul');
setTimeout(() => {
    console.log(`Número de párrafos con clase azul: ${parrafosAzules.length}`);
}, 9000);

//Capturamos los datos enviados desde el formulario
function mostrarDatos(){
    let formulario = document.forms['formulario'];
    let nombre = formulario['nombre'];
    let apellido = formulario['apellido'];
    document.getElementById('respuesta').innerHTML = `Nombre: ${nombre.value} <br/>Apellido: ${apellido.value}`;
}

//Cambiar los atributos de las etiquetas desde js
function cambiarColorTitulo(){
    let titulo = document.getElementById('titulo');
    titulo.style = 'color: blue;';
}

function cambiarTamanoTitulo(){
    let titulo = document.getElementById('titulo');
    titulo.style.fontSize = '10px';
}
