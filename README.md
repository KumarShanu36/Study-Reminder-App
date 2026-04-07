# 📱 Study Reminder App (Android - Kotlin)

> A simple yet powerful Android application that helps users schedule study reminders using AlarmManager, ensuring productivity and consistency.

---

## ✨ Features

* ⏰ **Set Reminder at Specific Time**
  Users can select a custom time using a clock interface (TimePickerDialog).

* 🔔 **Notification Alert**
  Displays a notification when the alarm is triggered.

* 🔁 **Reschedule Reminder**
  Easily set a new time for the reminder.

* ❌ **Cancel Reminder**
  Stop any scheduled reminder instantly.

* 📲 **Tap Notification Action**
  Opens the app screen when the notification is clicked.

---

## 🛠️ Tech Stack

* **Language:** Kotlin
* **IDE:** Android Studio
* **Core Components:**

  * AlarmManager
  * BroadcastReceiver
  * NotificationManager
  * PendingIntent
  * TimePickerDialog

---

## 📂 Project Structure

```
app/
 ┣ java/com/example/reminderapp/
 ┃ ┣ MainActivity.kt
 ┃ ┗ AlarmReceiver.kt
 ┣ res/layout/
 ┃ ┗ activity_main.xml
 ┗ AndroidManifest.xml
```

---

## 🚀 How It Works

1. User clicks **Set Reminder**
2. A **clock interface** appears (TimePicker)
3. User selects time ⏰
4. AlarmManager schedules the reminder
5. BroadcastReceiver triggers at the selected time
6. Notification is displayed 🔔
7. Clicking notification opens the app

---

## ⚙️ Setup & Run

1. Clone the repository
2. Open in Android Studio
3. Connect your device or emulator
4. Click **Run ▶️**

---

## 🧠 Learning Outcomes

* Understanding of AlarmManager scheduling
* Working with BroadcastReceiver
* Implementing Notifications
* Using PendingIntent
* Designing simple UI in Android

---

## 📌 Future Enhancements

* Multiple reminders support
* Custom notification sounds
* Dark mode UI 🌙
* Reminder history tracking

---

## 👨‍💻 Author

**Your Name Here**
*(Add your GitHub profile link here)*

---

## ⭐ Acknowledgement

This project is built as part of an Android Development assignment to demonstrate practical implementation of scheduling and notifications.

---

✨ *Stay productive. Stay consistent.* 📚
