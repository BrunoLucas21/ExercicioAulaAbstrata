package vestibular.comparadores;

import java.util.Comparator;

import vestibular.entidades.Candidato;

public class ComparadorCandidatoPorIdadeAsc implements Comparator<Candidato>{

	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getDataDeNascimento().compareTo(o2.getDataDeNascimento());
	}

}
