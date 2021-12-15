package com.utsmani.workbody

import okhttp3.OkHttpClient;
import okhttp3.Request


val client = OkHttpClient()

val request = Request.Builder()
    .url("https://exercisedb.p.rapidapi.com/exercises")
    .get()
    .addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com")
    .addHeader("x-rapidapi-key", "9e79f5f7a8mshb11af780fad9f18p1c4ebdjsn1da52421db86")
    .build()

val response = client.newCall(request).execute();
