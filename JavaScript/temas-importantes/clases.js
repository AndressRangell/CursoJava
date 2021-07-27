'use strict';

//Creación de clase en JavaScript
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    nombreCompleto(){
        return `${this._nombre} ${this._apellido}`;
    }
    informacion(){
        return `${this._nombre} ${this._apellido}`;
    }
}

//Creamos objetos a partir de la clase Persona
let persona1 = new Persona('Andres', 'Rangel');
console.log(persona1);

let persona2 = new Persona('Jhoan', 'Rangel');
console.log(persona2);

//Probamos los metodos get y set de ClasePersona
persona1.nombre = 'Fabian';
persona1.apellido = 'Rojas';
console.log(persona1.nombre);
console.log(persona1.apellido);

//Creamos la clase Empleado que hereda de la clase Persona
class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    informacion(){
        return `Nombre completo: ${super.informacion()}, Departamento: ${this._departamento}`;
    }
}

//Mostramos los datos del empleado
let empleado1 = new Empleado('Javier', 'Ramirez', 'Sistemas');
console.log(empleado1);

//Probamos la herencia de métodos
console.log(empleado1.nombreCompleto());

//Imprimimos la información completa del empleado usando sobreescritura
console.log(empleado1.informacion());