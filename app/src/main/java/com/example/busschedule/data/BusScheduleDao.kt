package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface BusScheduleDao {

    @Query("SELECT * from Schedule WHERE stop_name = :stopName")
    fun getBusSchedulesByStopName(stopName: String): Flow<List<BusSchedule>>

    @Query("SELECT * from Schedule ORDER BY arrival_time ASC")
    fun getAllBusSchedules(): Flow<List<BusSchedule>>

}