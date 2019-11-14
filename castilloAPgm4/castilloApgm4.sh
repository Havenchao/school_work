  <<ID
  ************************************************** 
  Author   : Andrew Castillo 
  Course   : Operating Systems 3 6:25 pm
  Professor: Michael Robinson 
  Program  : pgm4, Purpose/Description 
             Append to the above file the necessary commands that when this file is executed 
             it will display the following
  Due Date : 11/14/2019 

  I certify that this work is my own alone. 
  **************************************************
ID

echo Hello my name is: Andrew Castillo
echo My user name is: `whoami`
echo Todays date and time is: `date`
echo This file has `wc -l < castilloApgm4.sh` lines
echo This file has `wc -w < castilloApgm4.sh` words
echo This file has `wc -c < castilloApgm4.sh` bytes
echo Please enter any number: 
read num
#solution=`expr $num \* 2`
echo "Your number $num * 2 = $(( $num*2 ))"
echo press any key to continue
read key
clear
echo Enter a line of numbers 
read nums
sum=0
for i in $nums
do
echo $i
sleep 1
(( sum += $i))
done
echo $nums = $sum
while true
do
echo Enter number
read num
if [ $(( $num % 5 )) -eq 0 ]
then
echo Found the number!
echo $num % 5 = 0
break
fi
done
