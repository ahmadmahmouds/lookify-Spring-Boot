package com.lookify.demo.SongService;

import com.lookify.demo.SongRepository.SongRepository;
import com.lookify.demo.models.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private  final SongRepository songRepository;


    public SongService(SongRepository songRepository){
        this.songRepository=songRepository;
    }


    public List<Song> allSong(){
       return songRepository.findAll();

    }

    public List<Song> search(String artist){
        return songRepository.findByArtistContaining(artist);
    }

    public Song create(Song song){
      return   songRepository.save(song);
    }



}
