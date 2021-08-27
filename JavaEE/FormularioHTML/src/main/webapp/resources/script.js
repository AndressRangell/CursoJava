'use strict'

function validarFormulario(form){
    
    var usuario = form.usuario;
    if(usuario.value == ""){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = form.password;
    if(password.value == "" || password.value.length < 5){
        alert("Debe proporcionar un password mínimo de 5 carácteres");
        password.focus();
        password.select();
        return false;
    }

    var tecnologias = form.tecnologia;
    var checkSeleccionado = false;
    for(var i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnología");
        return false;
    }

    var genero = form.genero;
    var radioSeleccionado = false;
    for(var i = 0; i < genero.length; i++){
        if(genero[i].checked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("Debe seleccionar un género");
        return false;
    }

    var ocupacion = form.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupación");
        return false;
    }

    return true;
    
}