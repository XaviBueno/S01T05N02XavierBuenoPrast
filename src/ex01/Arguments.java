package ex01;
import java.io.File;

/*
 * CLASSE ARGUMENTS
 * Classe per passar arguments
 * file: atribut que indica  el directori a llistar
 * listRecurs: atribut que indica llistar els subdirectoris
 *	dirToFile: true per tala de llistar el directori amb un arxiu
 * fileOut: arxiu on es llistarà el directori en cas de que dirToFile sigui true
 */
public class Arguments {
	//Atributes
	private File file; 
	private boolean listRecurs; 
	private boolean dirToFile; 
	private String fileOut; //
	
	//Constructor
	public Arguments(File file, boolean listRecurs, boolean dirToFile,String fileOut) {
		this.file =file;
		this.listRecurs= listRecurs;
		this.dirToFile=dirToFile;
		this.fileOut=fileOut;
		
	}
	
	//Getters
	public File getFile() {
		return file;
		
	}
	public String getFileOut() {
		return fileOut;
		
	}
	
	public boolean getListRecurs() {
		return listRecurs;
	}
	public boolean getDirToFile() {
		return dirToFile;
	}
	
}
