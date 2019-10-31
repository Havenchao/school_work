     @echo off
     REM ********************************************************************
       REM Author    : Andrew Castillo 
       REM Course    : OS2
       REM Professor : Michael Robinson 
       REM Program # : PGM3
                   REM { A brief description of the program }
                
       REM Due Date  : MM/DD/YYYY 
                 
       REM Certification: 
       REM I hereby certify that this work is my own and none of it is the work of any other person. 
             
     REM *********************************************************************/

     echo "name: Andrew Castillo class name: Operating Systems section: PGM3"
     echo "name: Andrew Castillo class name: Operating Systems section: PGM3" >> result.txt
     
     :MAIN
     set /p firstNumber="Enter First Number: "
     
     if %firstNumber% == 22 (
         goto :EOF
     )

     set /p secondNumber="Enter Second Number: "
     
     if %secondNumber% == 22 (
         goto :EOF
     )

     if %secondNumber% == 0 (
		 echo "You can't divide by zero."
         goto :MAIN
     )  

     set /a "result=%firstNumber%/%secondNumber%"
     echo "%firstNumber% divided by %secondNumber% equals %result%"
     echo "%firstNumber% divided by %secondNumber% equals %result%" >> result.txt
     set /p stop="Press enter to continue..."
     goto :MAIN