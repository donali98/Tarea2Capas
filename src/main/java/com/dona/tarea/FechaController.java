package com.dona.tarea;

import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FechaController {

    @RequestMapping(value="/dia", method=RequestMethod.GET)
    public @ResponseBody String getDayOfDate(HttpServletRequest request) {
        
        Integer day = Integer.parseInt(request.getParameter("dia"));
        Integer month = Integer.parseInt(request.getParameter("mes"));
        Integer year = Integer.parseInt(request.getParameter("anio"));

        LocalDate localDate = LocalDate.of(year, month,day);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        return dayOfWeek.name();
    }
}