package mne;

import mne.Mne;


public class STRB extends Mne {
    private final String associatedMne="0101010";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt);
        return finalHex;
    }
}