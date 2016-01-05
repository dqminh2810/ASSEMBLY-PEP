package mne;

import mne.Mne;


public class LDRSB extends Mne {
    private final String associatedMne="0101011";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt);
        return finalHex;
    }
}