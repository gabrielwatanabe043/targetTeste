package targetTeste;

public class quartoTeste {
	public static void main(String[] args) {
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double outros = 19849.53;
		double valorTotal = SP + RJ + MG + ES + outros;
		double porcentagemTotal;
		double porceSP = (SP * 100) / valorTotal;
		System.out.printf("Faturamento de São Paulo representa %2f do total \n", porceSP);
		double porceRJ = (RJ * 100) / valorTotal;
		System.out.printf("Faturamento do Rio de Janeiro representa %2f do total \n", porceRJ);
		double porceMG = (MG * 100) / valorTotal;
		System.out.printf("Faturamento de São Paulo representa %2f do total \n", porceMG);
		double porceES = (ES * 100) / valorTotal;
		System.out.printf("Faturamento do Rio de Janeiro representa %2f do total \n", porceES);
		double porceOutros = (outros * 100) / valorTotal;
		System.out.printf("Faturamento do Rio de Janeiro representa %2f do total \n", porceOutros);
		porcentagemTotal = porceSP + porceRJ + porceMG + porceES + porceOutros;
		System.out.println(porcentagemTotal);

	}
}
