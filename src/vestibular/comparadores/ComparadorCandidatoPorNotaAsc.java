package vestibular.comparadores;

import java.util.Comparator;

import vestibular.entidades.Candidato;

public class ComparadorCandidatoPorNotaAsc implements Comparator<Candidato>{

	@Override
	public int compare(Candidato o1, Candidato o2) {
		if (o1.getNota() < o2.getNota()) {
			return +1;
		} else if (o1.getNota() > o2.getNota()) {
			return -1;
		}
		
		return 0;
	}

}
