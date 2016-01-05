import mne.Mne;

import java.io.*;
import java.util.Scanner;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public class AssembleurFile {
    private String pathIn="res/easy.txt";
    private String pathOut="res/hex.txt";
    private int currentLine=0;

    public AssembleurFile() throws FileNotFoundException {
        this.currentLine=0;
    }

    public void process() throws IOException, IllegalAccessException, InstantiationException {
        LineNumberReader r = new LineNumberReader(new FileReader(pathIn));
        String l;

        while ((l = r.readLine()) != null) {
            Scanner s = new Scanner(l);
            while (s.hasNext()) {
                this.currentLine=r.getLineNumber();

                String mne=s.next();
                String opt=s.next();

                System.out.println("Line " + r.getLineNumber() + ": " + mne +" "+opt);

                write(((Mne)MNE.valueOf(mne).getAssociatedClass().newInstance()).parse(mne,opt));
            }
        }
    }

    private void write(String line) throws IOException {
        FileWriter writer = null;
        try{
            writer = new FileWriter(pathOut, true);
            writer.write(line,0,line.length());
            writer.append('\n');
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            if(writer != null){
                writer.close();
            }
        }
    }
}
