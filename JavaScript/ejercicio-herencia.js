class Persona{
    static contadorPersonas = 0;
    constructor(nombre, apellido, edad){
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this._idPersona = ++Persona.contadorPersonas;
    }
    get idPersona(){
        return this._idPersona;
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
    get edad(){
        return this._edad;
    }
    set edad(edad){
        this._edad = edad;
    }
    toString(){
        return `Nombre: ${this._nombre}, Apellido: ${this._apellido}, Edad: ${this._edad}`;
    }
}

class Empleado extends Persona{
    static contadorEmpleados = 0;
    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._sueldo = sueldo;
        this._idEmpleado = ++Empleado.contadorEmpleados;
    }
    get idEmpleado(){
        return this._idEmpleado;
    }
    get sueldo(){
        return this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }
    toString(){
        return `IdEmpleado: ${this._idEmpleado}, ${super.toString()}, Sueldo: ${this._sueldo}`;
    }
}

class Cliente extends Persona{
    static contadorClientes = 0;
    constructor(nombre, apellido, edad){
        super(nombre, apellido, edad);
        this._fechaRegistro = new Date();
        this._idCliente = ++Cliente.contadorClientes;
    }
    get idCliente(){
        return this._idCliente;
    }
    get fechaRegistro(){
        return this._fechaRegistro;
    }
    set fechaRegistro(fechaRegistro){
        this._fechaRegistro = fechaRegistro;
    }
    toString(){
        return `IdCliente: ${this._idCliente}, ${super.toString()}, FechaRegistro: ${this._fechaRegistro}`;
    }
}

let persona1 = new Persona('Andres', 'Rangel', 25);
let persona2 = new Persona('Jhoan', 'Rojas', 22);
let persona3 = new Persona('Camilo', 'Perez', 5);

let empleado1 = new Empleado('Camila', 'Rangel', 21, 5000);
let empleado2 = new Empleado('Ixel', 'Suarez', 19, 3000);
let empleado3 = new Empleado('Johana', 'Almeida', 30, 4000);

let cliente1 = new Cliente('Carlos', 'Serrano', 28);
let cliente2 = new Cliente('Wendy', 'Rangel', 26);
let cliente3 = new Cliente('Nando', 'Ramirez', 27);

console.log(persona1.toString());
console.log(persona2.toString());
console.log(persona3.toString());
console.log();

console.log(empleado1.toString());
console.log(empleado2.toString());
console.log(empleado3.toString());
console.log();

console.log(cliente1.toString());
console.log(cliente2.toString());
console.log(cliente3.toString());
console.log();

console.log(Empleado.contadorEmpleados)
console.log(Cliente.contadorClientes)
console.log(Persona.contadorPersonas)