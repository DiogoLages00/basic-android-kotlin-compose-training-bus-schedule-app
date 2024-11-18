package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow


interface BusScheduleRepository {

    fun getAllBusSchedulesStream(): Flow<List<BusSchedule>>

    fun getBusSchedulesStreamByStopName(stopName: String): Flow<List<BusSchedule?>>

}