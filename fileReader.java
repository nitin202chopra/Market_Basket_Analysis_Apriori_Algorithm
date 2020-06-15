import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileReader
 {

	//public static String readFile(String file_name, String encoding) 
	public static void readFile(String file_name, String encoding){
		File anyFile = new File(file_name);
		try {
			FileInputStream inStream = new FileInputStream(anyFile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					inStream, encoding));
			String line = new String();
			String text = new String();
			while ((line = reader.readLine()) != null)
			{
				text += line;
				System.out.println(text);
				text="";
			}
			reader.close();
			//System.out.println(text+"\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	return null;
	}

	// Read and input file based on file name and separator
	public static List<String[]> scanChart(String file_name,
			String separator, String encoding) {
		List<String[]> matrix = new ArrayList<String[]>();
		File anyFile = new File(file_name);
		try {
			FileInputStream inStream = new FileInputStream(anyFile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					inStream, encoding));
			String line = new String();
			while ((line = reader.readLine()) != null) {
				matrix.add(line.split(separator));
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return matrix;
	}

	public static void main(String[] args) 
{

		List<String[]> matrix = scanChart("ds6.txt", " ", "UTF-8");
		
		//for(int i=0;i<matrix.size();i++){
		System.out.println(matrix.size());

		//System.out.println(matrix.get(i).getName());}
		
		readFile("ds6.txt", "UTF-8");
		
	}

}
