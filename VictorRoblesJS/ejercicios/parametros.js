'use strict';

//Parámetros de tipo REST
function listadoFrutas(fruta1, fruta2, ...masFrutas){
    console.log(`Fruta 1: ${fruta1}`);
    console.log(`Fruta 2: ${fruta2}`);
    console.log(`Resto de frutas: ${masFrutas}`);
}

listadoFrutas("Manzana", "Pera");