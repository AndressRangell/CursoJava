'use strict';

//Funcion constructor de objeto de tipo Persona
function Persona(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function() {
        return `${this.nombre} ${this.apellido}`;
    }
}

let padre = new Persona("Carlos", "Lopez", "juan@gmail.com");
console.log(padre);

let madre = new Persona("Laura", "Gomez", "laura@gmail.com");
console.log(madre);

//Con el metodo prototype podemos agregar un nuevo atributo al objeto persona
console.log();
Persona.prototype.telefono = '12345';
console.log(`Nuevo atributo para el objeto madre: ${madre.telefono}`);

//Usamos el método call para llamar el método de un objeto con los atributos de otro objeto
console.log();
let empleado1 = {
    nombre: 'Carlos',
    apellido: 'Serrano',
    nombreCompleto(){
        return `${this.nombre} ${this.apellido}`
    },
    informacion(titulo, telefono){
        return `${titulo}: ${this.nombre} ${this.apellido}, Teléfono: ${telefono}`;
    }
}
let empleado2 = {
    nombre: 'Javier',
    apellido: 'Solano'
}
console.log(empleado1.nombreCompleto.call(empleado2));

//Usamos el método call pasando parametros
console.log();
console.log(empleado1.informacion.call(empleado2, 'Ingeniero', '6407609'));