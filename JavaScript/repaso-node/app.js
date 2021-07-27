'use strict';

//importamos el modulo crearArchivo de multiply.js
const {crearArchivo} = require('./helpers/multiply');

console.clear();

const base = 5;

crearArchivo(base)
    .then(response => console.log(`Se creo correctamente el archivo ${response}`))
    .catch(err => console.log(`Error al crear el archivo\n${err}`));