package mne;

import mne.Mne;


public class STRH extends Mne {
    private final String associatedMne="0101001";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}