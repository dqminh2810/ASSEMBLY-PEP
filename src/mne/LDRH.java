package mne;

import mne.Mne;


public class LDRH extends Mne {
    private final String associatedMne="0101101";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}