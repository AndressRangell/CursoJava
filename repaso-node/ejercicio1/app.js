'use strict';

//importamos el modulo crearArchivo de multiply.js
const {crearArchivo} = require('./helpers/multiply');

console.clear();

//obtenemos los argumentos enviados desde consola
const [ , , argumento = 'base=5'] = process.argv;
const [ , base = 5] = argumento.split('=');

crearArchivo(base)
    .then(response => console.log(`Se creo correctamente el archivo ${response}`))
    .catch(err => console.log(`Error al crear el archivo\n${err}`));