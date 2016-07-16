/**
 * 
 */
$(document).ready(function() {
	$('.PedidoBolsa').off('click').on('click', function() {
		$.ajax({
			url : 'pedidoSangre.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});	
	});
	$('.ListaPedidos').off('click').on('click', function() {		
		$.ajax({
			url : 'listaPedidos.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});	
	$('.AgregarBolsa').off('click').on('click', function() {
		$.ajax({
			url : 'regBolsaSangre.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});	
	});
	$('.registrarDonante').off('click').on('click', function() {		
		$.ajax({
			url : 'regDonante.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});
	$('.listaDonante').off('click').on('click', function() {		
		$.ajax({
			url : 'listaDonantes.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});
	$('.registrarPrueba').off('click').on('click', function() {		
		$.ajax({
			url : 'Prueba.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});
	$('.listaPrueba').off('click').on('click', function() {		
		$.ajax({
			url : 'listaPruebas.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});

	$('.editarPrueba').off('click').on('click', function() {		
		$.ajax({
			url : 'editarPrueba.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});

	$('.verPrueba').off('click').on('click', function() {		
		$.ajax({
			url : 'verPrueba.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});
	$('.EditarBolsaSangre').off('click').on('click', function() {		
		$.ajax({
			url : 'editarBolsaSangre.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});
	$('#confirmar').off('click').on('click', function() {
		if ($('body')) {
			$.ajax({
				url : 'confirmarProfesor.jsp',
				success : function(data) {
					$('#seccionBase').html(data);
					$('#seccionBase div').slideDown(1000);
				}
			});
		} else {
			$.ajax({
				url : 'confirmarProfesor.jsp',
				success : function(data) {
					$('#divDinamico').html(data);
					$('#divDinamico div').slideDown(1000);
				}
			});
		}
	});
	$('.editarDonante').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'editarDonante.jsp',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});
	});
	$('.editarSolicitudDon').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'editarSolicitudDon.jsp',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});
	});
	$('.editarSolicitudUniSangre').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'editarSolicitudUniSangre.jsp',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});
	});
	$('.editarCurso').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'curso',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('.editarProfesor').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'profesor',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('.editarSeccion').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'seccion',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('.listaDonantes').off('click').on('click', function() {
		$.ajax({
			url : 'listaDonantes.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});
	$('.listaSolicitudesDon').off('click').on('click', function() {
		$.ajax({
			url : 'listaSolicitudesDon.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});
	$('.listaSolicitudUniSangre').off('click').on('click', function() {
		$.ajax({
			url : 'listaSolicitudUniSangre.jsp',
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});		
	});	
	$('.verDonante').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'verDonante.jsp',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});
	});
	$('.verSolicitudDon').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'verSolicitudDon.jsp',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});
	});
	$('.verSolicitudUniSangre').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'verSolicitudUniSangre.jsp',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#seccionBase').html(data);
				$('#seccionBase div').slideDown(1000);
			}
		});
	});
	$('.verProfesor').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'profesor',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('.verSeccion').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'seccion',
			data : {
				"id" : $(this).attr('data-index-number'),
				"action" : $(this).attr('data-action')
			},
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('#postAlumno').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var direccion = $(this).attr('action');
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'POST', // define the type of HTTP verb we want to use (POST
			// for our form)
			url : direccion, // the url where we want to POST
			data : formData, // our data object
			// what type of data do we expect back from the server
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});

	$('#postProfesor').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var direccion = $(this).attr('action');
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'POST', // define the type of HTTP verb we want to use (POST
			// for our form)
			url : direccion, // the url where we want to POST
			data : formData, // our data object
			// what type of data do we expect back from the server
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});

	$('#postCurso').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var direccion = $(this).attr('action');
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'POST', // define the type of HTTP verb we want to use (POST
			// for our form)
			url : direccion, // the url where we want to POST
			data : formData, // our data object
			// what type of data do we expect back from the server
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});

	$('#postSeccion').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var direccion = $(this).attr('action');
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'POST', // define the type of HTTP verb we want to use (POST
			// for our form)
			url : direccion, // the url where we want to POST
			data : formData, // our data object
			// what type of data do we expect back from the server
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});
	$('#putAlumno').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'post', // define the type of HTTP verb we want to use
			url : 'alumno2', // the url where we want to put
			data : formData, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});
	$('#putProfesor').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'post', // define the type of HTTP verb we want to use
			url : 'profesor2', // the url where we want to put
			data : formData, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});
	$('#putCurso').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'post', // define the type of HTTP verb we want to use
			url : 'curso2', // the url where we want to put
			data : formData, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});
	$('#putSeccion').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'post', // define the type of HTTP verb we want to use
			url : 'seccion2', // the url where we want to put
			data : formData, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});
	$('.eliminarAlumno').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'alumno2',
			data : {
				"id" : $(this).attr('data-index-number')
			}, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('.eliminarProfesor').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'profesor2',
			data : {
				"id" : $(this).attr('data-index-number')
			}, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('.eliminarCurso').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'curso2',
			data : {
				"id" : $(this).attr('data-index-number')
			}, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('.eliminarSeccion').off('click').on('click', function() {
		$.ajax({
			type : 'get',
			url : 'seccion2',
			data : {
				"id" : $(this).attr('data-index-number')
			}, // our data object
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		});
	});
	$('#postAlumnoSeccion').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var direccion = $(this).attr('action');
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'POST', // define the type of HTTP verb we want to use (POST
			// for our form)
			url : direccion, // the url where we want to POST
			data : formData, // our data object
			// what type of data do we expect back from the server
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});
	$('#postNotasSeccion').off('submit').on('submit', function(event) {
		event.stopPropagation();
		var direccion = $(this).attr('action');
		var formData = $(this).serializeArray();
		// process the form
		$.ajax({
			type : 'POST', // define the type of HTTP verb we want to use (POST
			// for our form)
			url : direccion, // the url where we want to POST
			data : formData, // our data object
			// what type of data do we expect back from the server
			success : function(data) {
				$('#divDinamico').html(data);
				$('#divDinamico div').slideDown(1000);
			}
		})
		// stop the form from submitting the normal way and refreshing the page
		event.preventDefault();
	});

});
