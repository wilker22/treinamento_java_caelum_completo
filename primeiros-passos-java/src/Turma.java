class Turma {
	Alunos[] alunos;
	
	void impirmirNotas(){
		for(int i = 0; i < this.alunos.length; i++){
			if(this.alunos == null) continue;
			System.out.println(this.alunos[i]);
		}
	}
}

class Alunos {
	String nome;
	int nota;
}

class TesteDaTurma {
	public static void main(String[] args) {
		Turma fj11 = new Turma();
		fj11.alunos = new Alunos[10];
		
		fj11.alunos[0] = new Alunos();
		fj11.alunos[0].nome = "Mauricio";
		fj11.alunos[0].nota = 9;
		
		fj11.alunos[1] = new Alunos();
		fj11.alunos[1].nome = "Marcelo";
		fj11.alunos[1].nota = 5;
		
		fj11.alunos[2] = new Alunos();
		fj11.alunos[2].nome = "Astésio José";
		fj11.alunos[2].nota = 10;
		
//		System.out.println(fj11.notas[0]);
		
		
	}
}
