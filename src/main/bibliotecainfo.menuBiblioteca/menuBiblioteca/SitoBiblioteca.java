package menuBiblioteca;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import bibliotecaInfo.Letterario;
import bibliotecaInfo.Libro;

public class SitoBiblioteca {
	
	private Map<String, Letterario> memo = new HashMap<String, Letterario>();
	
	public void ricercaCod(String Coduni) {
		Letterario lett = memo.get(Coduni);
		System.out.println(lett);
	};
	
	public void ricercaAnno(int AnnoPub) {
		memo.values().stream().filter(ele -> AnnoPub == ele.getAnnoPub()).forEach(ele -> System.out.println(ele));
	};
	
	public void ricercaAutore(String Autore) {
		memo.values().stream().filter(ele -> ele  instanceof Libro).
		map(ele -> (Libro)ele)
		.filter(ele -> Autore.equals(ele.getAutore()));
	};
	
	public void salvaFile() {
		File elem = new File("Archivio/archivio.txt");
		String dati = "";
		for(Letterario element : memo.values()) {
			dati += element.toString();
		} 
		try {
		FileUtils.writeStringToFile(elem, dati);
		} catch (IOException e) {
			e.printStackTrace();
		}
	};
	
	public void caricaFIle() {
		File elem = new File("Archivio/archivio.txt");
		try {
			String File = FileUtils.readFileToString(elem);
		} catch (IOException e) {
			e.printStackTrace();
		}
	};
	
	public void aggiungiElemento(Letterario ele) {
		memo.put(ele.getCoduni(), ele);
	};
	
	public void rimuoviElemento(String Coduni) {
		memo.remove(Coduni);
		System.out.println("hai eliminato il file in modo corretto");
	};

}
