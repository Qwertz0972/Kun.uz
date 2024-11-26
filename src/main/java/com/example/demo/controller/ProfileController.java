package com.example.demo.controller;

import com.example.demo.dto.ProfileDto;
import com.example.demo.model.Profile;
import com.example.demo.model.Result;
import com.example.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @PostMapping()
    public Result add(@RequestBody ProfileDto profileDto) {
        return profileService.add(profileDto);
    }

    @GetMapping()
    public List<Profile> getAll(){
        return profileService.getAll();
    }

    @GetMapping("/{id}")
    public Profile getById(@PathVariable Long id) {
        return profileService.getById(id);
    }

    @PutMapping("/{id}")
    public Result edit(@PathVariable Long id, @RequestBody ProfileDto profileDto) {
        return profileService.edit(id, profileDto);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        return profileService.delete(id);
    }
}
