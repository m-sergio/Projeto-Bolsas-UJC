$(function(){
	var atual_fs, next_fs, prev_fs;
	var formulario= $('form[name=formulario]');

function next(elem){
	atual_fs = $(elem).parent();
	next_fs = $(elem).parent().next();

	$('#progress li').eq($('fieldset').index(next_fs)).addClass('ativo');
	atual_fs.hide(800);
	next_fs.show(800);
}



$('.prev').click(function(){
	atual_fs = $(this).parent();
	prev_fs = $(this).parent().prev();

	$('#progress li').eq($('fieldset').index(atual_fs)).removeClass('ativo');
	atual_fs.hide(800);
	prev_fs.show(800);
});

$('input[name=next1]').click(function(){
	var array = formulario.serializeArray();
	
		next($(this));

});


$('input[name=next2]').click(function(){
	var array = formulario.serializeArray();
		
		next($(this));

});


$('input[name=next3]').click(function(){

	var array = formulario.serializeArray();
		next($(this));
	

});




//submit do formulario para o controller
$("#formulario").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	//fieldset01
	var formData = {};
	formData.nomePai = $("#nomePai").val();
	formData.dataNascimentoPai = $("#dataNascimentoPai").val();
	formData.profissaoPai = $("#profissaoPai").val();
	formData.entidadePatronalPai = $("#entidadePatronalPai").val();
	formData.contactoPatronalPai = $("#contactoPatronalPai").val();
	formData.nomeMae = $("#nomeMae").val();
	formData.dataNascimentoMae = $("#dataNascimentoMae").val();
	formData.profissaoMae = $("#profissaoMae").val();
	formData.entidadePatronalMae = $("#entidadePatronalMae").val();
	formData.contactoPatronalMae = $("#contactoPatronalMae").val();
	
	//fieldset02
	formData.tipoBolsa = $("#tipoBolsa").val();
	
	//fieldset03
	formData.provinciaFrequencia = $("#provinciaFrequencia").val();
	formData.escolaFrequencia = $("#escolaFrequencia").val();
	formData.anoConclusao = $("#anoConclusao").val();
	
	

	
	//console.log('formData > ', formData);
	
	$.ajax({
		method: "POST",
		url: "/candidatura/salvar",
		data: formData,
		success: function() {
			 window.location.replace("http://localhost:8080/candidatura/consultar");
			 $("#alert").addClass("alert alert-success").text("Candidatura submetida com sucesso!");
			  	 
		}
	});
});



});