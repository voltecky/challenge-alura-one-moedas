import java.util.Scanner;

public class Entrada 
{
	private int selecaoMoedaOrigem;
	private int selecaoMoedaDestino;
	private double moedaOrigemQuantidade;
	
	Scanner sc = new Scanner(System.in);
	
	protected void setSelecaoMoedaOrigem(String nomesBrl, String nomesEur, String nomesJpy, String nomesUsd)
	{
		
		System.out.println("Conversor de Moeda");
		System.out.println("Escolha a moeda de origem: ");
		
		while (selecaoMoedaOrigem != 1 && selecaoMoedaOrigem != 2 && selecaoMoedaOrigem != 3 && selecaoMoedaOrigem != 4 ) 
		{
			System.out.println("Digite 1 para " + nomesBrl);
			System.out.println("Digite 2 para " + nomesEur);
			System.out.println("Digite 3 para " + nomesJpy);
			System.out.println("Digite 4 para " + nomesUsd);
			
			this.selecaoMoedaOrigem = sc.nextInt();
		}
	}
	
	public int getSelecaoMoedaOrigem() {
		return selecaoMoedaOrigem;
	}

	protected void setMoedaOrigemQuantidade(String nomesBrl, String simboloBrl, String nomesEur, String simboloEur, String nomesJpy, String simboloJpy, String nomesUsd, String simboloUsd)
	{
		switch(selecaoMoedaOrigem) 
		{
			case 1: 
				System.out.println("Quantos " +  nomesBrl + " voce quer converter ?");
				System.out.print(simboloBrl + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
				
			case 2:
				System.out.println("Quantos " +  nomesEur + " voce quer converter ?");
				System.out.print(simboloEur + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
			case 3: 
				System.out.println("Quantos " +  nomesJpy + " voce quer converter ?");
				System.out.print(simboloJpy + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
			case 4: 
				System.out.println("Quantos " +  nomesUsd + " voce quer converter ?");
				System.out.print(simboloUsd + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
		}
	}
	
	public double getOrigemQuantidade() {
		return moedaOrigemQuantidade;
	}
	
	protected void setSelecaoMoedaDestino(String nomesBrl, String nomesEur, String nomesJpy, String nomesUsd)
	{
		
		switch (selecaoMoedaOrigem) {
			case 1:
				while (selecaoMoedaDestino != 2 && selecaoMoedaDestino != 3 && selecaoMoedaDestino != 4 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 2 para " + nomesEur);
					System.out.println("Digite 3 para " + nomesJpy);
					System.out.println("Digite 4 para " + nomesUsd);
					selecaoMoedaDestino = sc.nextInt();
				}
				break;
			case 2:
				while (selecaoMoedaDestino != 1 && selecaoMoedaDestino != 3 && selecaoMoedaDestino != 4 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 1 para " + nomesBrl);
					System.out.println("Digite 3 para " + nomesJpy);
					System.out.println("Digite 4 para " + nomesUsd);
					selecaoMoedaDestino = sc.nextInt();
				}
				break;
			case 3:
				while (selecaoMoedaDestino != 1 && selecaoMoedaDestino != 2 && selecaoMoedaDestino != 4 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 1 para " + nomesBrl);
					System.out.println("Digite 2 para " + nomesEur);
					System.out.println("Digite 4 para " + nomesUsd);
					selecaoMoedaDestino = sc.nextInt();
				}
				break;
			case 4:
				while (selecaoMoedaDestino != 1 && selecaoMoedaDestino != 2 && selecaoMoedaDestino != 3 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 1 para " + nomesBrl);
					System.out.println("Digite 2 para " + nomesEur);
					System.out.println("Digite 3 para " + nomesJpy);
					selecaoMoedaDestino = sc.nextInt();
				}
				break;
		}
	}
	
	public int getSelecaoMoedaDestino() {
		return selecaoMoedaDestino;
	}
}