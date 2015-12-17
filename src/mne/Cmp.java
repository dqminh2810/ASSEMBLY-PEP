package mne;

/**
 * ASSEMBLY-PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public class Cmp extends Mne {
    private final String associatedMne="0100001010";

    @Override
    public String parse(String mne, String opt) {
        String[] tab=opt.split(",");

        System.out.println(tab.toString());

        return null;
    }
}
