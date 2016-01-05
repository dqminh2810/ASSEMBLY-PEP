package mne;

import mne.Mne;


public class ORR extends Mne {
    private final String associatedMne="0100001100";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}