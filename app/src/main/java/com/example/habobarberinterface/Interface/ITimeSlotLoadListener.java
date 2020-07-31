package com.example.habobarberinterface.Interface;

import com.example.habobarberinterface.Model.TimeSlot;

import java.util.List;

public interface ITimeSlotLoadListener {
    void onTimeSlotLoadSuccess(List<TimeSlot> timeSlot);
    void onTimeSlotLoadFailed(String message);
    void onTimeSlotLoadEmpty();
}
