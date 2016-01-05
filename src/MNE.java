import mne.ADD;
import mne.SUB;
import mne.AND;
import mne.EOR;
import mne.LSL;
import mne.LSR;
import mne.ASR;
import mne.ADC;
import mne.SBC;
import mne.ROR;
import mne.TST;
import mne.Cmp;
import mne.CMN;
import mne.ORR;
import mne.BIC;
import mne.MVN;
import mne.STR;
import mne.STRH;
import mne.STRB;
import mne.LDRSB;
import mne.LDR;
import mne.LDRH;
import mne.LDRB;
import mne.LDRSH;



import mne.Mne;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public enum MNE {
    ADD(ADD.class),
    SUB(SUB.class),
    AND(AND.class),
    EOR(EOR.class),
    LSL(LSL.class),
    LSR(LSR.class),
    ASR(ASR.class),
    ADC(ADC.class),
    ROR(ROR.class),
    TST(TST.class),
    CMP(Cmp.class),
    CMN(CMN.class),
    ORR(ORR.class),
    BIC(BIC.class),
    MVN(MVN.class),
    STR(STR.class),
    STRH(STRH.class),
    STRB(STRB.class),
    LDRSB(LDRSB.class),
    LDR(LDR.class),
    LDRH(LDRH.class),
    LDRB(LDRB.class),
    LDRSH(LDRSH.class);

    private String hex;
    MNE(String s) {
        hex=s;
    }

    private Class associatedClass;
    MNE(Class associatedClass) {
        this.associatedClass=associatedClass;
    }

    public String getHex() {
        return hex;
    }

    public Class getAssociatedClass() {
        return associatedClass;
    }
}
