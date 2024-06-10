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

start
declaration
    // Parallel arrays for weather data
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    minTemps = [14, 13, 11, 12, 10, 10, 9]
    maxTemps = [25, 22, 18, 11, 15, 16, 13]

    function onCreate():
        // Set content view
        setContentView(R.layout.activity_main2)

        // Find views
        dailyButton = findButtonById(R.id.dailyButton)
        averageTemp = findTextViewById(R.id.averageTemp)

        // Calculate and display average temperature
        avgTemp = calculateAverageTemperature()
        averageTemp.text = "Average Temp: $avgTemp°C"

        // Set button click listener
        dailyButton.setOnClickListener:
            intent = createIntent(MainActivity3)
            startActivity(intent)

    function calculateAverageTemperature():
        totalTemp = 0
        for i in range(minTemps.size):
            totalTemp += (minTemps[i] + maxTemps[i]) / 2
        return totalTemp / days.size


// Main3Activity.kt
class Main3Activity:
    // Parallel arrays for detailed weather data
    days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    minTemps = [14, 13, 11, 12, 10, 10, 9]
    maxTemps = [25, 22, 18, 11, 15, 16, 13]
    conditions = ["sunny", "sunny", "Light rain", "cloudy", "Light rain", "raining", "cold"]

    function onCreate():
        // Set content view
        setContentView(R.layout.activity_main3)

        // Find view
        dailyWeatherDetails = findTextViewById(R.id.dailyWeatherDetails)

        // Display detailed weather information
        dailyWeatherDetails.text = getDetailedWeatherInfo()

    function getDetailedWeatherInfo():
        builder = StringBuilder()
        for i in range(days.size):
            builder.append("${days[i]}: min ${minTemps[i]}°C, max ${maxTemps[i]}°C, ${conditions[i]}\n")
        return builder.toString()


// AndroidManifest.xml
<manifest>
    <application>
        <activity android:name=".MainActivity3"></activity>
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
stop
