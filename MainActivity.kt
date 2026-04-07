package com.example.alarmmanagerreminderapp

import android.annotation.SuppressLint
import android.app.*
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var alarmManager: AlarmManager
    private lateinit var pendingIntent: PendingIntent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSet = findViewById<Button>(R.id.btnSet)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val btnReschedule = findViewById<Button>(R.id.btnReschedule)

        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

        val intent = Intent(this, AlarmReceiver::class.java)
        pendingIntent = PendingIntent.getBroadcast(
            this, 0, intent, PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        btnSet.setOnClickListener {
            showTimePicker()
        }

        btnCancel.setOnClickListener {
            alarmManager.cancel(pendingIntent)
        }

        btnReschedule.setOnClickListener {
            showTimePicker()
        }
    }

    @SuppressLint("ScheduleExactAlarm")
    private fun showTimePicker() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePicker = TimePickerDialog(this,
            { _, selectedHour, selectedMinute ->

                val setCalendar = Calendar.getInstance()
                setCalendar.set(Calendar.HOUR_OF_DAY, selectedHour)
                setCalendar.set(Calendar.MINUTE, selectedMinute)
                setCalendar.set(Calendar.SECOND, 0)

                alarmManager.setExact(
                    AlarmManager.RTC_WAKEUP,
                    setCalendar.timeInMillis,
                    pendingIntent
                )

            }, hour, minute, true)

        timePicker.show()
    }
}
