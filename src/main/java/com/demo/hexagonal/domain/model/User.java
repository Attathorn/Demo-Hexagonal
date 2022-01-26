package com.demo.hexagonal.domain.model;

import com.demo.hexagonal.infrastracture.model.Location;
import com.demo.hexagonal.infrastracture.model.Name;
import com.demo.hexagonal.infrastracture.model.response.GetDataResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
    public User() {}
    private String name;
    private String gender;
    private String address;
    private String email;
    private String seed;

    public User (GetDataResponse dataUser) {
        var data = dataUser.getResults().stream().findFirst().get();

        this.name = getFullName(data.getName());
        this.gender = data.getGender();
        this.address = getAddress(data.getLocation());
        this.email = data.getEmail();
        this.seed = dataUser.getInfo().getSeed();
    }

    private String getFullName(Name name){
        StringBuilder fullName = new StringBuilder();
        fullName.append(name.getTitle())
                .append(" ")
                .append(name.getFirst())
                .append(" ")
                .append(name.getLast());

        return  fullName.toString();
    }

    private String getAddress(Location location){
        StringBuilder address = new StringBuilder();
        address.append(location.getStreet().getNumber())
                .append(", ")
                .append(location.getStreet().getName())
                .append(", ")
                .append(location.getCity())
                .append(", ")
                .append(location.getState())
                .append(" ")
                .append(location.getPostcode());
        return  address.toString();
    }
}
