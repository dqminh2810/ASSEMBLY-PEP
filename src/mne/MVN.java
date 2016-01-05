package mne;

import mne.Mne;


public class MVN extends Mne {
    private final String associatedMne="0100001111";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt);
        
        return finalHex;
    }
}