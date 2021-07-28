//Definimos la función imprimir
function impimir(mensaje){
    console.log(`${mensaje}`);
}

function multiplicar(num1, num2, callback){
    let resultado = num1 * num2;
    callback(`Resultado: ${resultado}`);
}

let i = 0;
const intervalo = setInterval(() => {
    multiplicar(5, i++, impimir);
    if(i > 10){
        clearInterval(intervalo);
    }
}, 1000);