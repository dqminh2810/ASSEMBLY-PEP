package mne;

import mne.Mne;


public class SBC extends Mne {
    private final String associatedMne="0100000110";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}