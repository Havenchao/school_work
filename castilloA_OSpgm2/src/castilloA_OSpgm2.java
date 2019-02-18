import java.io.*;

public class castilloA_OSpgm2 {

    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(castilloA_OSpgm2.class.getResourceAsStream ("/resources/RAMerrors8x4c.txt"));
        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(is);
            String readLine = null;
            while((readLine = bufferedReader.readLine()) != null){
                System.out.printf("%s","Binary: ");
                System.out.printf("%s%n", convertHexToBinary(readLine));
                System.out.printf("%s ", "Decimal: ");
                System.out.printf("%s%n",convertBinaryToDecimal(convertHexToBinary(readLine)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(bufferedReader != null){
                    bufferedReader.close();
                }

                if(is != null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String convertHexToBinary(String hex) {
        String hexUpper = hex.toUpperCase();
        String result = "";
        String binVal;
        for (int i = 0; i < hexUpper.length(); i++) {
            char hexChar = hexUpper.charAt(i);

            switch (hexChar) {
                case ('0'):
                    binVal = "0000";
                    break;
                case ('1'):
                    binVal = "0001";
                    break;
                case ('2'):
                    binVal = "0010";
                    break;
                case ('3'):
                    binVal = "0011";
                    break;
                case ('4'):
                    binVal = "0100";
                    break;
                case ('5'):
                    binVal = "0101";
                    break;
                case ('6'):
                    binVal = "0110";
                    break;
                case ('7'):
                    binVal = "0111";
                    break;
                case ('8'):
                    binVal = "1000";
                    break;
                case ('9'):
                    binVal = "1001";
                    break;
                case ('A'):
                    binVal = "1010";
                    break;
                case ('B'):
                    binVal = "1011";
                    break;
                case ('C'):
                    binVal = "1100";
                    break;
                case ('D'):
                    binVal = "1101";
                    break;
                case ('E'):
                    binVal = "1110";
                    break;
                case ('F'):
                    binVal = "1111";
                    break;
                default:
                    binVal = "invalid input";
                    break;
            }
            result += binVal;
        }
        return result;
    }

    public static int convertBinaryToDecimal(String binary){
        char[] bit = binary.toCharArray();
        int results = 0;
        int count = 0;
        for(int i = binary.length() - 1;  i >= 0; i--){
            if(bit[i] == '1'){
                results += (int) Math.pow(2, count);
                count++;
            }
        }
        return results;
    }
}