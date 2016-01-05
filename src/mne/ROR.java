package mne;

import mne.Mne;


public class ROR extends Mne {
    private final String associatedMne="0100000111";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}