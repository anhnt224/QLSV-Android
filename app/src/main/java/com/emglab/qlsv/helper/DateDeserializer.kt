package com.emglab.qlsv.helper

import com.google.gson.JsonParseException
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonElement
import com.google.gson.JsonDeserializer
import java.lang.reflect.Type
import java.text.SimpleDateFormat
import java.util.*


class DateDeserializer : JsonDeserializer<Date> {

    @Throws(JsonParseException::class)
    override fun deserialize(element: JsonElement, arg1: Type, arg2: JsonDeserializationContext): Date? {
        val date = element.asString
        val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS")
        formatter.timeZone = TimeZone.getTimeZone("UTC")

        try {
            return formatter.parse(date)
        } catch (e: Exception) {
         //   System.err.println("Failed to parse Date due to:", e)
            return null
        }

    }
}