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

//probamos el método onload que se ejecuta al cargar la página
function entrar(){
    alert('Entrando a la página web');
    let texto = '';
    if(navigator.cookieEnabled){
        texto = 'Cookies habilitadas';
    }else{
        texto = 'Cookies deshabilitadas';
    }
    document.getElementById('encabezado2').innerHTML = texto;
}

//probamos el método onchange que se ejecuta cuando se cambia el focus de un input
function onChange(elemento){
    elemento.value = elemento.value.toUpperCase();
}

//probamos el método onmouseover se ejecuta cuando pones el mouse sobre el elemento
function verde(elemento){
    elemento.style.color = 'green';
}

//probamos el método onmouseout se ejecuta cuando quitas el mouse del elemento
function rojo(elemento){
    elemento.style.color = 'red';
}

//probamos el método onmousedown se ejecuta cuando haces click sobre el elemento
function azul(elemento){
    elemento.style.color = 'blue';
}

//probamos el método onmouseup se ejecuta cuando sueltas el click del elemento
function amarillo(elemento){
    elemento.style.color = 'yellow';
}

//probamos el método onfocus se ejecuta al poner foco en un elemento
document.getElementById('input').addEventListener('focus', () => {
    document.getElementById('input').style.background = 'Yellow';
});

//probamos el método onblur se ejecuta al salir del foco de un elemento
document.getElementById('input').addEventListener('blur', () => {
    document.getElementById('input').style.background = 'white';
});