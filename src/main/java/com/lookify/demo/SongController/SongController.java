package com.lookify.demo.SongController;

import com.lookify.demo.SongService.SongService;
import com.lookify.demo.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SongController {
    private  final SongService songService;
    public SongController(SongService songService){
        this.songService=songService;

    }
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }


    @RequestMapping("/dashboard")
    public String showTable(@ModelAttribute("song") Song song, Model model){
        List<Song> allSong =songService.allSong();
        model.addAttribute("songs",allSong);
        return "dashboard.jsp";
    }

    @RequestMapping("songs/new")
    public String showFormAddSong(@ModelAttribute("song") Song song){
        return "new.jsp";
    }


    @RequestMapping(value = "/dashboard/addSong",method = RequestMethod.POST)
    public  String addNewSong(@Valid @ModelAttribute("song") Song song, BindingResult result){
        System.out.println("the rating is -->"+song.getRating());
        if (result.hasErrors()){
            return "songs/new";
        }
        else {
            System.out.println("the rating is -->"+song.getRating());
            songService.create(song);
            return "redirect:/dashboard";
        }


    }
}
