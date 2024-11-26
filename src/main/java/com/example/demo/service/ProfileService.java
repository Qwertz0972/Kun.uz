package com.example.demo.service;

import com.example.demo.dto.ProfileDto;
import com.example.demo.model.Profile;
import com.example.demo.model.Result;
import com.example.demo.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> getAll(){
        List<Profile> all = profileRepository.findAll();
        return all;
    }

    public Profile getById(Long id){
        return profileRepository.findById(id).get();
    }

    public Result add(ProfileDto profileDto){
        boolean exists = profileRepository.exitstsByEmailAndPhone(profileDto.getEmail(), profileDto.getPhone());
        if(exists){
            return new Result(false,"Already exists");
        }
        Profile profile = new Profile();
        profile.setFirstname(profileDto.getFirstname());
        profile.setSurname(profileDto.getSurname());
        profile.setEmail(profileDto.getEmail());
        profile.setPhone(profileDto.getPhone());
        profile.setPassword(profileDto.getPassword());
        profile.setStatus(profileDto.getStatus());
        profile.setRole(profileDto.getRole());
        profile.setVisible(profileDto.getVisible());
        profile.setCreted_date(profileDto.getCreted_date());
        profile.setPhone(profileDto.getPhone());
        profileRepository.save(profile);
        return new Result(true,"Profile added successfully");
    }

    public Result edit(Long id,ProfileDto profileDto){
        Optional<Profile> profileOptional = profileRepository.findById(id);

        if(profileOptional.isPresent()){
            Profile profile = profileOptional.get();
            profile.setFirstname(profileDto.getFirstname());
            profile.setSurname(profileDto.getSurname());
            profile.setEmail(profileDto.getEmail());
            profile.setPhone(profileDto.getPhone());
            profile.setPassword(profileDto.getPassword());
            profile.setStatus(profileDto.getStatus());
            profile.setRole(profileDto.getRole());
            profile.setVisible(profileDto.getVisible());
            profile.setCreted_date(profileDto.getCreted_date());
            profile.setPhone(profileDto.getPhone());
            profileRepository.save(profile);
            return new Result(true,"Profile edited successfully");
        }
        return new Result(false,"Profile not found");
    }

    public Result delete(Long id){
        profileRepository.deleteById(id);
        return new Result(true,"Profile deleted successfully");
    }
}
