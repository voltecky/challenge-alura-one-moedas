
public class Calculo {

	private double calculoConversao;
	
	public double getCalculoConversao() 
	{
		return calculoConversao;
	}
	
	public void setCalculoConversao(double origemQuantidade, double cambioDestino) 
	{
		this.calculoConversao = cambioDestino * origemQuantidade;

	}
}
