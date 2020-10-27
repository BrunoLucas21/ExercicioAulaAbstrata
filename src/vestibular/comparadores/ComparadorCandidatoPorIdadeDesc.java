package vestibular.comparadores;

import java.util.Comparator;
import java.util.zip.DataFormatException;

import vestibular.entidades.Candidato;
import vestibular.excecoes.DataInvalidaException;

public class ComparadorCandidatoPorIdadeDesc implements Comparator<Candidato>{

	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o2.getDataDeNascimento().compareTo(o1.getDataDeNascimento());
	}

}
