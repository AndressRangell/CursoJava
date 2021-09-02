'use strict';

//Parámetros de tipo REST
function listadoFrutas(fruta1, fruta2, ...masFrutas){
    console.log(`Fruta 1: ${fruta1}`);
    console.log(`Fruta 2: ${fruta2}`);
    console.log(`Resto de frutas: ${masFrutas}`);
}

listadoFrutas("Manzana", "Pera", "Uva", "Banano", "Sandía");

//Parámetros de tipo SPREAD
function listadoVerduras(verdura1, verdura2, verdura3){
    console.log(`Verduras principales: ${verdura1}`);
    console.log(`Verdura 2: ${verdura2}`);
    console.log(`Verdura 3: ${verdura3}`);
}

const principales = ["Pimentón", "Tomate"];

listadoVerduras(principales, "Cebolla", "Zanahoria");