 @echo off
     REM ********************************************************************
       REM Author    : Andrew Castillo 
       REM Course    : OS3
       REM Professor : Michael Robinson 
       REM Program # : PGM3
                   REM { A brief description of the program }
                
       REM Due Date  : 11/14/2019
                 
       REM Certification: 
       REM I hereby certify that this work is my own and none of it is the work of any other person. 
             
     REM *********************************************************************/
	 	 
	 for /l %%i in (1,1,10) do (
		set /a cal=%%i %% 6 + 2
	 )
	 echo %cal% >> result.txt
	 
	 mkdir pgm4
	 cd pgm4
	 echo one.txt
	 echo REM Andrew Castillo >> one.txt
	 echo %USERNAME% >> one.txt
	 echo. >> one.txt