function eliminar(id) {
	swal({
			title: "Estás seguro?",
			text: "Una vez eliminado, no podrás recuperar esta tarea!",
 			icon: "warning",
 			buttons: true,
 			dangerMode: true,
		})
	.then((OK) => {
  	if (OK) {
		  $.ajax({
			  url:"/eliminar/"+id,
			  success: function(respuesta){
				  console.log(respuesta);
			  }
		  })
		  
    swal("Poof! Tu tarea ha sido eliminada!", {
      icon: "success",
    }).then(()=>{
		if(OK){
			location.href="/listar";
		}
	});
  } else {
    swal("Tu tarea está a salvo!");
  }
});
}
