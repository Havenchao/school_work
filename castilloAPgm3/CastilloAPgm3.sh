#! /bin/sh
#     ********************************************************************
#       Author    : Andrew Castillo
#       Course    : OS2
#       Professor : Michael Robinson 
#       Program # : pgm3 
#                   Divides by two numbers and parses hs file.
#                
#       #Due Date  : 10/31/2019 
#                 
#       Certification: 
#       I hereby certify that this work is my own 
#       and none of it is the work of any other person. 
#             
#     *********************************************************************

echo "Andrew Castillo `date`" >> result.txt
echo "Division Calculator App"
echo "Enter 44 on either first number or second number to exit application when asked."

while true

do 
    echo "Enter first number: "
    read firstNumber

    if [ $firstNumber -eq 44 ]; then 
        break
    fi

    echo "Enter second number: "
    read secondNumber

    if [ $secondNumber -eq 44 ];
    then
        break
    fi
    

    if [ $secondNumber -eq 0 ];
    then 
    
    while [ $secondNumber -eq 0 ]
    do
        echo "You cannot divide by zero. Please try again. "
        echo "Enter second number: "
	read secondNumber
    done
    fi

    if [ $secondNumber -eq 44 ];
    then
       break
    fi
	
    if [ $secondNumber -ne 0 ];
    then
    val=`expr $firstNumber / $secondNumber`
    echo "$firstNumber divided by $secondNumber is $val"
    echo "$firstNumber divided by $secondNumber is $val" >> result.txt
    fi

done

echo "Total amount of substring ACGT in the first 1,995 lines of file hs_alt_HuRef_chr10.fa are: `head -1995 hs_alt_HuRef_chr10.fa | grep ACGT -o | wc -l`"
echo "Total amount of substring ACGT in the first 1,995 lines of file hs_alt_HuRef_chr10.fa are: `head -1995 hs_alt_HuRef_chr10.fa | grep ACGT -o | wc -l`" >> result.txt
