'use strict';

//Módulo File System
const fs = require('fs');

const crearArchivo = async (base = 5) => {

    try{
        let salida = '';
        let nombreArchivo = `tabla-${base}.txt`;

        for(let i = 1; i <= 10; i++){
            salida += `${base} x ${i} = ${base * i}\n`;
        }

        fs.writeFileSync(nombreArchivo, salida);
        return nombreArchivo;

    }catch(err){
        throw err;
    }

}

//Exportamos el módulo de crearArchivo
module.exports = {
    crearArchivo
}