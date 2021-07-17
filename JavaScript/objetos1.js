'use strict';

//Objeto persona con atributos y métodos
let persona = {
    nombre: 'Juan',
    apellido: 'Perez',
    email: 'juan@gmail.com',
    edad: 28,
    nombreCompleto(){
        return this.nombre + ' ' + this.apellido;
    }
}

console.log(`Nombre: ${persona.nombre}`);
console.log(`Apellido: ${persona.apellido}`);
console.log(`Email: ${persona.email}`);
console.log(`Edad: ${persona.edad}`);
console.log(`Nombre completo: ${persona.nombreCompleto()}`);

//Reservamos espacio en memoria con la palabra new para crear nuevo objeto
let nuevaPersona = new Object();
nuevaPersona.nombre = 'Carlos';
nuevaPersona.direccion = 'Calle 25 # 32';
nuevaPersona.telefono = '6407609';

console.log();
console.log(`Nombre: ${nuevaPersona.nombre}`);
console.log(`Dirección: ${nuevaPersona.direccion}`);
console.log(`Teléfono: ${nuevaPersona.telefono}`);

//Diferentes formas de acceder a las propiedades de un objeto
console.log();
console.log(`Nombre: ${persona.nombre}`);
console.log(`Nombre: ${persona['nombre']}`);

//Eliminar un atributo del objetos
console.log();
delete persona.email;
console.log(persona);

//Imprimir un objeto
console.log();
for(let i in persona){
    console.log(persona[i]);
}

console.log();
let arrayPersona = Object.values(persona);
console.log(arrayPersona);

console.log();
let stringPersona = JSON.stringify(persona);
console.log(stringPersona);

//Métodos get y set en objetos
console.log();
let empleado = {
    nombre: 'Jorge',
    telefono: '123456',
    salario(){
        return 5000;
    },
    set tel(nuevoTelefono){
        this.telefono = nuevoTelefono;
    }
}

console.log(empleado.salario());
empleado.tel = '555';
console.log(empleado.telefono);