package mne;

import java.util.Arrays;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public class Add extends Mne {
    private final String associatedMne="0001100";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt.split(","));

        return finalHex;
    }
}
