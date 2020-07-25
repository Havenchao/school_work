package analyze;

import app.ExecutionInfo;
import java.util.ArrayList;

public class DataAnalyzer {

    // Constant String for formatting
    private static final String INDEX = "Index:";
    private static final String FIB_VALUE = "FibValue:";
    private static final String CALLS = "Calls:";
    private static final String EXPONENT = "Exponent:";
    private static final String FORMATTING = "%-8s%-5d%-11s%-10d%-8s%-11.0f%-9s%7.3f%n";

    private ArrayList<ExecutionInfo> data;

    public DataAnalyzer() {

        data = new ArrayList<>();
    }

    public ArrayList<ExecutionInfo> getData() {
        return data;
    }

    public void findGrowthRate() {
        System.out.println("");

        System.out.println("-------------------------------------------------");
        System.out.println("Data Analyzer Growth Rate");
        System.out.println("-------------------------------------------------");

        // your output format must match mine
        // look at the video for see the out format
        // the exponent value is e^x = total method class   
        // you need to find the x... do not over think it use the Math class 
        // YOU PUT YOUR CODE HERE
        data.forEach(info -> {
            System.out.printf(FORMATTING,
                    INDEX, info.getFibIndex(),
                    FIB_VALUE, info.getFibValue(),
                    CALLS, info.getTotalMethodCalls(),
                    EXPONENT, Math.log(info.getTotalMethodCalls()) / Math.log(Math.E));
        });
    }

}// end class
