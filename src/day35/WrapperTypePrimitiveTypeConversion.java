package day35;

public class WrapperTypePrimitiveTypeConversion {

    public static int getYearOutOfCaseNumber (String caseNumber){
        return Integer.parseInt(caseNumber.substring(3,7));
        // TODO: Case number should always start with either
        //   CBM, IPR, PGT, DER
        //   Followed by 4 digit number
        //   Followed by --
        //   and followed by 5 digit.
    }

    public static void main(String[] args) {
        System.out.println(getYearOutOfCaseNumber("DER2019-0034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01045"));
    }
}
