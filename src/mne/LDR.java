package mne;

import mne.Mne;


public class LDR extends Mne {
    private final String associatedMne="0101100";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}