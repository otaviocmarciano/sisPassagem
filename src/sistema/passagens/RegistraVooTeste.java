package sistema.passagens;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import sistema.Assento;
import sistema.Aviao;
import sistema.Cidade;
import sistema.CodigoIATA;
import sistema.Voo;

public class RegistraVooTeste {
	
	List<Voo> voos = new ArrayList<>();
	

	RegistraVooTeste(){
		Assento[][] av = new Assento[10][10];
		//String modelo, int quantidadeDeAssentos
		Aviao a1 = new Aviao("Boeing 737", 100);
	
		LocalDateTime horarioSaida = LocalDateTime.of(2020, 12, 04, 15, 30, 00);
		LocalDateTime horarioChegada = LocalDateTime.of(2020, 12, 05, 15, 30, 00);
	
		List<Cidade> paradas = new ArrayList<>();
		//String nome, String estado, CodigoIATA codigo
		Cidade cidadeParada = new Cidade("Estado", "Cidade Qualquer", CodigoIATA.ZMD);
		paradas.add(cidadeParada);
		Cidade cidadeDestino = new Cidade("Sao Paulo", "Sao Paulo", CodigoIATA.SOD);
	
		Voo v1 = new Voo(av, a1, horarioSaida, horarioChegada, paradas, cidadeDestino);
		
		voos.add(v1);
	}
	
	}
