package mne;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public abstract class Mne {
    public abstract String parse(String mne, String opt);

    protected String parseOpts(String[] opts){
        String finalHex = "";

        for (String operande : opts){
            if (operande.startsWith("R")){
            
                finalHex=finalHex+String.format("%3s", Integer.toBinaryString(3)).replace(' ', '0');
            }else if (operande.startsWith("#")){
                finalHex=finalHex+Integer.toBinaryString(12);
            }
        }

        return finalHex;
    }
}
