'use strict';

class Persona{
    static contadorPersona = 0;
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        Persona.contadorPersona++;
    }
    static saludar(){
        return `Hola desde el método estático`;
    }
    static saludarPersona(persona){
        return `Hola ${persona._nombre} ${persona._apellido}`;
    }
}

class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
}

let persona = new Persona('Juan', 'Rojas');
let empleado = new Empleado('Camilo', 'Rodriguez', 'Finanzas');

//Llamamos los métodos estáticos de la clase Persona
console.log(Persona.saludar());
console.log(Empleado.saludarPersona(persona));

//Mostramos el atributo estático contador de la clase Persona
console.log(Persona.contadorPersona);

//Como crear o simular una constante estática
class Prueba{
    static get CONSTANTE(){
        return 10;
    }
}

console.log(Prueba.CONSTANTE);