package targetTeste;

import java.util.ArrayList;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class terceiroTeste {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<Double> arrayDouble = new ArrayList<Double>();
		double totalarray;
		String finalString;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			try {
				org.w3c.dom.Document doc = builder.parse("C:\\Users\\gabri\\dadostarget.xml");

				NodeList lista = doc.getElementsByTagName("row");

				int tamanhoLista = lista.getLength();
				for (int i = 0; i < tamanhoLista; i++) {
					Node noNegocicao = lista.item(i);
					if (noNegocicao.getNodeType() == Node.ELEMENT_NODE) {
						Element elementoNegociacao = (Element) noNegocicao;

						NodeList listaDeFilhos = elementoNegociacao.getChildNodes();
						int tamanhoListaFilhos = listaDeFilhos.getLength();
						for (int j = 0; j < tamanhoListaFilhos; j++) {
							Node nofilho = listaDeFilhos.item(j);
							if (nofilho.getNodeType() == Node.ELEMENT_NODE) {
								Element elementoFilho = (Element) nofilho;
								if (elementoFilho.getTagName().equals("valor")) {
									array.add(elementoFilho.getTextContent());
								
								}
								System.out.println(array);
							}
						}
					}

				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
