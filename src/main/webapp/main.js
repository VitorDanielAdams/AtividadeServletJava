var form = document.getElementById('form');

form.addEventListener('submit', function(e) {
	
	if(!checkInputs()) {
		e.preventDefault();    
	}
	
});

function checkInputs()	{
	
	const nomeValue = document.getElementById('nome').value.trim();
	const turmaValue = document.getElementById('turma').value.trim();
	const spanError = document.querySelector('span');
	
	if(nomeValue !== '' && turmaValue !== '')	{
		spanError.innerText = "";
		return true;
	} else if(nomeValue === '')	{
		spanError.innerText = "Por Favor insira um Nome";
	} else if(turmaValue === '')  {
		spanError.innerText = "Por Favor insira uma Turma";
	} else {
		spanError.innerText = "Preencha os campos";
		return false;	
	}
	
}