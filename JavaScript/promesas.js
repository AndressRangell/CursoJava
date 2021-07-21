let miPromesa = new Promise((resolve, reject) => {
    let expresion = true;
    if(expresion) resolve('Correcto');
    else reject('Incorrecto');
});

//Una forma validar promesas pasando verdadero y falso como argumentos
miPromesa.then(valor => console.log(valor), error => console.log(error));

//Forma correcta de usar promesas
miPromesa
.then(valor => console.log(valor))
.catch(error => console.log(error));

//async indica que una función regresa una promesa
async function funcionConPromesa(){
    return 'Saludos con promesa y async';
}

funcionConPromesa()
.then(valor => console.log(valor));

//Funcion con promesa, async y await
async function funcionAwait(){
    let promesa = new Promise(resolve => {
        resolve('Promesa con await');
    });
    console.log(await promesa);
}

funcionAwait();

//Funcion con promesa, async, await y Timeout
async function funcionTimeout(){
    console.log('Inicio de función');
    let promesa = new Promise(resolve => {
        setTimeout(() => resolve('Promesa con await y timeout'), 3000);
    });
    console.log(await promesa);
    console.log('Fin de función');
}

funcionTimeout();