package me.mexx.noskiapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Socks {
    private Size size;
    private Color color;
    @Min(value = 1)
    @Max(value = 100)
    private int cottonPart;

}
