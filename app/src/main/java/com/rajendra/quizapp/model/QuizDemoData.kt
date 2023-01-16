package com.rajendra.quizapp.model

import com.rajendra.quizapp.constants.Constants.IS_CHECK_BOX
import com.rajendra.quizapp.constants.Constants.IS_RADIO_BUTTON

class QuizDemoData {

    companion object {
        fun getQuizQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "Q 1 - What is Pending Intent in android?",
                    IS_RADIO_BUTTON,
                    "Pending Intent is fired or triggered at a future point of time.",
                    "c",
                    "It will fire at a future point of time.",
                    "",
                    "",
                    mutableListOf(
                        "It is a kind of an intent.",
                        "It is used to pass the data between activities.",
                        "It will fire at a future point of time.",
                        "None of the Above."
                    )
                ),
                Quiz(
                    2,
                    "Q 2 - What is the life cycle of foreground activity in android?",
                    IS_RADIO_BUTTON,
                    "Foreground activity should be onCreate() −> onStart() −> onResume() in activity life cycle.",
                    "c",
                    "onCreate() −> onStart() −> onResume()",
                    "",
                    "",
                    mutableListOf(
                        "onCreate() −> onStart() −> onResume() −> onStop() −> onRestart",
                        "onCreate() −> onStart() −> onResume() −>onStop()",
                        "onCreate() −> onStart() −> onResume()",
                        "None of the above"
                    )
                ),
                Quiz(
                    3,
                    "Q 3 - What is fragment in android?",
                    IS_RADIO_BUTTON,
                    "Fragment is a piece of an activity. If you want to move your application in 360 degrees, you can do this by using a fragment.",
                    "b",
                    "Piece of Activity",
                    "",
                    "",
                    mutableListOf("JSON", "Piece of Activity", "Layout", "None of Above")
                ),
                Quiz(
                    4,
                    "Q 4 - Is it possible activity without UI in android?",
                    IS_RADIO_BUTTON,
                    "Without UI, we can call an activity, It will do some background functionalities.",
                    "b",
                    "Yes,it's possible",
                    "",
                    "",
                    mutableListOf(
                        "No, it's not possible",
                        "Yes,it's possible",
                        "We can't say",
                        "None of the above"
                    )
                ),
                Quiz(
                    5,
                    "Q 5 - How to get current location in android?",
                    IS_RADIO_BUTTON,
                    "GPRS and Location provider is used to fetch the current location of a phone as longitude and latitude.",
                    "c",
                    "A & B",
                    "",
                    "",
                    mutableListOf(
                        "Using with GPRS",
                        "Using location provider",
                        "A & B",
                        "SQlite",
                        "Network servers"
                    )
                ),
                Quiz(
                    6,
                    "Q 6 - How many applications are there in a given task in android?",
                    IS_RADIO_BUTTON,
                    "The task is a collaboration of applications. It contains one or more applications in it.",
                    "c",
                    "Many",
                    "",
                    "",
                    mutableListOf(
                        "Two",
                        "One",
                        "Many",
                        "Zero"
                    )
                ),
                Quiz(
                    7,
                    "Q 7 - What does API stand for?",
                    IS_RADIO_BUTTON,
                    "API stands for application program interface. It is a set of routines, protocols, and tools for building software and applications.",
                    "a",
                    "Application Programming Interface",
                    "",
                    "",
                    mutableListOf(
                        "Application Programming Interface",
                        "Android Programming Interface",
                        "Android Page Interface",
                        "Application Page Interface"
                    )
                ),
                Quiz(
                    8,
                    "Q 8 - How can we kill an activity in android?",
                    IS_CHECK_BOX,
                    "The finish() method is used to close the activity. Whereas the finishActivity(int requestCode) also closes the activity with requestCode.",
                    "ab",
                    "Using finish() method\nUsing finishActivity(int requestCode)",
                    "",
                    "",
                    mutableListOf(
                        "Using finish() method",
                        "Using finishActivity(int requestCode)",
                        "Neither (a) nor (b)"
                    )
                ),
                Quiz(
                    9,
                    "Q 9 - What does httpclient.execute() returns in android?",
                    IS_CHECK_BOX,
                    "Httpclient.execute() executes only once and it will return http response from the server or device, Http entity is embedded the body of the Http response.",
                    "b",
                    "Http response",
                    "",
                    "",
                    mutableListOf(
                        "Http entity",
                        "Http response",
                        "Http result",
                        "Http Client"
                    )
                ),
                Quiz(
                    10,
                    "Q 10 - Which of the following is not an activity lifecycle callback method?",
                    IS_RADIO_BUTTON,
                    "onBackPressed() method is not an activity lifecycle callback method",
                    "d",
                    "onBackPressed() method",
                    "",
                    "",
                    mutableListOf(
                        "onClick() method",
                        "onCreate() method",
                        "onStart() method",
                        "onBackPressed() method"
                    )
                ),
                Quiz(
                    11,
                    "Q 11 - Which of the following is a dialog class in android?",
                    IS_CHECK_BOX,
                    "All of the above are Dialog classes",
                    "abc",
                    "AlertDialog\nDatePicker Dialog\nProgressDialog",
                    "",
                    "",
                    mutableListOf("AlertDialog", "DatePicker Dialog", "ProgressDialog")
                ),
                Quiz(
                    12,
                    "Q 12 - Which of the following android component displays the part of an activity on screen?",
                    IS_RADIO_BUTTON,
                    "Android Fragment is the part of activity; it is also known as sub-activity. There can be more than one fragment in an activity. Fragments represent multiple screens inside one activity.",
                    "d",
                    "Fragment",
                    "",
                    "",
                    mutableListOf("View", "Manifest", "Gradle", "Fragment")
                ),
                Quiz(
                    13,
                    "Q 13 - Which of the following is the parent class of Activity?",
                    IS_RADIO_BUTTON,
                    "The android Activity is the subclass of ContextThemeWrapper class. Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. An activity is a single screen in android. It is like a window or frame of Java.",
                    "c",
                    "contextThemeWrapper",
                    "",
                    "",
                    mutableListOf("context", "object", "contextThemeWrapper", "None of the above")
                ),
                Quiz(
                    14,
                    "Q 14 - Which of the following features are updated in Android 4.1(Jelly Bean)?",
                    IS_CHECK_BOX,
                    "Android 4.1(Jelly Bean) updates to following features: smoother user interface, enhance accessibility, expandable notification, fixed bug on Nexus 7, one-finger gestures to expand/collapse notifications, lock screen improvement, multiple user accounts (tablets only), new clock application, Bluetooth low energy support, volume for incoming call, 4K resolution support, native emoji support, bug fixes for the Nexus 7 LTE.",
                    "abc",
                    "User Interface\nLock screen improvement\nNew clock application",
                    "",
                    "",
                    mutableListOf(
                        "User Interface",
                        "Lock screen improvement",
                        "New clock application"
                    )
                ),
                Quiz(
                    15,
                    "Q 15 - Which of the following method is used by services to clean up any services?",
                    IS_RADIO_BUTTON,
                    "The onDestroy() method can be used by services to clean up any resources like receivers, threads, registered listeners, etc.",
                    "c",
                    "onDestroy() method",
                    "",
                    "",
                    mutableListOf(
                        "onStop() method",
                        "stopService() method",
                        "onDestroy() method",
                        "stopSelf() method"
                    )
                )
            )
        }
    }
}