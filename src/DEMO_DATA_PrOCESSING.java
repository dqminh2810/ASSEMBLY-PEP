package DEMO;

public class DEMO_DATA_PrOCESSING {
	enum Command{
		ADD("0001100") ,SUB("0001101"), 
		AND("0100000000"),EOR("0100000001"),LSL("0100000010"),LSR("0100000011"),ASR("0100000100"),ADC("0100000101"),SBC("0100000110"),ROR("0100000111"),TST("0100001000"),CMP("0100001010"),CMN("0100001011"),ORR("0100001100"),BIC("0100001110"),MVN("0100001111"),
		STR("0101000"),STRH("0101001"),STRB("0101010"),LDRSB("0101011"),LDR("0101100"),LDRH("0101101"),LDRB("0101110"),LDRSH("0101111");
		private String opcode, result, RmADD=null, RdADD=null, RnADD=null, ReADD;
		private int Rm, Rn, Rd;
		
		Command(String opcode){
			this.opcode=opcode;
		}
		public String getOpcode(){
			return opcode;
		}
		
		public String getRegiterADD(){
			if(Rm>=0 && Rm <=7 && Rn>=0 && Rn <=7 && Rd>=0 && Rd <=7){
				RmADD = String.format("%3s", Integer.toBinaryString(Rm)).replace(' ', '0');
				RnADD = String.format("%3s", Integer.toBinaryString(Rn)).replace(' ', '0');
				RdADD = String.format("%3s", Integer.toBinaryString(Rd)).replace(' ', '0');
				ReADD=(RmADD+RnADD+RdADD);
			}
			else
				System.out.println("ERROR RegADD!!!");
		
			return ReADD;
		}
		public String getResult(){
			result = (opcode + ReADD).substring(0, 15); 
			return result;
		}
	}
 	
	public static void main(String[] args){
		Command cm = Command.EOR;
		cm.Rm=6;
		cm.Rn=5;
		cm.Rd=3;
		cm.getRegiterADD();
		System.out.print(cm+": " );
		switch(cm){
		case ADD:  System.out.println(cm.getResult()); break;
		case SUB:  System.out.println(cm.getResult()); break;
		case AND:  System.out.println(cm.getResult()); break;
		case EOR:  System.out.println(cm.getResult()); break;  			//...
		}
	}
	
}
