package mne;

import mne.Mne;


public class STR extends Mne {
    private final String associatedMne="0101000";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt);
        return finalHex;
    }
}