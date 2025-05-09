package com.example.EventClean.core.entities;
import com.example.EventClean.core.enums.EventType;
import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        String identifier,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String location,
        Integer capacity,
        String organizer,
        EventType type
) {}
