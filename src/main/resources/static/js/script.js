$(document).ready(function() {
	
	$("#registroHora").click(function() {
		var fecha = new Date();
		fechaRegistro = (fecha.getDate()+"/"+(fecha.getMonth()+1)+"/"+fecha.getFullYear());
		horaRegistroInicial = (fecha.getHours()+":"+fecha.getMinutes()+":"+fecha.getSeconds());
		
		var data = {
				"estado":"inicial",
				"fecha":fechaRegistro,
				"horaFinal": '00:00:00',
				"horaInicial":horaRegistroInicial,
				"usuario" : {
					"id_usuario" : 1
				}
				};
		var token = $('#csrfToken').val();
		var header = $('#csrfHeader').val();
		
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/horas/save",							
			data : JSON.stringify(data),
			async : true,
		    beforeSend: function(xhr) {
		        xhr.setRequestHeader("Accept", "application/json");
		        xhr.setRequestHeader("Content-Type", "application/json");
		        xhr.setRequestHeader(header, token);
		    },
			success : function(models) {
				if(models =="1"){
					alert("Jornada Guardada");
				}else{
					alert("Error al guardar los datos");
				}
			},
			error : function(XMLHttpRequest, textStatus,
					errorThrown) {
				alert("Request: " + XMLHttpRequest.toString()
						+ "\n\nStatus: " + textStatus
						+ "\n\nError: " + errorThrown);
			}
		});
		
		
	});
					// INI -- PARA JPA REPOSITORY
//					$.ajax({
//						type : "GET",
//						url : "http://localhost:8080/persona/listar",
//						contentType : "application/json; charset=utf-8",
//						dataType : "json",
//						success : function(models) {
//							for (var i = 0; i < models.length; i++) {
//								var valor = models[i].idPersona;
//								var Descripcion = models[i].nombreCompleto;
//								var dllLocal = $('[id$=cboPersona');
//								dllLocal.append($("<option></option>").val(
//										valor).html(Descripcion));
//							}
//						},
//
//						error : function(XMLHttpRequest, textStatus,
//								errorThrown) {
//							alert("Request: " + XMLHttpRequest.toString()
//									+ "\n\nStatus: " + textStatus
//									+ "\n\nError: " + errorThrown);
//						}
//					});
					

				});