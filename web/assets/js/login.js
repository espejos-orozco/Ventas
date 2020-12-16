/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
module.exports = function (grunt) {
    // Project configuration.
    grunt.initConfig({
        
    });
    
    $(document).ready(function(){
       //Aquí van los datos cuando carga la página 
    });
    
    $(document).on("click", "#btn-login", function(){
       let correo = $(document).find("#correo").val();
       let password = $(document).find("#password").val();
       
       if(correo != "" && password != ""){
           //Ajax
           
       }else{
           //Mandar alerta
           alert("Faltan datos");
       }
    });
};
