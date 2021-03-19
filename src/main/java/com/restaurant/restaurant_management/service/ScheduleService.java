package com.restaurant.restaurant_management.service;
import java.util.Date;
import java.util.List;

import com.restaurant.restaurant_management.model.Schedule;

public interface ScheduleService {
	public List<Schedule> getAllSchedulesForDate(Date ScheduleDay);
	public List<Schedule> getSchedulebyEmployee(long emp_id);
	public List<Schedule> getAllSchedulesbetweenDates(Date periodStart,Date periodEnd);
	public void save(Schedule schedule);
	public void deleteSchedule(Long schedule_id);
}
