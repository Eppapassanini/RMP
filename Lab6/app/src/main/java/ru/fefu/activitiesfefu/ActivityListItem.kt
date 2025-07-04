package ru.fefu.activitiesfefu

import ru.fefu.activitiesfefu.data.ActivityType
import java.util.Date

sealed class ActivityListItem {
    data class Activity(
        val id: Int,
        val type: ActivityType,
        val startDate: Date,
        val endDate: Date,
        val distance: String,
        val duration: String
    ) : ActivityListItem()

    data class Section(val title: String) : ActivityListItem()
} 