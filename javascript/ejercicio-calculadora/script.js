function sumar(){
    const formulario = document.getElementById('formulario');
    let numero1 = formulario['numero1'];
    let numero2 = formulario['numero2'];
    let resultado = parseInt(numero1.value) + parseInt(numero2.value);
    if(isNaN(resultado)){
        resultado = `La operación no incluye números`;
    }
    document.getElementById('resultado').innerHTML = `Resultado: ${resultado}`;
}