package me.mexx.noskiapp.service;

import me.mexx.noskiapp.model.ArrivalSocks;
import me.mexx.noskiapp.model.Color;
import me.mexx.noskiapp.model.Size;
import me.mexx.noskiapp.model.Socks;

public interface ValidationService {
    boolean validate(ArrivalSocks arrivalSocks);

    boolean validate(Color color, Size size, int cottonMin, int cottonMax);
}
