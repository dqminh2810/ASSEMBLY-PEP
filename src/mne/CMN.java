package mne;

import mne.Mne;


public class CMN extends Mne {
    private final String associatedMne="0100001011";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt);
        return finalHex;
    }
}