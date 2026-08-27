# Experiment 1: HelloWorld App

An Android application that displays a welcoming greeting to the learner using Kotlin and ConstraintLayout.

## Features
- Displays greeting containing the learner's name.
- Centered card view layout using Material Design.

## Setup Instructions
1. Launch Android Studio.
2. Go to **File -> Open...** and select this directory (`01_HelloWorld`).
3. Android Studio will automatically configure the project and fetch Gradle wrapper settings.
4. Open [MainActivity.kt](app/src/main/java/com/example/helloworld/MainActivity.kt) and replace `"John Doe"` with your actual name.
5. Connect your android device or start an Emulator.
6. Click the **Run** button (green play icon) in the toolbar.


## Learning Evaluation Tasks

To evaluate your understanding of layouts and basic UI components, try implementing the following:
1. **Dynamic Student Details**: Modify the application layout to display your Department Name and Roll Number inside a secondary CardView, loading the values from `strings.xml`.
2. **Interactive Greet Button**: Add a Button saying "Refresh Greeting" below the main card. When clicked, update the text to show the greeting along with the current system time (e.g., "Hello John Doe! (Refreshed at 14:35:08)").
