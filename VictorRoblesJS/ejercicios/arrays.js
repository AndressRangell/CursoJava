'use strict'

//Array de colores
const coloresClaros = ['Rojo', 'Amarillo', 'Verde', 'Azul'];
coloresClaros.forEach( (color, index, array) => {
    console.log((index + 1) + ' - ' + color);
    if(color == 'Verde') console.log(array);
});

//Array multidimensional
const coloresOscuros = ['Negro', 'Vinotinto', 'Marron', 'Gris'];
const colores = [coloresClaros, coloresOscuros];
console.log(colores);

//Añadimos elementos a un array
const animales = new Array();
animales.push('Perro');
animales.push('Gato');
animales.push('Conejo');
animales.push('Tortuga');
console.log(animales);

//Eliminamos el último elemento de un array
animales.pop();
console.log(animales);

//Eliminamos un elemento del array por medio de su indice
const indice = animales.indexOf('Gato');
if(indice != -1) animales.splice(indice, 1);
console.log(animales);

//Ordenamos un array
coloresClaros.sort();
console.log(coloresClaros);

//invertimos el orden de un array
coloresClaros.reverse();
console.log(coloresClaros);

//Buscamos un elemento en el array, retorna el elemento buscado
const colorBuscado = coloresClaros.find(color => color == 'Azul');
console.log(colorBuscado);

//Buscamos el indice de un elemento
const indiceDelColor = coloresClaros.findIndex(color => color == 'Azul');
console.log(indiceDelColor);

//Buscamos si existen elementos que cumplan una condición especifica
const existe = coloresClaros.some(color => color == 'Verde');
console.log(existe);