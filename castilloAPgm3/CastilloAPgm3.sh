#! /bin/sh
#     ********************************************************************
#       Author    : Andrew Castillo
#       Course    : OS2
#       Professor : Michael Robinson 
#       Program # : pgm3 
#                   { A brief description of the program }
#                
#       #Due Date  : 03/25/2019 
#                 
#       Certification: 
#       I hereby certify that this work is my own and none of it is the work of 
#        any other person. 
#             
#     *********************************************************************

echo "Andrew Castillo `date`" >> result.txt
echo "Division Calculator App"
echo "Enter 99 on either first number or second number to exit application."

while true

do 
    echo "Enter first number: "
    read firstNumber

    if [ $firstNumber -eq 99 ]; then 
        break
    fi

    echo "Enter second number: "
    read secondNumber

    if [ $secondNumber -eq 99 ];
    then
        break
    fi
    
    if [ $secondNumber -eq 0 ];
    then 
        echo "You cannot divide by zero. Enter second number: "
        read secondNumber
        val=`expr $firstNumber / $secondNumber`
        echo "$firstNumber divided by $secondNumber is $val"
        echo "$firstNumber divided by $secondNumber is $val" >> result.txt
    else
        val=`expr $firstNumber / $secondNumber`
        echo "$firstNumber divided by $secondNumber is $val"
        echo "$firstNumber divided by $secondNumber is $val" >> result.txt
    fi

done

echo "Total amount of substring TTT in the first 2,000 lines of file hs_alt_HuRef_chr10.fa are: `head -2000 hs_alt_HuRef_chr10.fa | grep TTT -o | wc -l`"
echo "Total amount of substring TTT in the first 2,000 lines of file hs_alt_HuRef_chr10.fa are: `head -2000 hs_alt_HuRef_chr10.fa | grep TTT -o | wc -l`" >> result.txt
