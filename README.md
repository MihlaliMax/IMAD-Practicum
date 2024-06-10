*Weather App*

step 1
*Open up Android studio*
Enter the Weather App and run the Emulator​

step 2
*Splash screen​*
On this screen you will see the name of the  app on top​
My name and student number are on the screen​
The is a weather icon on the screen​
A start button that will go to the main screen when prompt​

​step 3
*Main screen​*
The screen will show the weather forecast of the week​
The button will send the user to the detailed view screen when prompt​

step 4
*Detailed screen​*
his screen will display detailed information for each day's temperature​
A full forecast ​
of the week is displayed
​
****************************************************************************************************************************************************************

start
   declaration
      num days
      num minTemps
      num maxTemps
      num conditions

      //loop to calculate the average temperature

        for each index i in minTemps
            totalTemp = totalTemp + (minTemps[i] + maxTemps[i]) / 2
        end for
     
      // parallel arrays for deatailed weather, loop displays the weather data

    for index = 0 To Size(days) - 1
        builder = builder + days[index] + ": min " + minTemps[index] + "°C, 
        max " + maxTemps[index] + "°C, " + conditions[index] + "\n"
    endfor
end
**********************************************************************************************************************************************

      github repository link
      
      https://github.com/VCCT-IMAD5112-2024-G1/Mihlali-Sizani_ST10438319_IMAD-Practicum.git
*************************************************************************************************************************************************
