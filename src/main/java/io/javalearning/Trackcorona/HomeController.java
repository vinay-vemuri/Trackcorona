package io.javalearning.Trackcorona;

import io.javalearning.Trackcorona.models.LocationStats;
import io.javalearning.Trackcorona.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;
    @GetMapping("/")
    public String Home(Model model){
         List<LocationStats> allStates = coronaVirusDataService.getAllstats();
         int totalReportedCases = allStates.stream().mapToInt(stat -> Integer.parseInt(stat.getLatestTotalCases())).sum();
        //int totalNewCases = allStates.stream().mapToInt(stat -> Integer.parseInt(stat)).sum();
         model.addAttribute("LocationStats",allStates);
        model.addAttribute("totalReportedCases",totalReportedCases);

        return "home";
    }
}
