package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow


class OfflineBusScheduleRepository(private val busScheduleDao: BusScheduleDao): BusScheduleRepository {

    override fun getAllBusSchedulesStream(): Flow<List<BusSchedule>> = busScheduleDao.getAllBusSchedules()

    override fun getBusSchedulesStreamByStopName(stopName: String): Flow<List<BusSchedule?>> = busScheduleDao.getBusSchedulesByStopName(stopName)

}