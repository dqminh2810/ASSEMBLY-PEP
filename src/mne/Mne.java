package mne;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public abstract class Mne {
    public abstract String parse(String mne, String opt);

    protected String parseOpts(String opts){
        String finalHex = "";
        String RegisterADD = "";
        String s[]= opts.split(",");
        for (String operande : s){
            if (operande.startsWith("R")){ 
            	int RmADD = Integer.parseInt(operande.substring(1));			//récuperer l'adresse de chaque registre en décimal
            	int RnADD = Integer.parseInt(operande.substring(1));
            	int RdADD = Integer.parseInt(operande.substring(1));
            	if(RmADD>=0 && RmADD <=7 && RnADD>=0 && RnADD <=7 && RdADD>=0 && RdADD <=7){ 	//condition pour traverser  en binaire
            		RegisterADD = String.format("%3s", Integer.toBinaryString(RmADD)).replace(' ', '0');
            		finalHex=finalHex+RegisterADD;
            	}else{
    				System.out.println("ERROR RegisterADD!!!");
    				System.exit(0);
            	}
            }else if (operande.startsWith("#")){
                finalHex=finalHex+Integer.toBinaryString(12);
            }
        }

        return finalHex;
    }
}
