package vestibular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vestibular.bancodedados.BancoDeDados;
import vestibular.comparadores.ComparadorCandidatoPorIdadeAsc;
import vestibular.comparadores.ComparadorCandidatoPorIdadeDesc;
import vestibular.comparadores.ComparadorCandidatoPorNome;
import vestibular.comparadores.ComparadorCandidatoPorNotaAsc;
import vestibular.comparadores.ComparadorCandidatoPorNotaDesc;
import vestibular.entidades.Candidato;

/**
 * @author bruno
 *
 */
public class Vestibular {
	public List<Candidato> getCandidatosOrdenadosPorNome(String curso) {
		List<Candidato> candidatos = BancoDeDados.getCandidatos();

		// Primeiro, filtro os candidatos pelo curso
		List<Candidato> candidatosFiltrados = new ArrayList<>();
		for (Candidato c : candidatos) {
			if (c.getCurso().equals(curso)) {
				candidatosFiltrados.add(c);
			}
		}
		
		// Ordenar os candidatos j� filtrados
		Collections.sort(candidatosFiltrados, new ComparadorCandidatoPorNome());
		
		return candidatosFiltrados;
	}
	
	public List<Candidato> getCandidatosOrdenadosPorIdadeAsc(String curso) {
		List<Candidato> candidatos = BancoDeDados.getCandidatos();
		
		// Primeiro, filtro os candidatos pelo curso
		List<Candidato> candidatosFiltrados = new ArrayList<>();
		for (Candidato c : candidatos) {
			if (c.getCurso().equals(curso)) {
				candidatosFiltrados.add(c);
			}
		}
		
		// Ordenar os candidatos j� filtrados
		Collections.sort(candidatosFiltrados, new ComparadorCandidatoPorIdadeAsc());
		
		return candidatosFiltrados;
	}
	
	public List<Candidato> getCandidatosOrdenadosPorIdadeDesc(String curso) {
		List<Candidato> candidatos = BancoDeDados.getCandidatos();
		
		// Primeiro, filtro os candidatos pelo curso
		List<Candidato> candidatosFiltrados = new ArrayList<>();
		for (Candidato c : candidatos) {
			if (c.getCurso().equals(curso)) {
				candidatosFiltrados.add(c);
			}
		}
		
		// Ordenar os candidatos j� filtrados
		Collections.sort(candidatosFiltrados, new ComparadorCandidatoPorIdadeDesc());
		
		return candidatosFiltrados;
	}
	
	public List<Candidato> getCandidatosOrdenadosPorNotaAsc(String curso) {
		List<Candidato> candidatos = BancoDeDados.getCandidatos();
		
		// Primeiro, filtro os candidatos pelo curso
		List<Candidato> candidatosFiltrados = new ArrayList<>();
		for (Candidato c : candidatos) {
			if (c.getCurso().equals(curso))
			candidatosFiltrados.add(c);
		}
		
		// Ordenar os candidatos j� filtrados
		Collections.sort(candidatosFiltrados, new ComparadorCandidatoPorNotaAsc());
		
		return candidatosFiltrados;
	}
	
	public List<Candidato> getCandidatosOrdenadosPorNotaDesc(String curso) {
		List<Candidato> candidatos = BancoDeDados.getCandidatos();
		
		// Primeiro, filtro os candidatos pelo curso
		List<Candidato> candidatosFiltrados = new ArrayList<>();
		for (Candidato c : candidatos) {
			if (c.getCurso().equals(curso)) {
				candidatosFiltrados.add(c);
			}
		}
		
		// Ordenar os candidatos j� filtrados
		Collections.sort(candidatosFiltrados, new ComparadorCandidatoPorNotaDesc());
		
		return candidatosFiltrados;
	}
	
	
	
	public static void main(String[] args) {
		Vestibular v = new Vestibular();
		
		System.out.println("Candidatos para o curso de SI ordendos por nome:");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		System.out.println("| CURSO                     | NOTA  | NOME                 | DT. NASC   |");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		for (Candidato c : v.getCandidatosOrdenadosPorNome("Sistemas de Informação")) {
			System.out.println(c);
		}
		System.out.println("+---------------------------+-------+----------------------+------------+");
		
		System.out.println("Candidatos para o curso de SI ordendos por idade crescente:");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		System.out.println("| CURSO                     | NOTA  | NOME                 | DT. NASC   |");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		for (Candidato c : v.getCandidatosOrdenadosPorIdadeAsc("Sistemas de Informação")) {
			System.out.println(c);
		}
		System.out.println("+---------------------------+-------+----------------------+------------+");
		
		System.out.println("Candidatos para o curso de SI ordendos por idade decrecente:");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		System.out.println("| CURSO                     | NOTA  | NOME                 | DT. NASC   |");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		for (Candidato c : v.getCandidatosOrdenadosPorIdadeDesc("Sistemas de Informação")) {
			System.out.println(c);
		}
		System.out.println("+---------------------------+-------+----------------------+------------+");
		
		System.out.println("Candidatos para o curso de SI ordendos por notas crescente:");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		System.out.println("| CURSO                     | NOTA  | NOME                 | DT. NASC   |");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		for (Candidato c : v.getCandidatosOrdenadosPorNotaAsc("Sistemas de Informação")) {
			System.out.println(c);
		}
		System.out.println("+---------------------------+-------+----------------------+------------+");
		
		System.out.println("Candidatos para o curso de SI ordendos por notas descrecente:");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		System.out.println("| CURSO                     | NOTA  | NOME                 | DT. NASC   |");
		System.out.println("+---------------------------+-------+----------------------+------------+");
		for (Candidato c : v.getCandidatosOrdenadosPorNotaDesc("Sistemas de Informação")) {
			System.out.println(c);
		}
		System.out.println("+---------------------------+-------+----------------------+------------+");
		
		// Mostre os candidatos ordenados por nota (da maior para menor) para o curso de jogos
		// Mostre os candidatos ordenados por nota (da menor para maior) para o curso de SI
		// Mostre os candidatos ordenados por idade (da maior para menor) para o curso de jogos
		// Mostre os candidatos ordenados por idade (da menor para maior) para o curso de SI
	}
}
