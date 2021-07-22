let nombres = [
    {
        id: 1,
        nombre: 'Marcos'
    },
    {
        id: 2,
        nombre: 'Camilo'
    },
    {
        id: 3,
        nombre: 'Fernanda'
    }
];

let telefonos = [
    {
        id: 1,
        telefono: 6407609
    },
    {
        id: 2,
        telefono: 6732125
    },
    {
        id: 3,
        telefono: 6351214
    }
];

const obtenerNombre = id => {
    return new Promise((resolve, reject) => {
        if (nombres.find(usuario => usuario.id === id)) {
            resolve('El nombre existe!');
        } else {
            reject('El nombre no existe!');
        }
    });
}

const obtenerTelefono = id => {
    return new Promise((resolve, reject) => {
        if (telefonos.find(usuario => usuario.id === id)) {
            resolve('El telefono existe!');
        } else {
            reject('El telefono no existe!');
        }
    });
}

obtenerNombre(3)
    .then(res => console.log(res))
    .catch(rej => console.log(rej));

obtenerTelefono(3)
    .then(res => console.log(res))
    .catch(rej => console.log(rej));