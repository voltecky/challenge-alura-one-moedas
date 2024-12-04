import java.text.NumberFormat;
import java.util.Scanner;

//		02/01/2023

public class MainTesteConversao {
	
	public static void main(String[] args) {
		
		Moeda brl = new Moeda(); // objeto brl
		
			brl.setId(1);
			brl.setIso("BRL");
			brl.setNome("Real");
			brl.setNomes("Reais");
			brl.setSimbolo("R$");
			brl.setValorcambiobrl(1);
			brl.setValorcambioeur(0.1755);
			brl.setValorcambiojpy(24.4738);
			brl.setValorcambiousd(0.1871);
		
		Moeda eur = new Moeda(); // objeto eur
		
			eur.setId(2);
			eur.setIso("EUR");
			eur.setNome("Euro");
			eur.setNomes("Euros");
			eur.setSimbolo("€");
			eur.setValorcambiobrl(5.6951);
			eur.setValorcambioeur(1);
			eur.setValorcambiojpy(139.3984);
			eur.setValorcambiousd(1.0659);
		
		Moeda jpy = new Moeda(); // objeto jpy
			
			jpy.setId(3);
			jpy.setIso("JPY");
			jpy.setNome("Iene");
			jpy.setNomes("Ienes");
			jpy.setSimbolo("¥");
			jpy.setValorcambiobrl(0.0409);
			jpy.setValorcambioeur(0.0072);
			jpy.setValorcambiojpy(1);
			jpy.setValorcambiousd(0.0076);
			
		Moeda usd = new Moeda(); // objeto usd
			
			usd.setId(4);
			usd.setIso("USD");
			usd.setNome("Dolar");
			usd.setNomes("Dolares");
			usd.setSimbolo("US$");
			usd.setValorcambiobrl(5.343);
			usd.setValorcambioeur(0.9378);
			usd.setValorcambiojpy(4.3);
			usd.setValorcambiousd(130.78);

		Entrada entrada = new Entrada();
			
			entrada.setSelecaoMoedaOrigem(brl.getNomes(), eur.getNomes(), jpy.getNomes(), usd.getNomes());
			
				String moedaOrigemNome = " ";
				String moedaOrigemNomes = " ";
				String moedaOrigemSimbolo = " ";
			
				switch (entrada.getSelecaoMoedaOrigem()) 
				{
					
					case 1:
						moedaOrigemNome = brl.getNome();
						moedaOrigemNomes = brl.getNomes();
						moedaOrigemSimbolo = brl.getSimbolo();
						break;
						
					case 2:
						moedaOrigemNome = eur.getNome();
						moedaOrigemNomes = eur.getNomes();
						moedaOrigemSimbolo = eur.getSimbolo();
						break;
						
					case 3:
						moedaOrigemNome = jpy.getNome();
						moedaOrigemNomes = jpy.getNomes();
						moedaOrigemSimbolo = jpy.getSimbolo();
						break;
						
					case 4:
						moedaOrigemNome = usd.getNome();
						moedaOrigemNomes = usd.getNomes();
						moedaOrigemSimbolo = usd.getSimbolo();
						break;
						
				}
			
			entrada.setMoedaOrigemQuantidade(brl.getNomes(), brl.getSimbolo(),eur.getNomes(), eur.getSimbolo(),jpy.getNomes(), jpy.getSimbolo(),usd.getNomes(), usd.getSimbolo());
				
			entrada.setSelecaoMoedaDestino(brl.getNomes(), eur.getNomes(), jpy.getNomes(), usd.getNomes());
			
				double origemCambioDestino = 0.0;
				String moedaDestinoNome = " ";
				String moedaDestinoNomes = " ";
				String moedaDestinoSimbolo = " ";
				
				if(entrada.getSelecaoMoedaOrigem() == 1) 
				{
					if(entrada.getSelecaoMoedaDestino() == 1){
						origemCambioDestino = brl.getValorcambiobrl();
						moedaDestinoNome = brl.getNome();
						moedaDestinoNomes = brl.getNomes();
						moedaDestinoSimbolo = brl.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 2){
						origemCambioDestino = brl.getValorcambioeur();
						moedaDestinoNome = eur.getNome();
						moedaDestinoNomes = eur.getNomes();
						moedaDestinoSimbolo = eur.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 3){
						origemCambioDestino = brl.getValorcambiojpy();
						moedaDestinoNome = jpy.getNome();
						moedaDestinoNomes = jpy.getNomes();
						moedaDestinoSimbolo = jpy.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 4){
						origemCambioDestino = brl.getValorcambiousd();
						moedaDestinoNome = usd.getNome();
						moedaDestinoNomes = usd.getNomes();
						moedaDestinoSimbolo = usd.getSimbolo();
					}
				}
				if(entrada.getSelecaoMoedaOrigem() == 2) 
				{
					if(entrada.getSelecaoMoedaDestino() == 1){
						origemCambioDestino = eur.getValorcambiobrl();
						moedaDestinoNome = brl.getNome();
						moedaDestinoNomes = brl.getNomes();
						moedaDestinoSimbolo = brl.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 2){
						origemCambioDestino = eur.getValorcambioeur();
						moedaDestinoNome = eur.getNome();
						moedaDestinoNomes = eur.getNomes();
						moedaDestinoSimbolo = eur.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 3){
						origemCambioDestino = eur.getValorcambiojpy();
						moedaDestinoNome = jpy.getNome();
						moedaDestinoNomes = jpy.getNomes();
						moedaDestinoSimbolo = jpy.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 4){
						origemCambioDestino = eur.getValorcambiousd();
						moedaDestinoNome = usd.getNome();
						moedaDestinoNomes = usd.getNomes();
						moedaDestinoSimbolo = usd.getSimbolo();
					}
				}
				if(entrada.getSelecaoMoedaOrigem() == 3) 
				{
					if(entrada.getSelecaoMoedaDestino() == 1){
						origemCambioDestino = jpy.getValorcambiobrl();
						moedaDestinoNome = brl.getNome();
						moedaDestinoNomes = brl.getNomes();
						moedaDestinoSimbolo = brl.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 2){
						origemCambioDestino = jpy.getValorcambioeur();
						moedaDestinoNome = eur.getNome();
						moedaDestinoNomes = eur.getNomes();
						moedaDestinoSimbolo = eur.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 3){
						origemCambioDestino = jpy.getValorcambiojpy();
						moedaDestinoNome = jpy.getNome();
						moedaDestinoNomes = jpy.getNomes();
						moedaDestinoSimbolo = jpy.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 4){
						origemCambioDestino = jpy.getValorcambiousd();
						moedaDestinoNome = usd.getNome();
						moedaDestinoNomes = usd.getNomes();
						moedaDestinoSimbolo = usd.getSimbolo();
					}
				}
				if(entrada.getSelecaoMoedaOrigem() == 4) 
				{
					if(entrada.getSelecaoMoedaDestino() == 1){
						origemCambioDestino = usd.getValorcambiobrl();
						moedaDestinoNome = brl.getNome();
						moedaDestinoNomes = brl.getNomes();
						moedaDestinoSimbolo = brl.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 2){
						origemCambioDestino = usd.getValorcambioeur();
						moedaDestinoNome = eur.getNome();
						moedaDestinoNomes = eur.getNomes();
						moedaDestinoSimbolo = eur.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 3){
						origemCambioDestino = usd.getValorcambiojpy();
						moedaDestinoNome = jpy.getNome();
						moedaDestinoNomes = jpy.getNomes();
						moedaDestinoSimbolo = jpy.getSimbolo();
					}
					if(entrada.getSelecaoMoedaDestino() == 4){
						origemCambioDestino = usd.getValorcambiousd();
						moedaDestinoNome = usd.getNome();
						moedaDestinoNomes = usd.getNomes();
						moedaDestinoSimbolo = usd.getSimbolo();
					}
				}
				
//				System.out.println("Moeda de Origem Selecionada: " + entrada.getSelecaoMoedaOrigem());
//				System.out.println("Quantidade da Moeda de Origem Selecionada: " + entrada.getOrigemQuantidade());
//				System.out.println("Moeda de Destino Selecionada: " + entrada.getSelecaoMoedaDestino());
//				System.out.println("O Valor do Cambio de Destino é de: " + origemCambioDestino);
			
			Calculo calculo = new Calculo();
				
				calculo.setCalculoConversao(entrada.getOrigemQuantidade(), origemCambioDestino);
				
			Saida saida = new Saida();
			
				saida.setSaida(moedaOrigemSimbolo, entrada.getOrigemQuantidade(), moedaOrigemNomes, moedaDestinoSimbolo, calculo.getCalculoConversao(), moedaDestinoNomes);

	}
}