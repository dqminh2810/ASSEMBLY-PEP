package mne;

import mne.Mne;


public class LSR extends Mne {
    private final String associatedMne="0100000011";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}