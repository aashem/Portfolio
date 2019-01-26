import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanalista {

		private List<String> Sanat;
		
		public Sanalista(String filename) throws FileNotFoundException{
			this.Sanat = new ArrayList<String>();
			Scanner s = new Scanner(new File(filename));
			while (s.hasNext()) {
				Sanat.add(s.next());
			}
			s.close();
		}
		
		public List<String> annaSanat(){
			return Sanat;
		}
}
