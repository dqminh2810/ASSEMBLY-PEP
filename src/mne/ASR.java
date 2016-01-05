package mne;

import mne.Mne;


public class ASR extends Mne {
    private final String associatedMne="0100000100";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt);
        return finalHex;
    }
}