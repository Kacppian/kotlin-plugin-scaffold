package com.example.dittoFeedSdk

import android.content.Context

object DittoFeed {

    private val apikey: String

    init {
        apikey = "asd"
    }

    /*
        This is a function to initialize the sdk.
    */
    fun initialize() {}

    /*
        This is a function to pass identity attributes of a user to segment later on.
    */
    fun identify() {}

    /*
        This is a function to track events performed by the user.
    */
    fun track() {}

    /*
        This is a function to track screens visited by the user.
    */
    fun screen() {}

    /*
        This is a function to request for push notification permission from the user.
    */
    fun promptForPushNotifications() {}


    /*
        This is a function to flush all the events and clear the queue.
    */
    fun flush() {}
}