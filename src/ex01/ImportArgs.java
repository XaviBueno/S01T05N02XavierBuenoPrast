package ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;

public class ImportArgs {
	
	
	private String fileProperties;
	
	public ImportArgs(String fileProperties) {
		this.fileProperties=fileProperties;
	}
	
	public Arguments getArgs() {
		
		String directori=".";
		boolean listRecurs=false;
		boolean dirToFile=false;
		String fileOut="";
				
		Properties argums=new Properties();
		try {
			
			argums.load(new FileReader(fileProperties));
			directori= argums.getProperty("directori").toString();
			if (directori==null||directori=="")
				directori=".";
	
			if( argums.getProperty("listRecurs").toString().equals("s") ){
				listRecurs=true;
				
			}
			fileOut=argums.getProperty("fileOut").toString();
			if((fileOut .contains(".txt"))) {
				dirToFile=true;
			}
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		
			
			File dir=new File(directori);
			Arguments args=new Arguments(dir , dirToFile, listRecurs,fileOut);
		return args;
		
		
	}

	
}
