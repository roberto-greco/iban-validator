package com.roberto.iban.utils;

import java.util.HashMap;

import com.roberto.iban.utils.exception.CountryNotSupportedException;

public class IbanComposer {

    public static HashMap<String,String>  oddCharConversionTable;

    static {
        oddCharConversionTable = new HashMap<>();
        oddCharConversionTable.put("0","1");
        oddCharConversionTable.put("1","0");
        oddCharConversionTable.put("2","5");
        oddCharConversionTable.put("3","7");
        oddCharConversionTable.put("4","9");
        oddCharConversionTable.put("5","13");
        oddCharConversionTable.put("6","15");
        oddCharConversionTable.put("7","17");
        oddCharConversionTable.put("8","19");
        oddCharConversionTable.put("9","21");
        oddCharConversionTable.put("A","1");  
        oddCharConversionTable.put("B","0");  
        oddCharConversionTable.put("C","5");  
        oddCharConversionTable.put("D","7");  
        oddCharConversionTable.put("E","9");  
        oddCharConversionTable.put("F","13"); 
        oddCharConversionTable.put("G","15"); 
        oddCharConversionTable.put("H","17"); 
        oddCharConversionTable.put("I","19"); 
        oddCharConversionTable.put("J","21"); 
        oddCharConversionTable.put("K","2");
        oddCharConversionTable.put("L","4");
        oddCharConversionTable.put("M","18");
        oddCharConversionTable.put("N","20");
        oddCharConversionTable.put("O","11");
        oddCharConversionTable.put("P","3");
        oddCharConversionTable.put("Q","6");
        oddCharConversionTable.put("R","8");
        oddCharConversionTable.put("S","12");
        oddCharConversionTable.put("T","14");
        oddCharConversionTable.put("U","16");
        oddCharConversionTable.put("V","10");
        oddCharConversionTable.put("W","22");
        oddCharConversionTable.put("X","25");
        oddCharConversionTable.put("Y","24");
        oddCharConversionTable.put("Z","23");
    }

    public static HashMap<String,String>  evenCharConversionTable;

    static {
        evenCharConversionTable = new HashMap<>();
        evenCharConversionTable.put("0","0");
        evenCharConversionTable.put("1","1");
        evenCharConversionTable.put("2","2");
        evenCharConversionTable.put("3","3");
        evenCharConversionTable.put("4","4");
        evenCharConversionTable.put("5","5");
        evenCharConversionTable.put("6","6");
        evenCharConversionTable.put("7","7");
        evenCharConversionTable.put("8","8");
        evenCharConversionTable.put("9","9");
        evenCharConversionTable.put("A","0");
        evenCharConversionTable.put("B","1");
        evenCharConversionTable.put("C","2");
        evenCharConversionTable.put("D","3");
        evenCharConversionTable.put("E","4");
        evenCharConversionTable.put("F","5");
        evenCharConversionTable.put("G","6");
        evenCharConversionTable.put("H","7");
        evenCharConversionTable.put("I","8");
        evenCharConversionTable.put("J","9");
        evenCharConversionTable.put("K","10");
        evenCharConversionTable.put("L","11");
        evenCharConversionTable.put("M","12");
        evenCharConversionTable.put("N","13");
        evenCharConversionTable.put("O","14");
        evenCharConversionTable.put("P","15");
        evenCharConversionTable.put("Q","16");
        evenCharConversionTable.put("R","17");
        evenCharConversionTable.put("S","18");
        evenCharConversionTable.put("T","19");
        evenCharConversionTable.put("U","20");
        evenCharConversionTable.put("V","21");
        evenCharConversionTable.put("W","22");
        evenCharConversionTable.put("X","23");
        evenCharConversionTable.put("Y","24");
        evenCharConversionTable.put("Z","25");
    }

    public static HashMap<String,String>  itCinConversionTable;

    static {
        itCinConversionTable = new HashMap<>();
        itCinConversionTable.put("0","A");
        itCinConversionTable.put("1","B");
        itCinConversionTable.put("2","C");
        itCinConversionTable.put("3","D");
        itCinConversionTable.put("4","E");
        itCinConversionTable.put("5","F");
        itCinConversionTable.put("6","G");
        itCinConversionTable.put("7","H");
        itCinConversionTable.put("8","I");
        itCinConversionTable.put("9","J");
        itCinConversionTable.put("10","K");
        itCinConversionTable.put("11","L");
        itCinConversionTable.put("12","M");
        itCinConversionTable.put("13","N");
        itCinConversionTable.put("14","O");
        itCinConversionTable.put("15","P");
        itCinConversionTable.put("16","Q");
        itCinConversionTable.put("17","R");
        itCinConversionTable.put("18","S");
        itCinConversionTable.put("19","T");
        itCinConversionTable.put("20","U");
        itCinConversionTable.put("21","V");
        itCinConversionTable.put("22","W");
        itCinConversionTable.put("23","X");
        itCinConversionTable.put("24","Y");
        itCinConversionTable.put("25","Z");
    }

    public static HashMap<String,String>  euCinConversionTable;

    static {
        euCinConversionTable = new HashMap<>();
        euCinConversionTable.put("0","0");
        euCinConversionTable.put("1","1");
        euCinConversionTable.put("2","2");
        euCinConversionTable.put("3","3");
        euCinConversionTable.put("4","4");
        euCinConversionTable.put("5","5");
        euCinConversionTable.put("6","6");
        euCinConversionTable.put("7","7");
        euCinConversionTable.put("8","8");
        euCinConversionTable.put("9","9");
        euCinConversionTable.put("A","10");
        euCinConversionTable.put("B","11");
        euCinConversionTable.put("C","12");
        euCinConversionTable.put("D","13");
        euCinConversionTable.put("E","14");
        euCinConversionTable.put("F","15");
        euCinConversionTable.put("G","16");
        euCinConversionTable.put("H","17");
        euCinConversionTable.put("I","18");
        euCinConversionTable.put("J","19");
        euCinConversionTable.put("K","20");
        euCinConversionTable.put("L","21");
        euCinConversionTable.put("M","22");
        euCinConversionTable.put("N","23");
        euCinConversionTable.put("O","24");
        euCinConversionTable.put("P","25");
        euCinConversionTable.put("Q","26");
        euCinConversionTable.put("R","27");
        euCinConversionTable.put("S","28");
        euCinConversionTable.put("T","29");
        euCinConversionTable.put("U","30");
        euCinConversionTable.put("V","31");
        euCinConversionTable.put("W","32");
        euCinConversionTable.put("X","33");
        euCinConversionTable.put("Y","34");
        euCinConversionTable.put("Z","35");
    }

    public String calculateBBAN(String countryCode, String abi, String cab,String account) throws CountryNotSupportedException, Exception
    {

        if("IT".equalsIgnoreCase(countryCode)){
            return calculateITBBAN(abi,cab,account);
        }
        else if("IE".equalsIgnoreCase(countryCode)){
            return calculateIEBBAN(abi,cab,account);
        }
        else if("DE".equalsIgnoreCase(countryCode)){
            return calculateDEBBAN(abi,cab,account);
        }
        else if("AE".equalsIgnoreCase(countryCode)){
            return calculateAEBBAN(abi,cab,account);
        }
        else{
            throw new CountryNotSupportedException("country code not supported");
        }

    }

    private String calculateAEBBAN(String abi, String cab, String account) {
		// TODO Auto-generated method stub
		return null;
	}

	private String calculateITBBAN(String abi, String cab, String account) {

        String ibanConto=this.padLeftZeros(account,12);
        // 1 - calculate bban :
        String convString="*"+abi+cab+ibanConto;
        System.out.println("1 - calculate bban :  - calculate SUMe and SUMo");
        System.out.println("1 - calculate bban :  - converting string abi cab account: " +convString);
        int sumEven=0,  sumOdd=0;
        for(int i=1 ; i<convString.length();i++)
        {
            if(i%2==0) {
                System.out.println("even converted : "+convString.charAt(i)+" -> "+oddCharConversionTable.get(convString.substring(i, i+1)));
                // convString.substring(i, i);
                sumEven = sumEven + Integer.parseInt(evenCharConversionTable.get(convString.substring(i, i+1)));
            }
            else{
                System.out.println("odd converted : "+convString.charAt(i)+" -> "+oddCharConversionTable.get(convString.substring(i, i+1)));
                sumOdd = sumOdd + Integer.parseInt(oddCharConversionTable.get(convString.substring(i, i+1)));
            }
        }
        System.out.println("1 - calculate bban :  -  SUMe = "+sumEven);
        System.out.println("1 - calculate bban :  -  SUMo = "+sumOdd);
        int sumOE=sumEven+sumOdd;
        System.out.println("1 - calculate bban :  -  SUMoe=SUMo+SUMe  = "+sumOE);
        int mod26=sumOE%26;
        System.out.println("1 - calculate bban :  -  SUMoe MOD26  = "+mod26);
        String itCin=itCinConversionTable.get(""+mod26);
        System.out.println("1 - calculate bban :  -  CIN IT  = "+itCin);
        String bban=convString.replace('*', itCin.charAt(0));
        System.out.println("1 - calculate bban :  -  BBAN = "+bban);
        return bban;
    }

    /**
     * 
     * Calculate IE BBAAN 
     * @param abi
     * @param cab
     * @param account
     * @return
     * @throws Exception
     */
    
    private String calculateIEBBAN(String abi, String cab, String account)throws Exception{

        try {
            if(4==abi.length()&&cab.length()<=6&&account.length()<=8){
                return abi+padLeftZeros(cab,6)+padLeftZeros(account,8);
            }
            else{
                throw new Exception("bank or branch or account length not vaild");
            }
        }
        catch(Exception e){
            throw e;
        }

    }
    
    
    private String calculateDEBBAN(String abi, String cab, String account)throws Exception{

        try {
            if(8==abi.length()&&account.length()<=10){
                return abi+padLeftZeros(account,10);
            }
            else{
                throw new Exception("bank or branch or account length not vaild");
            }
        }
        catch(Exception e){
            throw e;
        }

    }



    public String calculateIBAN(String countryCode, String bban) {

        System.out.println("2 - calculate iban :  -  applying alg iso7064 ");
        String iso7064=bban+countryCode+"00";
        System.out.println("2 - calculate iban :  -  iso7064 string :"+iso7064 + " length :"+iso7064.length());

        int arrayLength=iso7064.length()/9;
        int reminder=iso7064.length()%9;
        System.out.println("reminder: "+reminder);
        if (reminder>0){arrayLength=arrayLength+1;}
        System.out.println("arrayLength: "+arrayLength);

        String[] iso7064split =new String[arrayLength];
        for(int l=1; l<=arrayLength;l++) {
            if(l<arrayLength)
            {
                iso7064split[l-1] = iso7064.substring((l-1)*9, (l*9));
                System.out.println("2 - calculate iban :  -  iso7064 split" +(l-1)+" :"+iso7064split[l-1] + " length :"+iso7064split[l-1].length());
            }
            else
                {   iso7064split[l-1] = iso7064.substring((l-1)*9, (l*9)-reminder-1);
                    System.out.println("2 - calculate iban :  -  iso7064 split" +(l-1)+" :"+iso7064split[l-1] + " length :"+iso7064split[l-1].length());
                }


        }

        long calcMod97=0L;
        String mod97="0";
        for (int j=0;j< iso7064split.length;j++)
        {
            StringBuilder buffer=new StringBuilder();
            System.out.println("2 - calculate iban :  -  iso7064 split" +(j+1) +" original (string):"+ mod97+iso7064split[j]);
            for (int k=0;k<iso7064split[j].length();k++)
            {
                buffer.append(euCinConversionTable.get(iso7064split[j].substring(k,k+1)));
            }
            mod97=mod97+ buffer;
            long inMod97=Long.parseLong(mod97);
            System.out.println("2 - calculate iban :  -  iso7064 split" +(j+1) +" mod97 to be calculated (string):"+ mod97);
            System.out.println("2 - calculate iban :  -  iso7064 split" +(j+1) +" mod97 to be calculated (long):"+ inMod97);
            calcMod97=inMod97% 97L;
            System.out.println("2 - calculate iban :  -  iso7064 split" +(j+1) +" mod97 :"+ calcMod97);
            mod97=""+calcMod97;
        }
        long calcCin=98L-calcMod97;
        System.out.println("2 - calculate iban : -  CIN = 98 - mod97 -> 98 - "+ mod97 +"= "+calcCin );
        String finalIban= countryCode+calcCin+bban;

        System.out.println("2 - calculate iban : -  IT IBAN = "+finalIban );

        return finalIban;

    }


    public String padLeftZeros(String inputAccn, int position) {
        if (inputAccn.length() >= position) {
            return inputAccn;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < position - inputAccn.length()) {
            sb.append('0');
        }
        sb.append(inputAccn);

        return sb.toString();
    }
//  public static void main(String[] args) {
//  String abi="AIBK";
//  String cab="931152";
//  String conto="12345678";
//
//  IbanComposer ic= new IbanComposer();
//  try {
//      String bban=ic.calculateBBAN("IE",abi,cab,conto);
//      String iban=ic.calculateIBAN("IE", bban);
//      System.out.println("abi:" + abi+ ", cab: "+cab+", conto: "+conto+", country: IE ---> iban:" +iban);
//  }
//  catch (Exception e)
//  {
//      System.out.println("Main - exception caught: "+ e.getMessage());
//      e.printStackTrace();
//  }
//
//
//
//
//
//}
}
